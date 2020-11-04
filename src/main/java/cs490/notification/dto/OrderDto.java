package cs490.notification.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderDto {
    Long orderNumber;
    String firstName;
    String lasName;
    String email;
    Double total;
    List<OrderItemDto> items;
}
