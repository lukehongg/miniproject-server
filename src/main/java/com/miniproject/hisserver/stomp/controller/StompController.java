package com.miniproject.hisserver.stomp.controller;

import com.miniproject.hisserver.seat.model.Seat;
import com.miniproject.hisserver.stomp.model.ChatMessageRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


@Controller
@CrossOrigin
@RequiredArgsConstructor
public class StompController {
    private final SimpMessagingTemplate template; //특정 Broker로 메세지를 전달

    //나중에 store추가되면 Store->Random key로 publish key 사용
    //@MessageMapping(value = "/chat/message/{storeRandomKey}}")
    @MessageMapping(value = "/chat/message/store")
    public void message(@RequestBody ChatMessageRequest message){
//        template.convertAndSend("/sub/chat/room/" + message.getRoomId(), message);
//        template.convertAndSend("/sub/seat/" + message.getSeatId(), message);
        if(message.getType()) System.out.println("Call Received");
        else System.out.println("Request received");
        //나중에 Store의 RandonKey로 pub key 쓸때
//        template.convertAndSend("/sub/message/" + message.getStoreId(), message);
        template.convertAndSend("/sub/message/store", message);
    }

}
