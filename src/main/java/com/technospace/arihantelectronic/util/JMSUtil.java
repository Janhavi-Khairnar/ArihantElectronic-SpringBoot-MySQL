package com.technospace.arihantelectronic.util;

import javax.security.auth.Subject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class JMSUtil {

	@Autowired
	JavaMailSender javaMailSender;
	
	public void sendmail(String to, String subject, String body) {
		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
		
		simpleMailMessage.setFrom("khairnard2006@gmail.com");
		simpleMailMessage.setTo(to);
		simpleMailMessage.setSubject(subject);
		simpleMailMessage.setText(body);
		
		javaMailSender.send(simpleMailMessage);
	}
}
