package pl.sda.service;

import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class WorkDayCalculator {

    public boolean isWorkingDay(LocalDate date) {
        return date.getDayOfWeek().getValue() <= 5;
    }

}
