package com.miniproject.hisserver.history.service;

import com.miniproject.hisserver.history.model.History;
import com.miniproject.hisserver.history.repository.HistoryRepository;
import com.miniproject.hisserver.order.model.Orders;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HistoryService {
    private final HistoryRepository historyRepository;

    @Transactional
    public History create(List<Orders> orders) {
        History newHistory = new History(orders);
        History savedHistory = historyRepository.save(newHistory);
        return savedHistory;
    }

}
