package com.miniproject.hisserver.store.model;

import com.miniproject.hisserver.common.BaseEntity;
import com.miniproject.hisserver.menu.model.Menu;
import com.miniproject.hisserver.seat.model.Seat;
import lombok.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Where(clause = "deleted = false")
@SQLDelete(sql = "UPDATE store SET deleted = true Where id = ?")
public class Store extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String category;
    private String name;
    private String randomKey; // UUID 사용

    @OneToMany(mappedBy = "store")
    private List<Menu> menu = new ArrayList<>();

    @OneToMany(mappedBy = "store")
    private List<Seat> seat = new ArrayList<>();


}
