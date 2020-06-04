package org.java.interview.order;

import java.math.BigDecimal;
import java.time.Month;

public class StatsRecord {
    private String customerId;
    private Month month;
    private BigDecimal orderTotalSum;

    public StatsRecord(String customerId, Month month, BigDecimal orderTotalSum) {
        this.customerId = customerId;
        this.orderTotalSum = orderTotalSum;
        this.month = month;
    }

    public String getCustomerId() {
        return customerId;
    }

    public Month getMonth() {
        return month;
    }

    public BigDecimal getMonthlyTotal() {
        return orderTotalSum;
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