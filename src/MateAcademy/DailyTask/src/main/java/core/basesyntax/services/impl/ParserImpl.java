package MateAcademy.DailyTask.src.main.java.core.basesyntax.services.impl;


import MateAcademy.DailyTask.src.main.java.core.basesyntax.model.FruitTransaction;
import MateAcademy.DailyTask.src.main.java.core.basesyntax.services.interfaces.ParserService;

import java.util.ArrayList;
import java.util.List;

public class ParserImpl implements ParserService {
    private static final String CSV_SEPARATOR = ",";
    private static final int TYPE_POSITION = 0;
    private static final int FRUIT_NAME_INDEX = 1;
    private static final int DEFAULT_POSITION = 1;
    private static final int QUANTITY_INDEX = 2;

    @Override
    public List<FruitTransaction> parser(List<String> stringList) {
        List<FruitTransaction> fruitTransactions = new ArrayList<>();
        for (int i = DEFAULT_POSITION; i < stringList.size(); i++) {
            String[] parse = stringList.get(i).split(CSV_SEPARATOR);
            FruitTransaction.Operation operation
                    = FruitTransaction.Operation.getByValue(parse[TYPE_POSITION]);
            String fruit = parse[FRUIT_NAME_INDEX];
            int quantity = Integer.parseInt(parse[QUANTITY_INDEX]);
            fruitTransactions.add(new FruitTransaction(operation, fruit, quantity));
        }
        return fruitTransactions;
    }
}
