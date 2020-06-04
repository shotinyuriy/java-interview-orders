package org.java.interview.order;

import java.math.BigDecimal;
import java.time.Month;

public class StatsRecord {
    private String customerId;
    private BigDecimal orderTotalSum;
    private Month month;

    public StatsRecord(String customerId, BigDecimal orderTotalSum, Month month) {
        this.customerId = customerId;
        this.orderTotalSum = orderTotalSum;
        this.month = month;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public BigDecimal getOrderTotalSum() {
        return orderTotalSum;
    }

    public void setOrderTotalSum(BigDecimal orderTotalSum) {
        this.orderTotalSum = orderTotalSum;
    }

    public Month getMonthIndex() {
        return month;
    }

    public void setMonthIndex(Month month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "StatsRecord{" +
                "customerId='" + customerId + '\'' +
                ", orderTotalSum=" + orderTotalSum +
                ", month=" + month +
                '}';
    }
}
