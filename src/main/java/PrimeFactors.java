import java.util.ArrayList;

/**
 * Created by rcarreira on 1/7/15.
 */
public class PrimeFactors {
    public boolean isPrime(int number){

        if(number == 1){
            return false;
        }else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0){
                    return false;
                }
            }
        }
        return true;
    }

    public ArrayList<Integer> generate(int number) {
        ArrayList<Integer> primeFactors = new ArrayList<Integer>();
        for (int i = 2; i < number; i++) {
            if (number % i == 0){
                if (isPrime(i)){
                    primeFactors.add(i);
                }
            }
        }

        return primeFactors;
    }
}
