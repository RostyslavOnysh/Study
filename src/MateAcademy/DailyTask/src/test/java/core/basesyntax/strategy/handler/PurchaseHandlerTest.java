/*package MateAcademy.DailyTask.src.test.java.core.basesyntax.strategy.handler;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import core.basesyntax.db.Storage;
import core.basesyntax.model.FruitTransaction;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class PurchaseHandlerTest {
    private static OperationHandler operationHandler;
    private static final String BANANA = "banana";
    private static final int INITIAL_QUANTITY = 10;
    private static final int ILLEGAL_NEGATIVE_QUANTITY = -5;

    @BeforeAll
    static void beforeAll() {
        operationHandler = new PurchaseHandler();
    }

    @AfterEach
    void afterEach() {
        Storage.fruits.clear();
    }

    @Test
    public void handleFruitOperation_purchase_ok() {
        Storage.fruits.put(BANANA, INITIAL_QUANTITY);
        FruitTransaction fruitTransaction = new FruitTransaction(
                FruitTransaction.Operation.PURCHASE, BANANA, INITIAL_QUANTITY);
        operationHandler.operate(fruitTransaction);
        Integer expected = 0;
        assertEquals(expected, Storage.fruits.get(BANANA));
    }

    @Test
    void handleFruitOperation_purchase_negativeQuantity_notOk() {
        Storage.fruits.put(BANANA, INITIAL_QUANTITY);
        FruitTransaction fruitTransaction = new FruitTransaction(
                FruitTransaction.Operation.PURCHASE, BANANA, ILLEGAL_NEGATIVE_QUANTITY);
        assertThrows(IllegalArgumentException.class,
                () -> operationHandler.operate(fruitTransaction));
        assertEquals(INITIAL_QUANTITY, Storage.fruits.get(BANANA));
    }

    @Test
    public void handleFruitOperation_purchase_illegalQuantity() {
        Storage.fruits.put(BANANA, INITIAL_QUANTITY);
        FruitTransaction fruitTransaction = new FruitTransaction(
                FruitTransaction.Operation.PURCHASE, BANANA, 0);
        assertThrows(IllegalArgumentException.class,
                () -> operationHandler.operate(fruitTransaction));
        assertEquals(INITIAL_QUANTITY, Storage.fruits.get(BANANA));
    }
}


 */