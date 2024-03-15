package behavior;

import units.Person;
import java.util.ArrayList;
/**
 * Интерфейс взаимодействия персонажей
 */
public interface ActionInterface {
    /**
     * Один шаг действия персонажа
     * @param enemies Список его врагов
     */
    void step(ArrayList<Person> enemies);
}
