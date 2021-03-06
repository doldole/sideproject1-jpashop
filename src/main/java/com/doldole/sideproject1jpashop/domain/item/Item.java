package com.doldole.sideproject1jpashop.domain.item;

import com.doldole.sideproject1jpashop.domain.Category;
import com.doldole.sideproject1jpashop.exception.NotEnoughtStockException;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn
@Getter @Setter
public abstract class Item {

    @Id
    @GeneratedValue
    @Column(name = "item_id")
    private Long id;

    private String name;
    private int price;
    private int stockQuantity;

    @ManyToMany(mappedBy = "items")
    private List<Category> categories = new ArrayList<>();

    //== 비즈니스 로직 ==//
    /**
     * stock 증가
     * */
    public void addStock(int stockQuantity) {
        this.stockQuantity += stockQuantity;
    }

    /**
     * stock 감소
     * */
    public void removeStock(int quantity) {
        int restStock = this.stockQuantity - quantity;

        if (restStock < 0) {
            throw new NotEnoughtStockException("need more stock");
        }
        this.stockQuantity = restStock;
    }
}
