package com.example.demo.Util;

import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

public class Utils {
    public static ResponseEntity<String> setResponse(HttpStatus httpStatus, String body){

        return ResponseEntity.status(httpStatus)
                .contentType(MediaType.APPLICATION_JSON)
                .body(body);
    }
}
