package sender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import sender.component.AMQPSender;

import java.time.LocalDateTime;

@Component
@EnableScheduling
public class CreaterMensagemTest {

    @Autowired
    AMQPSender amqpSender;

    @Scheduled(cron = "*/1 * * * * *")
    public void teste(){
        amqpSender.send("teste data: " + LocalDateTime.now());
    }
}
