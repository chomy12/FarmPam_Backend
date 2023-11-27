package com.fp.backend.controller;

import com.fp.backend.entity.Auction;
import com.fp.backend.service.AuctionService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auction")
@RequiredArgsConstructor
public class AuctionController {


    private final AuctionService auctionService;

//    @PostMapping("/bid")
//    public String PostTest(@RequestBody String msg){
//        System.out.println("msg = "+ msg);
//        return"post success"+msg;
//    }

    @PostMapping("/bid")
    public Auction saveAuction(@RequestBody Auction auction){
        return auctionService.saveAuction(auction);
    }
    @GetMapping("/bid/{id}")
    public Auction getAuctionById(@PathVariable("id") String auctionId){
        return auctionService.getAuctionById(auctionId);
    }
    @PutMapping("/bid")
    public String updateAuction(@RequestBody Auction auction){
        return auctionService.updateAuction(auction);
    }
}
