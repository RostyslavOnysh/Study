package MateAcademy.DailyTask.src.main.java.core.basesyntax.strategy.handler;

import core.basesyntax.db.Storage;
import core.basesyntax.model.FruitTransaction;

public class BalanceHandler implements OperationHandler {
    @Override
    public void operate(FruitTransaction transaction) {
        if (transaction.getQuantity() < 0) {
            throw new IllegalArgumentException("Invalid quantity: " + transaction.getQuantity());
        }
        Storage.fruits.put(transaction.getFruit(), transaction.getQuantity());
    }
}
