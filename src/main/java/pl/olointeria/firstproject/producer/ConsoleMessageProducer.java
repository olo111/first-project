package pl.olointeria.firstproject.producer;


import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import pl.olointeria.firstproject.producer.MessageProducer;

import java.util.Scanner;

@Service
//@Primary
    @Profile("console")
 class ConsoleMessageProducer implements MessageProducer {
    private final Scanner scanner;

    public ConsoleMessageProducer(Scanner scanner) {
        this.scanner = scanner;
    }

   @Override
   public String getMessage(){
       //Scanner scanner = new Scanner(System.in);
       System.out.println("Enter text to print:");
       return scanner.nextLine();
   }
}
