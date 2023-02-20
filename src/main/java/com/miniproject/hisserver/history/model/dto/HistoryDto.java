package com.miniproject.hisserver.history.model.dto;

import com.miniproject.hisserver.history.model.response.HistoryResponse;
import com.miniproject.hisserver.order.model.Orders;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HistoryDto {
    private Long historyId;
    private int cost;
    private List<Orders> orders;

    public HistoryResponse historyResponse() {
        return new HistoryResponse(historyId, cost, orders);
    }
}
