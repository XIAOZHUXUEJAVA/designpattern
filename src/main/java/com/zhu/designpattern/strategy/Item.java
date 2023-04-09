package com.zhu.designpattern.strategy;

import com.sun.org.glassfish.gmbal.Description;
import com.sun.xml.internal.bind.v2.TODO;

import java.math.BigDecimal;

/**
 * @description: Item
 * @date: 2023/4/8 14:53
 * @author: zdp
 * @version: 1.0
 */
public class Item {
    private Long itemId;
    private Long productId;

    private String productName;
    private Integer quantity;
    private BigDecimal price;
    private BigDecimal total;

    private Integer isPaid;
    public Item(Long itemId, Long productId, String productName, Integer quantity, BigDecimal price) {
        this.itemId = itemId;
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.total = price.multiply(BigDecimal.valueOf(quantity));
        this.isPaid = StrategyConstant.UNPAID;
    }


    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
        this.total = price.multiply(BigDecimal.valueOf(quantity));
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
        this.total = price.multiply(BigDecimal.valueOf(quantity));
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public void setIsPaid(Integer status) {
        this.isPaid = status;
    }
    public Integer getIsPaid() {
        return this.isPaid;
    }
}
