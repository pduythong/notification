package cs490.notification.dto;

import lombok.AllArgsConstructor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class OrderItemDto {
    Long orderId;
    Long productId;
    Long vendorId;
    String productName;
    double unitPrice;
    int quantity;
}
