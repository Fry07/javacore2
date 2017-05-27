/**
 * Created by Иван on 27.05.2017.
 */
public class Bigger {
    public String checkBigger (int a, int b){
        if (a>b) {
            return (a + " is bigger than " + b);
        }
        else if (a==b){
            return  (a + " equals " + b);
        }
        else{
            return (a + " is less than " + b);
        }
    }
}
