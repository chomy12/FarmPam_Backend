package com.fp.backend.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auction")
public class AuctionController {
    @PostMapping("/bid")
    public String PostTest(@RequestBody String msg){
        System.out.println("msg = "+ msg);
        return"post success"+msg;
    }
}
