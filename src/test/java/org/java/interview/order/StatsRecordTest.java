package org.java.interview.order;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.Month;

public class StatsRecordTest {

    @Test
    public void testHashCode_Equals() {
        StatsRecord stats1 = new StatsRecord("cust1", Month.DECEMBER, BigDecimal.ONE);
        StatsRecord stats2 = new StatsRecord("cust1", Month.DECEMBER, BigDecimal.ONE);

        Assert.assertTrue(stats1.equals(stats2));
        Assert.assertEquals(stats1.hashCode(), stats2.hashCode());
    }

    @Test
    public void testHashCode_NotEquals() {
        StatsRecord stats1 = new StatsRecord("cust1", Month.DECEMBER, BigDecimal.ONE);
        StatsRecord stats2 = new StatsRecord("cust2", Month.JANUARY, BigDecimal.ZERO);

        Assert.assertFalse(stats1.equals(stats2));
        Assert.assertNotEquals(stats1.hashCode(), stats2.hashCode());
    }

    @Test
    public void testEquals_Reflective() {
        StatsRecord stats1 = new StatsRecord("cust1", Month.DECEMBER, BigDecimal.ONE);

        Assert.assertTrue(stats1.equals(stats1));
    }

    @Test
    public void testEquals_Symmetrical() {
        StatsRecord stats1 = new StatsRecord("cust1", Month.DECEMBER, BigDecimal.ONE);
        StatsRecord stats2 = new StatsRecord("cust1", Month.DECEMBER, BigDecimal.ONE);

        Assert.assertTrue(stats1.equals(stats2));
        Assert.assertTrue(stats2.equals(stats1));
    }

    @Test
    public void testEquals_Trasitive() {
        StatsRecord stats1 = new StatsRecord("cust1", Month.DECEMBER, BigDecimal.ONE);
        StatsRecord stats2 = new StatsRecord("cust1", Month.DECEMBER, BigDecimal.ONE);
        StatsRecord stats3 = new StatsRecord("cust1", Month.DECEMBER, BigDecimal.ONE);

        Assert.assertTrue(stats1.equals(stats3));
        Assert.assertTrue(stats2.equals(stats3));
        Assert.assertTrue(stats3.equals(stats1));
    }

}
