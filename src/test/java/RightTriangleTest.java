import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Иван on 27.05.2017.
 */
public class RightTriangleTest {
    @Test
    public void checkTest1(){
        double a = 1;
        double b = 2;
        double c = 3;
        String exRes = "Triangle with sides 1.0, 2.0 and 3.0 is NOT a right-angled triangle! Hate it!";
        RightTriangle rightTriangle = new RightTriangle(a,b,c);
        Assert.assertEquals(exRes, rightTriangle.check());
    }

    @Test
    public void checkTest2(){
        double a = 5;
        double b = 3;
        double c = 4;
        String exRes = "Triangle with sides 5.0, 3.0 and 4.0 is a right-angled triangle";
        RightTriangle rightTriangle = new RightTriangle(a,b,c);
        Assert.assertEquals(exRes, rightTriangle.check());
    }
}
