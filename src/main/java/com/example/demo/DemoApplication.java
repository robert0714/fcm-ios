package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.pixsee.fcm.Message;
import org.pixsee.fcm.Notification;
import org.pixsee.fcm.Sender;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	//access command line arguments
    @Override
    public void run(String... args) throws Exception {
	
    	Sender fcm = new Sender("AAAAR87djjU:APA91bFWWwl3VYu_HbZUUSJgQKHbYFuBEryFmNm7V_-fsSq22YBshfFIKrhfNhWNVt6uaQwvrdsTCGmp7xR3MaSI5qw7NKizZ99BFqrMpTsNxpFXtiIwBWo_fWR5dri8ne6BRiFTQkkS");
    	       
    	// build multiple tokens ids
    	List<String> registrationIds = new ArrayList<>();
    	registrationIds.add("ejnYFKUx6Ys:APA91bH3trz4hCrgMSpIR29TbpdyRZ1w4Yn1WsMdHzrfccny1uKvr-mn_mSJ5qhhQH7kqW6eMRb9j6uFWwTGDN9vOKgZjpqD6SkEvqwztnpSzq4KOTCbyRXPSZa1tysQsnkVFaqNjvPV4yljVSAp5O-hMYzSUbZcIQ");
    	registrationIds.add("DC24443084E05D3FA589828DF882048E0C20567DCB54E16DFA182936A66A6D28");
    	
    	// build the message 
    	Message message = new Message.MessageBuilder()
    			.addRegistrationToken(registrationIds) // add array
//    	    .toToken("DC24443084E05D3FA589828DF882048E0C20567DCB54E16DFA182936A66A6D28") // single android/ios device
    	    .notification(new Notification("iisi", "劉姝妤測試...."))
    	    .build();
    	// send the message
    	fcm.send(message);
		//ios DC24443084E05D3FA589828DF882048E0C20567DCB54E16DFA182936A66A6D28
    }
}
