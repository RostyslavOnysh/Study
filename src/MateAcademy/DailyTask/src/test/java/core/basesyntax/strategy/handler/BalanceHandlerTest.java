/*package MateAcademy.DailyTask.src.test.java.core.basesyntax.strategy.handler;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import core.basesyntax.db.Storage;
import core.basesyntax.model.FruitTransaction;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class BalanceHandlerTest {
    private static OperationHandler operationHandler;
    private static final String APPLE = "apple";
    private static final String BANANA = "banana";
    private static final int DEFAULT_QUANTITY = 5;
    private static final int NEGATIVE_QUANTITY = -5;
    private static final int ZERO_QUANTITY = 0;

    @BeforeAll
    static void beforeAll() {
        operationHandler = new BalanceHandler();
    }

    @AfterEach
    void afterEach() {
        Storage.fruits.clear();
    }

    @Test
    void balanceHanlde_addFruitZeroQuantity_ok() {
        FruitTransaction fruitTransaction = new FruitTransaction(
                FruitTransaction.Operation.BALANCE, APPLE, ZERO_QUANTITY);
        operationHandler.operate(fruitTransaction);
        Integer actualQuantity = Storage.fruits.getOrDefault(APPLE, ZERO_QUANTITY);
        assertEquals(ZERO_QUANTITY, actualQuantity);
    }

    @Test
    void balanceHandle_addFruitNegativeQuantity_notOK() {
        FruitTransaction fruitTransaction =
                new FruitTransaction(FruitTransaction.Operation.BALANCE, BANANA, NEGATIVE_QUANTITY);
        assertThrows(IllegalArgumentException.class,
                () -> operationHandler.operate(fruitTransaction));
    }

    @Test
    void balanceHandle_addFruitToStorage_ok() {
        FruitTransaction fruitTransaction =
                new FruitTransaction(FruitTransaction.Operation.BALANCE, APPLE, DEFAULT_QUANTITY);
        operationHandler.operate(fruitTransaction);
        Integer actual = Storage.fruits.getOrDefault(APPLE, DEFAULT_QUANTITY);
        assertEquals(DEFAULT_QUANTITY, actual);
    }

    @Test
    void balanceHandle_addNullTransaction_notOk() {
        FruitTransaction transaction = new FruitTransaction(
                FruitTransaction.Operation.BALANCE,
                BANANA,
                NEGATIVE_QUANTITY);
        assertThrows(IllegalArgumentException.class, () -> operationHandler.operate(transaction));
    }
}


 */