package testng;

/**
 * Created by senorita on 3/13/2017.
 */
public class CheckPrimeNumber {
    public boolean isPrimeNumber(int number){
        for (int i=2; i< number; i++){
            if(number%i == 0){
                return false;
            }
        }
        return true;
    }
}
