import java.util.ArrayList;

/**
 * Created by rcarreira on 1/7/15.
 */
public class PrimeFactors {

    public static void main(String[] args) {
        System.out.println(generate(30));
    }

    public static boolean isPrime(int number){

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

    public static ArrayList<Integer> generate(int number) {
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
