package sender.component;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class AMQPConsumer {
    @RabbitListener(queues = "TesteFelipe")
    public void receive(@Payload String msq) {
        System.out.println("Mensagem: " + msq);
    }
}
