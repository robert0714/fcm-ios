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
    	registrationIds.add("dWMWSRWklQg:APA91bGWXiStn3aU33E1YbfpLLzZgJCiVJ4aWkPJksCm7_SCBqo_1FheylJuSd4dvyaQ_Jd125d-B2kFlEjnA6W-1cZSi89OJ_IzdCoux-_laLoccDPeqc2EDmfgg7sWe6lQQcjgJuo-_WcEZd5kMp88A2DhM-96Ew");
    	registrationIds.add("fFJ27CZErh8:APA91bEQg1nouoErYEBCi0h7FtOnXtws3Zean86cmnsm8kLEZvK1Yt8TWR7svt4YCixnN-PTBcUa88wylv24Y63O_0BOtD6qt8JTQk2scNN5QHT8Wc0fGf1aFwi47DgmpiKijlRztiTa");
    	registrationIds.add("dzVJ1cXL_w0:APA91bFoK26dFThwzreC5otMmV-fxYC67nOhOaVWB1lLNULbX7k6bYZ1kcs5GwMAa_PRwWPtYCk42wLaxSEwBeLuJGXTFFNNMbDEkueqgd3eWW3EAadUNua8ELmr0Zi-lTi0JCvwDW0iPCIEfYn9AVnW40XBurhgEA");
    	registrationIds.add("dRFDGTabUR4:APA91bGRfpKgQyJO4tliMa7BgD5jk337cgpZeTBK6sMfMrroMeesfbe9rS1c9m-g8zN4oh3RcqDJn5Jso8r4SFvGga78BXwtXn5kpq6UdNgbXhpmhjIOUtv-9hK331yVcoVBRWt8886xxG8FgiBP7vpnVzW3aCTOtA");
    	registrationIds.add("fFJ27CZErh8:APA91bEQg1nouoErYEBCi0h7FtOnXtws3Zean86cmnsm8kLEZvK1Yt8TWR7svt4YCixnN-PTBcUa88wylv24Y63O_0BOtD6qt8JTQk2scNN5QHT8Wc0fGf1aFwi47DgmpiKijlRztiTa");
    	registrationIds.add("fV3GeIGbaJ8:APA91bFJDgUs4_408r58fEe33im06ev7yhDcgnNo3hByo9RQBeaG5VHowy4HQvMR38je4ZKvMwIOZSgUiuPygpqfKe6-9xWEaX5hcdm99_R6xO6hhu04wmDVF3Ht-5EktTXE0P2B7oUb0-m_BCvkI5kMYWyP88AFHw");
    	registrationIds.add("c3gNtJiqnTc:APA91bFRN-wXDb_YOz2yioFre48RM0wqxrivwBVgN2S6wZGh0OL9uvEtuGiKbrv_OdKPCEO4yTZtlS-MV1OrsQZdviTxrFkxvjhLP9g9neykAGNViKj2nO8Pss-QVKFXfKRzPAxdqzCHY_AdpbB7QhCzCdCYWLLy7Q");
    	//
//    	registrationIds.add("DC24443084E05D3FA589828DF882048E0C20567DCB54E16DFA182936A66A6D28");
//    	registrationIds.add("775D50A86DE6C6FB7B73F0A460602B4C9A28D1422869EB1C7640874FA62CF4A3");
//    	registrationIds.add("cY8nWe4Tl1Q:APA91bG-5Vd9Pjp_Eso4nxL2IGFzyuhrLFZLJDycc_iTxOG2Fz-cKJXMpJ116IrQqGoqOcM33nfHkEbegvC0t0gPi1fVhJHpq0PdbsvlyEQ-nR4_xaliaCzD9nqd1o_Rur5F1pR9Z_x5yky30-g98fm-WRgnQWUTdg");
    	
    	Notification notification = new Notification("我們都有問題", " ____ ____ _________ \n" + 
	    		"|    |    / ___|    |\n" + 
	    		" |  | |  (   \\_ |  | \n" + 
	    		" |  | |  |\\__  ||  | \n" + 
	    		" |  | |  |/  \\ ||  | \n" + 
	    		" |  | |  |\\    ||  | \n" + 
	    		"|____|____|\\___|____|\n" + 
	    		"                     ");
    	notification.setIcon("icon");
    	notification.setSound("sound"); 
    	notification.setClickAction("click.action ");
    	
    	// build the message 
    	Message message = new Message.MessageBuilder()
    			.addRegistrationToken(registrationIds) // add array
//    	    .toToken("DC24443084E05D3FA589828DF882048E0C20567DCB54E16DFA182936A66A6D28") // single android/ios device
//    			.addData("key_1","value_1")
    	    .notification(notification)
    	    .build();
    	// send the message
    	fcm.send(message);
		//ios DC24443084E05D3FA589828DF882048E0C20567DCB54E16DFA182936A66A6D28
    }
}
