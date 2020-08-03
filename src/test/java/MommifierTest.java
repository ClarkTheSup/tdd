import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MommifierTest {
    private Mommifier mommifier;

    @Before
    public void before() {
        mommifier = new Mommifier();
    }

    @Test
    public void given_vowels_then_ouput_correct_num () {
        String str1 = "aei bhbhbhb iot";
        String str2 = "nnnnnnnnnnaeeimmmmmmiouemmm";
        String str3 = " nnnnnniuiuinnnniuiunnn";
        int num1 = 5;
        int num2 = 8;
        int num3 = 9;
        assertEquals(num1, mommifier.countVowels(str1));
        assertEquals(num2, mommifier.countVowels(str2));
        assertEquals(num3, mommifier.countVowels(str3));
    }

    @Test
    public void given_vowels_then_ouput_whether_greater_than_30_percent () {
        String str1 = "aei bhbhbhb iotyyyyyyyyy";
        String str2 = "nnnnnnnnnnaeeimmmmmmiouemmm";
        String str3 = " nnouiouioiuiuinuiouniuiunuion";
        assertFalse(mommifier.greaterThanThirtyPercentage(str1));
        assertFalse(mommifier.greaterThanThirtyPercentage(str2));
        assertTrue(mommifier.greaterThanThirtyPercentage(str3));
    }
    
}
