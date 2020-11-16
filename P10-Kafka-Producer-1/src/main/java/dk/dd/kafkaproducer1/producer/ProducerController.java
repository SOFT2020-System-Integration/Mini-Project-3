package dk.dd.kafkaproducer1.producer;

import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/kafka")
public class ProducerController
{
      @Autowired
      private ProducerService service;

      @Autowired
      private MailService mailService;

      
      @Autowired
      private ProducerServiceCallBack serviceCallBack;
      
      // Option 1:
      @PostMapping(value = "/message/{message}")
      public String sendMyMessageToKafka(@PathVariable("message") String message)
      {
            service.sendMessage(message);
            return "Message published: " + message;
      }
      
      // Option 2: Sending message with an async callback
      @PostMapping(value = "/message/callback/{message}")
      public String sendMyMessageCallBack(@PathVariable("message") String message) {
            serviceCallBack.sendMessageCallBack(message);
            return "Message published: " + message;


      }
      @PostMapping(value = "/spam")
      public String sendAllEmails() throws SAXException, ParserConfigurationException, ParseException, IOException {
            mailService.createMails();
            return "Messages has been sent to the mails in our people.json file. This is pretty Smart isn't it";
      }


}
