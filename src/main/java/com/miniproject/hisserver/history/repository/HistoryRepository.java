package com.miniproject.hisserver.history.repository;

import com.miniproject.hisserver.history.model.History;
import com.miniproject.hisserver.order.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoryRepository extends JpaRepository<History, Long> {
}
