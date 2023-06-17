package MateAcademy.DailyTask.src.main.java.core.basesyntax.strategy.handler;


import MateAcademy.DailyTask.src.main.java.core.basesyntax.db.Storage;
import MateAcademy.DailyTask.src.main.java.core.basesyntax.model.FruitTransaction;

public class SupplyHandler implements OperationHandler {
    @Override
    public void operate(FruitTransaction transaction) {
        String fruit = transaction.getFruit();
        int quantity = transaction.getQuantity();
        if (quantity < 0) {
            throw new IllegalArgumentException("Invalid quantity: " + quantity);
        }
        Storage.fruits.merge(fruit, quantity, Integer::sum);
    }
}
