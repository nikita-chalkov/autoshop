package main.history;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Setter
@Getter
public class HistorySaleDTO {
    //фамилия и имя клиента, контактный номер, стоимость заказа, дата заказа, модель автомобиля, количество автомобилей в заказе
    String clientFio;
    String clientPhone;
    Long price;
    Date date;
    String automobileName;
    Long count;
}
