package MateAcademy.DailyTask.src.test.java.core.basesyntax.strategy.handler;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import core.basesyntax.db.Storage;
import core.basesyntax.model.FruitTransaction;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ReturnHandlerTest {
    private static OperationHandler operationHandler;
    private static final String BANANA = "banana";
    private static final String APPLE = "apple";
    private static final int NEGATIVE_QUANTITY = -5;
    private static final int DEFAULT_VALUE = 8;
    private static final int QUANTITY = 3;
    private static final int ZERO = 0;

    @BeforeAll
    static void beforeAll() {
        operationHandler = new ReturnHandler();
    }

    @AfterEach
    public void afterEach() {
        Storage.fruits.clear();
    }

    @Test
    void returnHandl_addNegativeQuantity_notOk() {
        assertThrows(IllegalArgumentException.class,
                () -> operationHandler.operate(
                        new FruitTransaction(
                                FruitTransaction.Operation.RETURN, BANANA, NEGATIVE_QUANTITY)));
    }

    @Test
    void returnHandl_addEmptyFruitStorage_ok() {
        Storage.fruits.put(BANANA, DEFAULT_VALUE);
        FruitTransaction fruitTransaction = new FruitTransaction(
                FruitTransaction.Operation.RETURN, APPLE, DEFAULT_VALUE);
        operationHandler.operate(fruitTransaction);
        Integer actualQuantity = Storage.fruits.getOrDefault(APPLE, ZERO);
        assertEquals(DEFAULT_VALUE, actualQuantity);
    }

    @Test
    public void handle_addToNotEmptyFruitStorage_ok() {
        Storage.fruits.put(BANANA, DEFAULT_VALUE);
        FruitTransaction transaction = new FruitTransaction(
                FruitTransaction.Operation.RETURN,
                BANANA,
                QUANTITY);
        operationHandler.operate(transaction);
        int expectedBananaQuantity = DEFAULT_VALUE + QUANTITY;
        Integer actualBananaQuantity = Storage.fruits.getOrDefault(BANANA, ZERO);
        assertEquals(expectedBananaQuantity, actualBananaQuantity);
    }

    @Test
    public void handle_addToExistingFruitStorageWithNegativeQuantity_ok() {
        Storage.fruits.put(BANANA, NEGATIVE_QUANTITY);
        FruitTransaction transaction = new FruitTransaction(
                FruitTransaction.Operation.RETURN,
                "banana",
                DEFAULT_VALUE);
        operationHandler.operate(transaction);
        int expectedBananaQuantity = NEGATIVE_QUANTITY + DEFAULT_VALUE;
        Integer actualBananaQuantity = Storage.fruits.getOrDefault(BANANA, ZERO);
        assertEquals(expectedBananaQuantity, actualBananaQuantity);
    }
}
