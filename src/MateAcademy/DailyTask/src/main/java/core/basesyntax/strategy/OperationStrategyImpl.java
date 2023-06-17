package MateAcademy.DailyTask.src.main.java.core.basesyntax.strategy;


import MateAcademy.DailyTask.src.main.java.core.basesyntax.model.FruitTransaction;
import MateAcademy.DailyTask.src.main.java.core.basesyntax.strategy.handler.OperationHandler;

import java.util.Map;

public class OperationStrategyImpl implements OperationStrategy {
    private final Map<FruitTransaction.Operation, OperationHandler> operationOperationStrategyMap;

    public OperationStrategyImpl(Map<FruitTransaction.Operation,
            OperationHandler> operationOperationStrategyMap) {
        this.operationOperationStrategyMap = operationOperationStrategyMap;
    }

    @Override
    public OperationHandler getHandler(FruitTransaction.Operation operation) {
        return operationOperationStrategyMap.get(operation);
    }
}
