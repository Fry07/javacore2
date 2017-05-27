/**
 * Created by Иван on 27.05.2017.
 */
public class EvenOdd {

    public int number;

    EvenOdd(){
        number = 2;
    }

    EvenOdd(int number){
        this.number = number;
    }

    public String even (){
        if (number%2==0){
            return ("Number "+ number + " is even (all in pairs)");
        }
        else{
            return ("Number "+ number + " is odd (not all in pairs)");
        }
    }
}
