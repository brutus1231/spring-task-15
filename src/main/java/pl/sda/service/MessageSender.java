package pl.sda.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@RequiredArgsConstructor
public class MessageSender {

    private final WorkDayCalculator workDayCalculator;

    public void send(String message, Date date) {
        if (workDayCalculator.isWorkingDay(date)) {
            System.out.println("Wysłano wiadomość: " + message);
            return;
        }
        System.out.println("Dzień nie jest dniem roboczym");
    }
}
