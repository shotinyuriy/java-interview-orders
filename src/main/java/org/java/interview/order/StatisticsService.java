package org.java.interview.order;

import java.util.List;

public interface StatisticsService {

    /**
     *
     * @param orders - the list of orders to process
     * @param year - year for which to display the top
     * @param topSize - number of records to be in the top
     * @return
     */
    public List<StatsRecord> topMonthlyCustomersInYear(List<Order> orders, int year, int topSize);
}
