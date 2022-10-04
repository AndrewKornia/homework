package home_work_6.api;

import java.util.List;

/**
 * Статус заказа выданный по определенному квитку
 */
public interface IOrderStatus {
    /**
     * По какомы  квитку мы получили статус
     * @return
     */
    ITicket getTicket();

    /**
     * Полчучить список пройдееый этапов
     * @return пройденый этапы заказа
     */
    List<IStage> getHistory();

    /**
     * Признак готовеости заказа
     * @return true -готов , false - неготов
     */
    boolean isDone();




}
