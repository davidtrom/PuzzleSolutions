import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class HolesInNumbersTest {
    private HolesInNumbers puzzle;

    @Before
    public void setUp() throws Exception {
        puzzle = new HolesInNumbers();
    }

    @Test
    public void testHoles(){
        Integer expected = 1;
        String numToEvaluate = "423";
        Integer actual = puzzle.findHoleTotal(numToEvaluate);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testHoles2(){
        Integer expected = 2;
        String numToEvaluate = "901";
        Integer actual = puzzle.findHoleTotal(numToEvaluate);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testHoles3(){
        Integer expected = 4;
        String numToEvaluate = "689";
        Integer actual = puzzle.findHoleTotal(numToEvaluate);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testHoles4(){
        Integer expected = 5;
        String numToEvaluate = "86510274";
        Integer actual = puzzle.findHoleTotal(numToEvaluate);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testHoles5(){
        Integer expected = 5;
        String numToEvaluate = "8675309";
        Integer actual = puzzle.findHoleTotal(numToEvaluate);
        Assert.assertEquals(expected, actual);
    }
}
