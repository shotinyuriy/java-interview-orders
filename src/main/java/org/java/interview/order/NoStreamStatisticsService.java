package org.java.interview.order;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of the StatisticsService without Stream API
 */
public class NoStreamStatisticsService implements StatisticsService {

    /**
     * The method returns list of the customers whos monthly total order sum is the largest
     * only the given year should be considered
     * the list should include only the given number of customers
     *
     * @param orders - the list of orders to process
     * @param year - year for which to display the top
     * @param topSize - number of records to be in the top
     * @return
     */
    @Override
    public List<StatsRecord> topMonthlyCustomersInYear(List<Order> orders, int year, int topSize) {
        // TODO: implement this
        return new ArrayList<>();
    }
}