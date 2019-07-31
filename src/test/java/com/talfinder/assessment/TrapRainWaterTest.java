package com.talfinder.assessment;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TrapRainWaterTest {

    @Parameterized.Parameters
    public static Collection<Object[]> parameters() {
        return Arrays.asList(new Object[][] {
                {new int[] {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}, 6},
                {new int[] {3, 0, 0, 2, 0, 4}, 10},
                {new int[] {2, 0, 2}, 2},
                {new int[] {1, 4, 2, 5, 0, 6, 2, 3, 4}, 10},
                {new int[] {0, 4, 5, 1, 0, 0}, 0},
                {new int[] {7, 0, 4, 2, 5, 0, 6, 4, 0, 5}, 25},
                {new int[] {1, 0, 2, 2, 4, 0, 1, 5, 2, 1, 6, 1}, 15},
                {new int[] {4, 2, 3, 5, 2, 3, 4, 5}, 9},
        });
    }

    int[] input;
    int expectedValue;

    public TrapRainWaterTest(int[] input, int expectedValue) {
        this.input = input;
        this.expectedValue = expectedValue;
    }

    @Test
    public void doTrapRainWater() {
        Assert.assertEquals("input:" + Arrays.toString(input) , expectedValue, TrapRainWater.trap(input));
    }
}
