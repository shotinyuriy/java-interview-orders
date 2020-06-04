package org.java.interview.order;

import java.math.BigDecimal;
import java.time.LocalDate;


public class Order {
    private String customerId;
    private LocalDate orderDate;
    private BigDecimal orderTotal;

    public Order(String customerId, LocalDate orderDate, BigDecimal orderTotal) {
        this.customerId = customerId;
        this.orderDate = orderDate;
        this.orderTotal = orderTotal;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public BigDecimal getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(BigDecimal orderTotal) {
        this.orderTotal = orderTotal;
    }
}
