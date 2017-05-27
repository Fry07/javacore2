import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Иван on 27.05.2017.
 */
public class EvenOddTest {
    @Test
    public void checkEvenTest1(){
        int number = 2;
        String exRes = "Number 2 is even (all in pairs)";
        EvenOdd evenOdd = new EvenOdd(number);
        Assert.assertEquals(exRes, evenOdd.even());
    }
    @Test
    public void checkEvenTest2(){
        int number = 1;
        String exRes = "Number 1 is odd (not all in pairs)";
        EvenOdd evenOdd = new EvenOdd(number);
        Assert.assertEquals(exRes, evenOdd.even());
    }
    @Test
    public void checkEvenTest3(){
        int number = 0;
        String exRes = "Number 0 is even (all in pairs)";
        EvenOdd evenOdd = new EvenOdd(number);
        Assert.assertEquals(exRes, evenOdd.even());
    }
}
