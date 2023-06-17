package MateAcademy.DailyTask.src.main.java.core.basesyntax.strategy.handler;


import MateAcademy.DailyTask.src.main.java.core.basesyntax.db.Storage;
import MateAcademy.DailyTask.src.main.java.core.basesyntax.model.FruitTransaction;

public class PurchaseHandler implements OperationHandler {
    @Override
    public void operate(FruitTransaction transaction) {
        Integer storageQuantity = Storage.fruits.get(transaction.getFruit());
        int purchaseQuantity = transaction.getQuantity();
        if (purchaseQuantity <= storageQuantity && purchaseQuantity > 0) {
            int updateQuantity = storageQuantity - purchaseQuantity;
            Storage.fruits.put(transaction.getFruit(), updateQuantity);
        } else {
            throw new IllegalArgumentException("Invalid purchase Quantity" + purchaseQuantity);
        }
    }
}
