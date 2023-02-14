//package com.miniproject.hisserver.stomp.model;
//
//import com.greenpoint.server.common.BaseEntity;
//import com.greenpoint.server.seat.model.Seat;
//import lombok.*;
//import org.hibernate.annotations.SQLDelete;
//import org.hibernate.annotations.Where;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//@Entity
//@Getter
//@Setter
//@Builder
//@NoArgsConstructor
//@AllArgsConstructor
//@Where(clause = "deleted = false")
//@SQLDelete(sql = "UPDATE history SET deleted = true Where id = ?")
//public class ChatMessage extends BaseEntity {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
////    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
////    private Seat seat;
//    private Long seatId;
//    private String sender;
//    private String type;
//    private String message;
//
//
//    public static ChatMessage from(Seat s, ChatMessageRequest request){
//        String n = "";
//        if(request.getSender().equals("store")) n = "store";
//        else n = s.getSeatNum()+"번 테이블";
//        return ChatMessage.builder()
//                .seatId(request.getSeatId())
//                .sender(n)
//                .type(request.getType())
//                .message(request.getMessage())
//                .build();
//    }
//
//}
