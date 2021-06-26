package pl.sda;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.sda.config.ApplicationConfiguration;
import pl.sda.service.MessageSender;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        MessageSender messageSender = context.getBean(MessageSender.class);
        messageSender.send("Hello world", LocalDate.now());
    }
}
