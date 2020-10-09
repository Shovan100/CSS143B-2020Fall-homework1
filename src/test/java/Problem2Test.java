import org.junit.Test;

import static org.junit.Assert.*;

public class Problem2Test {

    // Example test
    // Okay to change
    @Test
    public void testBubbleSort() {
        //assertTrue(false);
        // add your tests here
        int[][] test = {{},{1},{2,1},{3,1,2},{4,2,3,1},{5,1,2,4,3}};
        int[][] target = {{},{1},{1,2},{1,2,3},{1,2,3,4},{1,2,3,4,5}};
        for (int i = 0; i < test.length; i++) {
            Problem2.bubbleSort(test[i]);
            assertArrayEquals(test[i],target[i]);

        }



    }
}