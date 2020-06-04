package org.java.interview.order;

import java.time.Month;
import java.util.Objects;

public class CustomerMonthKey {
    private String customerId;
    private Month month;

    public CustomerMonthKey(String customerId, Month month) {
        this.customerId = customerId;
        this.month = month;
    }

    public String getCustomerId() {
        return customerId;
    }

    public Month getMonth() {
        return month;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerMonthKey that = (CustomerMonthKey) o;
        return Objects.equals(customerId, that.customerId) &&
                month == that.month;
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, month);
    }
}
