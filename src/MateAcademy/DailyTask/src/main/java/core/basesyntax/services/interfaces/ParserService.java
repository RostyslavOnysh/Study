package MateAcademy.DailyTask.src.main.java.core.basesyntax.services.interfaces;


import MateAcademy.DailyTask.src.main.java.core.basesyntax.model.FruitTransaction;

import java.util.List;

public interface ParserService {
    List<FruitTransaction> parser(List<String> stringList);
}
