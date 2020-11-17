package dk.dd.kafkaconsumer1.consumer;

import com.fasterxml.jackson.core.JsonToken;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class ConsumerService

{
      private final List<String> messages = new ArrayList<>();


      // get logger for my class
      private static final Logger logger = LoggerFactory.getLogger(ConsumerService.class);
      
      @KafkaListener(topics = "message-topic", groupId = "my-group")
      public void consume(String message) throws IOException
      {
            logger.info("&&& Message [{}] consumed", message);
      }

      @KafkaListener(topics = "message-topicc", groupId = "my-group")
      public void consume1(String message) throws IOException
      {
            logger.info("&&& Message [{}] consumed", message);
      }

      @KafkaListener(topics = "message-topic", groupId = "my-group")
      public void listenToMessages(String message) throws IOException{
            synchronized (messages){
                  messages.add(message);
            }
            for (String mymessage : messages) {
                  logger.info("&&& Message Consumed: [" + mymessage + "]");

            }
      }

      public List<String> getMessages() {
            return messages;
      }
}

      
