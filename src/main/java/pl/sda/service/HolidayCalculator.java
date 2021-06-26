package pl.sda.service;

import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class HolidayCalculator implements DayCalculator {

    public boolean isHoliday(LocalDate date) {
        return false;
    }
}
