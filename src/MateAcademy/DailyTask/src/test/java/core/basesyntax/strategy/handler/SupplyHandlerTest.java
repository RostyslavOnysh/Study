/*package MateAcademy.DailyTask.src.test.java.core.basesyntax.strategy.handler;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import core.basesyntax.db.Storage;
import core.basesyntax.model.FruitTransaction;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class SupplyHandlerTest {

    private static OperationHandler operationHandler;
    private static final String BANANA = "banana";
    private static final String APPLE = "apple";
    private static final int NEGATIVE_QUANTITY = -5;
    private static final int DEFAULT_VALUE = 8;
    private static final int QUANTITY = 3;
    private static final int ZERO = 0;

    @BeforeAll
    static void beforeAll() {
        operationHandler = new SupplyHandler();
    }

    @AfterEach
    public void afterEach() {
        Storage.fruits.clear();
    }

    @Test
    void supplyHandler_addToEmptyFruitStorage_ok() {
        FruitTransaction transaction = new FruitTransaction(
                FruitTransaction.Operation.SUPPLY,
                APPLE,
                DEFAULT_VALUE);
        operationHandler.operate(transaction);
        Integer actualQuantity = Storage.fruits.getOrDefault(APPLE, ZERO);
        assertEquals(DEFAULT_VALUE, actualQuantity);
    }

    @Test
    void supplyHandler_addNegativeQuantity_notOk() {
        assertThrows(IllegalArgumentException.class, () -> {
            FruitTransaction transaction = new FruitTransaction(
                    FruitTransaction.Operation.SUPPLY,
                    BANANA,
                    NEGATIVE_QUANTITY);
            operationHandler.operate(transaction);
        });
    }

    @Test
    void supplyHandler_addToFruitStorageForNullFruitTransaction_notOk() {
        assertThrows(NullPointerException.class, () -> operationHandler.operate(null));
    }

    @Test
    void supplyHandler_addMultipleFruits_ok() {
        FruitTransaction transaction1 = new FruitTransaction(
                FruitTransaction.Operation.SUPPLY,
                APPLE,
                DEFAULT_VALUE);
        FruitTransaction transaction2 = new FruitTransaction(
                FruitTransaction.Operation.SUPPLY,
                BANANA,
                QUANTITY);
        operationHandler.operate(transaction1);
        operationHandler.operate(transaction2);
        Integer actualAppleQuantity = Storage.fruits.getOrDefault(APPLE, ZERO);
        Integer actualBananaQuantity = Storage.fruits.getOrDefault(BANANA, ZERO);
        assertEquals(DEFAULT_VALUE, actualAppleQuantity);
        assertEquals(QUANTITY, actualBananaQuantity);
    }
}


 */