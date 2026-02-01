package enumComp.aulaUm.entities;

import enumComp.aulaUm.entities.enums.OrderStatus;

import java.time.LocalDate;

public class Order {

    private int ID;
    private LocalDate date;
    private OrderStatus orderStats;

    public Order(int ID, LocalDate date, OrderStatus orderStats) {
        this.ID = ID;
        this.date = date;
        this.orderStats = orderStats;
    }

    public String toString() {
        return "ID " + ID + " data: " + date + " Status = " + orderStats;
    }
}
