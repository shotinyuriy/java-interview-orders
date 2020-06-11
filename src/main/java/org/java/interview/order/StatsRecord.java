package org.java.interview.order;

import java.math.BigDecimal;
import java.time.Month;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StatsRecord that = (StatsRecord) o;
        return Objects.equals(customerId, that.customerId) &&
                month == that.month &&
                orderTotalSum.equals(that.orderTotalSum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, month, orderTotalSum);
    }
}