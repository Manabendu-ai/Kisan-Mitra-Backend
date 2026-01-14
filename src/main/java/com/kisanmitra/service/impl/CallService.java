package com.kisanmitra.service.impl;

import com.twilio.rest.api.v2010.account.Call;
import com.twilio.type.PhoneNumber;
import org.springframework.beans.factory.annotation.Value;
import java.net.URI;

import com.kisanmitra.models.CallRequest;
import com.kisanmitra.repositories.CallRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class CallService {

    @Autowired
    private CallRequestRepository repo;

    @Value("${twilio.phoneNumber}")
    private String twilioNumber;

    public CallRequest createCall(Integer farmerId, String phone) {
        CallRequest c = new CallRequest();
        c.setFarmerId(farmerId);
        c.setPhone(phone);
        c.setStatus("PENDING");
        c.setCreatedAt(LocalDateTime.now());
        repo.save(c);

        Call.creator(
                new PhoneNumber(phone),
                new PhoneNumber(twilioNumber),
                URI.create("http://localhost:8080/twilio/voice")
        ).create();

        return c;
    }
}
