package MateAcademy.DailyTask.src.main.java.core.basesyntax.strategy;


import MateAcademy.DailyTask.src.main.java.core.basesyntax.model.FruitTransaction;
import MateAcademy.DailyTask.src.main.java.core.basesyntax.strategy.handler.OperationHandler;

public interface OperationStrategy {
    OperationHandler getHandler(FruitTransaction.Operation operation);
}
