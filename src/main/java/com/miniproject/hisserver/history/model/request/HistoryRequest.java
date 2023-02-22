package com.miniproject.hisserver.history.model.request;

import com.miniproject.hisserver.history.model.dto.HistoryCUDto;
import com.miniproject.hisserver.order.model.Orders;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HistoryRequest {
    private Long historyId;
    private int cost;
    private List<Orders> orders;

    public HistoryCUDto historyCUDto() {
        return new HistoryCUDto(cost, orders);
    }
}
