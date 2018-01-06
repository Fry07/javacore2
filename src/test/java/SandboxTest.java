import org.junit.Test;

/**
 * Created by Иван on 06.01.2018.
 */
public class SandboxTest {

    @Test(timeout = 2000)
    public void infinityTest(){
        while(true);
    }

}
