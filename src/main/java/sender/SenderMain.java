package sender;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import sender.component.AMQPSender;

@SpringBootApplication
@EnableRabbit
public class SenderMain {

    public static void main(String[] args) {
        SpringApplication.run(SenderMain.class, args);
    }

    @Bean
    public Queue queue() {
        return new Queue("TesteFelipe", true);
    }

    @Autowired
    AMQPSender amqpSender;

    @Bean
    CommandLineRunner test() {
        return args -> amqpSender.send("teste de envio");
    }

}
