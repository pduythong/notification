package cs490.notification.service;

import cs490.notification.dto.EmailContentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;

import javax.mail.internet.InternetAddress;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender sender;

    public void sendMail(EmailContentDto emailContentDto) {

        MimeMessagePreparator message = mimeMessage -> {
            MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true);

            messageHelper.setFrom(new InternetAddress(emailContentDto.getFrom()));
            messageHelper.setTo(emailContentDto.getTo());
            messageHelper.setSubject(emailContentDto.getSubject());
            messageHelper.setText(emailContentDto.getContent());

        };
        sender.send(message);


    }

}
