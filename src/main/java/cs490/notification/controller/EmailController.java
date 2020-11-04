package cs490.notification.controller;

import cs490.notification.dto.EmailContentDto;
import cs490.notification.dto.OrderDto;
import cs490.notification.service.EmailService;
import lombok.AllArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@AllArgsConstructor
@RestController
public class EmailController {

    //    @Autowired
    EmailService emailService;

    //    KafkaTemplate<String, EmailContentDto> producer;
    KafkaTemplate<String, OrderDto> producerOrder;
    KafkaTemplate<Object, Object> producer;


    @PostMapping("/notify")
    public void sendMail() {

//
//        for (int i = 0; i <= 3; i++) {
//            OrderDto orderDto = new OrderDto("first name", "last name", "test@email.com" + i, i);
//            template.send("order-created", orderDto);
//        }
//
//        OrderDto  orderDto = new OrderDto();
//        List<OrderItemDto> items = new ArrayList<>();
//
//        items.add(new OrderItemDto(1L,1L, 1L, "p1", 10.00, 10));
//        items.add(new OrderItemDto(2L,2L, 2L, "p1", 20.00, 20));
//        items.add(new OrderItemDto(3L,3L, 3L, "p1", 30.00, 30));
//
//        orderDto.setFirstName("First Name");
//        orderDto.setLasName("Last Name");
//        orderDto.setEmail("test@gmail.com");
//        orderDto.setItems(items);
//
//
//        producer.send("Test",orderDto);


        List<EmailContentDto> emails = new ArrayList<>();
        emails.add(EmailContentDto.builder().from("test1").subject("subject 1").content("content 1").to("luis.thong.phan@gmail.com").build());
        emails.add(EmailContentDto.builder().from("test2").subject("subject 2").content("content 2").to("luis.thong.phan@gmail.com").build());
        emails.add(EmailContentDto.builder().from("test3").subject("subject 3").content("content 3").to("luis.thong.phan@gmail.com").build());


        producer.send("Test", emails);


    }

}
