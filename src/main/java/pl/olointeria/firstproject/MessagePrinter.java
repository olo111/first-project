package pl.olointeria.firstproject;

//public class MessagePrinter {
//    private final SimpleMessageProducer messageProducer;
//
//    public MessagePrinter(SimpleMessageProducer messageProducer) {
//        this.messageProducer = messageProducer;
//    }
//
//    public void printMessage() {
//        String message = messageProducer.getMessage();
//        System.out.println(message);
//    }


import org.springframework.stereotype.Service;
import pl.olointeria.firstproject.producer.MessageProducer;

import java.util.function.Function;

@Service
public class MessagePrinter {

    private final MessageProducer messageProducer;
    private final MessagePrinterConfig printerConfig;

    public MessagePrinter(MessageProducer messageProducer, MessagePrinterConfig printerConfig) {
        this.messageProducer = messageProducer;
        this.printerConfig = printerConfig;
    }

    public void printMessage() {
        String message = messageProducer.getMessage();
        Function<String, String> decorator = printerConfig.getDecorator();
        String decoratedMessage = decorator.apply(message);
        System.out.println(decoratedMessage);
    }
}
