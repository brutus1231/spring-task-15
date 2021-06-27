package pl.sda.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@Primary
public class HolidayCalculator implements DayCalculator {

    @Override
    public boolean isCorrect(LocalDate date) {
        return false;
    }
}
