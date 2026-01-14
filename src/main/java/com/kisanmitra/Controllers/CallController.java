package com.kisanmitra.Controllers;

import com.kisanmitra.dto.CallRequestDTO;
import com.kisanmitra.models.CallRequest;
import com.kisanmitra.service.impl.CallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/calls")
public class CallController {

    @Autowired
    private CallService callService;

    @PostMapping("/request")
    public CallRequest requestCall(@RequestBody CallRequestDTO dto) {
        return callService.createCall(dto.getFarmerId(), dto.getPhone());
    }
}

