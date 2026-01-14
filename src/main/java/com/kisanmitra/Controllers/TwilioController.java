package com.kisanmitra.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/twilio")
public class TwilioController {

    @GetMapping("/voice")
    public String voice() {
        return """
        <Response>
            <Say voice="alice">Welcome to Kisan Mitra. Please wait while we connect you to our agent.</Say>
            <Dial>+1AGENT_PHONE_NUMBER</Dial>
        </Response>
        """;
    }
}

