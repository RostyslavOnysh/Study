package MateAcademy.DailyTask.src.main.java.core.basesyntax.strategy.handler;


import MateAcademy.DailyTask.src.main.java.core.basesyntax.db.Storage;
import MateAcademy.DailyTask.src.main.java.core.basesyntax.model.FruitTransaction;

public class ReturnHandler implements OperationHandler {
    @Override
    public void operate(FruitTransaction transaction) {
        int returnQuantity = transaction.getQuantity();
        if (returnQuantity >= 0) {
            Storage.fruits.merge(transaction.getFruit(), returnQuantity, Integer::sum);
        } else {
            throw new IllegalArgumentException("Illegal return quantity: " + returnQuantity);
        }
    }
}
