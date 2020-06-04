package org.java.interview.order;

import java.util.List;

public interface StatisticsService {

    public List<StatsRecord> topMonthlyCustomersInYear(List<Order> orders, int year, int topSize);
}
