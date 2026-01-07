package com.kisanmitra.Controllers;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseToken;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/firebase")
public class FireBaseTestController {

    @PostMapping("/verify")
    public String verifyToken(@RequestHeader("Authorization") String authHeader)
            throws Exception {

        String token = authHeader.replace("Bearer ", "");

        FirebaseToken decodedToken =
                FirebaseAuth.getInstance().verifyIdToken(token);

        return "✅ Firebase verified! UID = " + decodedToken.getUid();
    }
}
