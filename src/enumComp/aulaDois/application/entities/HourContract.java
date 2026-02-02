package enumComp.aulaDois.application.entities;

import java.time.LocalDate;

public class HourContract {
    private LocalDate date;
    private Double valueHour;
    private Integer hours;

    public HourContract(LocalDate date, Double valueHour, Integer hours) {
        this.date = date;
        this.valueHour = valueHour;
        this.hours = hours;
    }

    public Double getValueHour() {
        return valueHour;
    }

    public Integer getHours() {
        return hours;
    }

    public LocalDate getDate() {
        return date;
    }

    public double totalValue() {
        return valueHour * hours;
    }
}
