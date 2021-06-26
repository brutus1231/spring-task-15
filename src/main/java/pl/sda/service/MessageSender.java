package pl.sda.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class MessageSender {

    private final DayCalculator calculator;

    public MessageSender(@Qualifier("workDayCalculator")
                                 DayCalculator calculator) {
        this.calculator = calculator;
    }

    public void send(String message, LocalDate date) {
        System.out.println(calculator.getClass().getName());
        if (calculator.isCorrect(date)) {
            System.out.println("Wysłano wiadomość: " + message);
            return;
        }
        System.out.println("Dzień nie jest dniem roboczym");
    }

//    @Autowired
//    public void setWorkDayCalculator(WorkDayCalculator workDayCalculator){
//        this.workDayCalculator = workDayCalculator
//    }

}
