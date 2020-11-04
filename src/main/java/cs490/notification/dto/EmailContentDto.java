package cs490.notification.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmailContentDto {
    private String from;
    private String to;
    private String subject;
    private String content;
//    private Template template;


}
