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

    @Test
    public void when_greater_than_30_percent_then_replace_continuous_vowel_sets () {
        String str1 = "aei bhbhbhb iotyyyyyyyyy";
        String str2 = "nnnnnnnnnnaeeimmmmmmiouemmm";
        String str3 = "nouioui";
        String expected1 = mommifier.insertMommy(str1);
        String expected2 = mommifier.insertMommy(str2);
        String expected3 = mommifier.insertMommy(str3);
        assertTrue(expected1.equals(str1));
        assertTrue(expected2.equals(str2));
        assertTrue(expected3.equals("nomommyumommyimommyomommyumommyi"));
    }

}
