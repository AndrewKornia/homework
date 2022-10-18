package home_work_6.pizzeria;

import home_work_1.PriorityOperation;
import home_work_6.api.IStage;

import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Стадии заказа
 */
public class Stage implements IStage {

   private String description ;
   private LocalDateTime timeDescription;

    public Stage(String description, LocalDateTime timeDescription) {
        this.description = description;
        this.timeDescription = timeDescription;
    }

    public Stage(String description) {
        this.description = description;
        this.timeDescription = LocalDateTime.now();
    }

    /**
     * Возвращает название стадии
     * @return стадию
     */
    @Override
    public String getDescription() {
        return null;
    }

    /**
     * Возвращает время стадии заказа
     * @return время
     */
    @Override
    public LocalDateTime getTime() {
        return null;
    }
}
