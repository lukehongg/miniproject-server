package com.miniproject.hisserver.stomp.model;

import com.miniproject.hisserver.seat.model.Seat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ChatMessageRequest {

    private Boolean type;
    private Long seatId;
    private int seatNum;
    private String content;

}
