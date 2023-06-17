package MateAcademy.DailyTask.src.main.java.core.basesyntax;


import MateAcademy.DailyTask.src.main.java.core.basesyntax.model.FruitTransaction;
import MateAcademy.DailyTask.src.main.java.core.basesyntax.services.impl.FileReaderServiceImpl;
import MateAcademy.DailyTask.src.main.java.core.basesyntax.services.impl.ParserImpl;
import MateAcademy.DailyTask.src.main.java.core.basesyntax.services.impl.ReportInfoServiceImpl;
import MateAcademy.DailyTask.src.main.java.core.basesyntax.services.impl.WriteToFileServiceImpl;
import MateAcademy.DailyTask.src.main.java.core.basesyntax.services.interfaces.FileReaderService;
import MateAcademy.DailyTask.src.main.java.core.basesyntax.services.interfaces.ParserService;
import MateAcademy.DailyTask.src.main.java.core.basesyntax.services.interfaces.ReportInfoService;
import MateAcademy.DailyTask.src.main.java.core.basesyntax.services.interfaces.WriteToFileService;
import MateAcademy.DailyTask.src.main.java.core.basesyntax.strategy.OperationStrategy;
import MateAcademy.DailyTask.src.main.java.core.basesyntax.strategy.OperationStrategyImpl;
import MateAcademy.DailyTask.src.main.java.core.basesyntax.strategy.handler.BalanceHandler;
import MateAcademy.DailyTask.src.main.java.core.basesyntax.strategy.handler.OperationHandler;
import MateAcademy.DailyTask.src.main.java.core.basesyntax.strategy.handler.PurchaseHandler;
import MateAcademy.DailyTask.src.main.java.core.basesyntax.strategy.handler.ReturnHandler;
import MateAcademy.DailyTask.src.main.java.core.basesyntax.strategy.handler.SupplyHandler;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    private static final File INPUT_FILE = new File("src/main/resources/input.csv");
    private static final File REPORT = new File("src/main/resources/report.csv");

    public static void main(String[] args) {
        Map<FruitTransaction.Operation, OperationHandler>
                operationOperationStrategyMap = new HashMap<>();
        operationOperationStrategyMap.put(FruitTransaction.Operation.BALANCE,
                new BalanceHandler());
        operationOperationStrategyMap.put(FruitTransaction.Operation.PURCHASE,
                new PurchaseHandler());
        operationOperationStrategyMap.put(FruitTransaction.Operation.RETURN,
                new ReturnHandler());
        operationOperationStrategyMap.put(FruitTransaction.Operation.SUPPLY,
                new SupplyHandler());
        OperationStrategy strategy = new OperationStrategyImpl(operationOperationStrategyMap);

        FileReaderService reader = new FileReaderServiceImpl();
        ParserService parserService = new ParserImpl();
        List<String> dataFromFile = reader.readFromFile(INPUT_FILE);
        List<FruitTransaction> fruitTransactions = parserService.parser(dataFromFile);
        for (FruitTransaction fruitTransaction : fruitTransactions) {
            OperationHandler operationHandler = strategy
                    .getHandler(fruitTransaction.getOperation());
            operationHandler.operate(fruitTransaction);
        }
        ReportInfoService reportInfoService = new ReportInfoServiceImpl();
        String reportText = reportInfoService.createReportInfo();
        WriteToFileService writeToFileService = new WriteToFileServiceImpl();
        writeToFileService.writeReportToFile(reportText, REPORT);
    }
}
