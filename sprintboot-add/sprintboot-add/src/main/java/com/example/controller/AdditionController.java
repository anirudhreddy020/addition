package com.example.controller;

import com.example.service.CreateResponse;
import com.example.utility.AdditionUtility;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class AdditionController {
    @PostMapping("/addition")

    //public ResponseEntity<AdditionResult> performAddition(@RequestBody HashMap<String, Integer> req) {
    public ResponseEntity<AdditionResult> handlePostRequest(@RequestParam("param1") String param1, @RequestParam("param2") String param2) {
        AdditionRequest request = new AdditionRequest();
        //request.setParam1(req.get("param1"));
        //request.setParam2(req.get("param2"));
        int a = Integer.parseInt(param1);
        int b = Integer.parseInt(param2);
        request.setParam1(a);
        request.setParam2(b);
        int result = AdditionUtility.add(request.getParam1(), request.getParam2());
        CreateResponse Response = new CreateResponse();
        //AdditionResult additionResult = Response.additionResponse(req.get("param1"), req.get("param2"), result);
        AdditionResult additionResult = Response.additionResponse(a,b,result);
        return new ResponseEntity<>(additionResult, HttpStatus.OK);
    }
}
