package pl.olointeria.firstproject;

//public class Main {
//    public static void main(String[] args) {
//       // MessagePrinter messagePrinter = new MessagePrinter();
//       // messagePrinter.printMessage();
//
//        SimpleMessageProducer messageProducer = new SimpleMessageProducer();
//        MessagePrinter firstMessagePrinter = new MessagePrinter(messageProducer);
//        MessagePrinter secondMessagePrinter = new MessagePrinter(messageProducer);
//        firstMessagePrinter.printMessage();
//        secondMessagePrinter.printMessage();
//    }
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import java.util.Scanner;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        //Metoda SpringApplication.run() służy do rozruchu (ang. bootstrap) aplikacji.
        ConfigurableApplicationContext context = SpringApplication.run(Main.class);
       // MessagePrinter messagePrinter = context.getBean(MessagePrinter.class);
       // messagePrinter.printMessage();
        MessageController messageController = context.getBean(MessageController.class);
        messageController.mainLoop();

    }
    @Bean
    Scanner scanner() {
        return new Scanner(System.in);
    }
}
