package kata6;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayDiffTest {

    @Test
    public void arrDiffTest() {
        assertArrayEquals(new int []{1,2}, ArrayDiff.arrDiff(new int[]{1}, new int []{1,2}));
    }
}