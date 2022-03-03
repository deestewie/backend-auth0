package com.sample.LynkAuthTester.controller;

import com.sample.LynkAuthTester.dto.ResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/auth0")
public class Auth0TestController {


    @GetMapping(value="/public")
    public ResponseEntity<ResponseDTO> publicEndpoint() {
        return ResponseEntity.ok(new ResponseDTO("Public Endpoint Working fine"));
    }

    @GetMapping(value="/private")
    public ResponseEntity<ResponseDTO> privateEndpoint() {
        return ResponseEntity.ok(new ResponseDTO("Private endpoint working fine"));
    }

    @GetMapping(value="/private-scoped")
    public ResponseEntity<ResponseDTO> privateScopedEndpoint() {
        return ResponseEntity.ok(new ResponseDTO("All good. You can see this because you are Authenticated with a Token granted the 'read:messages' scope"));
    }
}
