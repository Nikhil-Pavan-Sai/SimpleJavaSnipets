package com.nikhil.javamail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.sendgrid.*;
import java.io.IOException;

@SpringBootApplication
public class JavamailApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(JavamailApplication.class, args);
		sendMail();
	}

	private static void sendMail() throws IOException {
		Email from = new Email("m.nikhil.pavan.sai@gmail.com");
		String subject = "Testing mail with SendGrid";
		Email to = new Email("9701209751maps@gmail.com");
		Content content = new Content("text/plain", "Project Details"+"\n" +
				"Prerequisites :"+ "\n" +
				"Understanding the working of apis."+"\n" +
				"Knowledge of building user interfaces. "+"\n" +
				"Understanding of concepts like authentication, authorization."+"\n" +
				"Should be able to adopt to libraries by looking into the documentation."+"\n" +
				"Objective : " +
				"\n" +
				"Build a coding platform which can compile and run the code against sample test cases."+"\n" +
				"High level project epics: "+"\n" +
				"User Authentication."+"\n" +
				"Code compiler and runtime sandbox environment. "+"\n" +
				"Plagiarism detection ."+"\n" +
				"Deployment and performance optimization.");
		Mail mail = new Mail(from, subject, to, content);
		SendGrid sg = new SendGrid("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");
		Request request = new Request();
		request.setMethod(Method.POST);
		request.setEndpoint("mail/send");
		request.setBody(mail.build());
		Response response = sg.api(request);
		System.out.println(response.getStatusCode());
		System.out.println(response.getBody());
		System.out.println(response.getHeaders());
	}
}
