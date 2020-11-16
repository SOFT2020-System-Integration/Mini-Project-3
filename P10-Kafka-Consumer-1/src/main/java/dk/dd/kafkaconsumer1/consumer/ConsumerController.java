package dk.dd.kafkaconsumer1.consumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kafka")
public class ConsumerController {

    @Autowired
    private ConsumerService service;

    // Option 1:
    @GetMapping("/all")
    public List<String> sendMyMessageToKafka()
    {
        return service.getMessages();

    }

}
