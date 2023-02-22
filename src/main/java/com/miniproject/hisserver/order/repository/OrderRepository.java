package com.miniproject.hisserver.order.repository;

import com.miniproject.hisserver.order.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Orders, Long> {
    List<Orders> findAllByStoreId(Long storeId);

    @Query("select o from Orders o" +
            " left join fetch o.store as s " +
            " left join fetch o.seat as e " +
            " where s.id = :storeId " +
            "and e.seatNum = :seatNum")
    List<Orders> findAllByStoreIdAndSeatId(Long storeId, int seatNum);
}
