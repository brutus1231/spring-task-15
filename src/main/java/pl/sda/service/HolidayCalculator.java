package pl.sda.service;

import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class HolidayCalculator implements DayCalculator {

    @Override
    public boolean isCorrect(LocalDate date) {
        return false;
    }
}
