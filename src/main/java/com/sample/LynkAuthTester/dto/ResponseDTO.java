package com.sample.LynkAuthTester.dto;

public class ResponseDTO {
    private String message;

    public ResponseDTO(String message) {
        super();
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String msg) {
        this.message = msg;
    }
}
