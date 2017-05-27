import org.junit.*;
import org.junit.Test;
/**
 * Created by Иван on 27.05.2017.
 */
public class BiggerTest {
    @Test
    public void biggerTest1(){
        int a = -1;
        int b = 2;
        String exRes = "-1 is less than 2";
        Bigger b1 = new Bigger();
        Assert.assertEquals(exRes, b1.checkBigger(a,b));
    }
    @Test
    public void biggerTest2(){
        int a = 2;
        int b = 2;
        String exRes = "2 equals 2";
        Bigger b2 = new Bigger();
        Assert.assertEquals(exRes, b2.checkBigger(a,b));
    }
    @Test
    public void biggerTest3(){
        int a = 300;
        int b = 0;
        String exRes = "300 is bigger than 0";
        Bigger b3 = new Bigger();
        Assert.assertEquals(exRes, b3.checkBigger(a,b));
    }
}

