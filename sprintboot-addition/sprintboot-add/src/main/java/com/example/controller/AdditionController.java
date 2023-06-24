package com.example.controller;

import com.example.utility.AdditionUtility;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class AdditionController {
    @PostMapping("/addition")
    public ResponseEntity<AdditionResult> performAddition(@RequestBody AdditionRequest addition) {


        int result = AdditionUtility.add(addition.getParam1(), addition.getParam2());
        AdditionResult additionResult = new AdditionResult(addition.getParam1(), addition.getParam2(), result);
        System.out.println(additionResult);
        return new ResponseEntity<>(additionResult,HttpStatus.OK);

       // return new ResponseEntity<>(additionResult, HttpStatus.OK);
    }
}
