package sender.component;

import lombok.AllArgsConstructor;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class AMQPSender {

    private RabbitTemplate rabbitTemplate;

    private Queue queue;

    public void send(String msg){
        rabbitTemplate.convertAndSend(this.queue.getName(), msg);
    }
}
