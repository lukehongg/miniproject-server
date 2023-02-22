package com.miniproject.hisserver.order.model.dto;

import com.miniproject.hisserver.order.model.response.OrderIdResponse;
import com.miniproject.hisserver.order.model.response.OrderResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderIdDto {
    private Long orderId;

    public OrderIdResponse orderIdResponse() {return new OrderIdResponse(orderId);}
}
