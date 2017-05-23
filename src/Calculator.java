import java.util.function.BiFunction;

/**
 * Created by OskarPraca on 2017-05-22.
 */
public class Calculator {
    public static void main(String[] args) {

        System.out.println(operateBinary(5, 10, (a,b) ->   a + b)); //15
        System.out.println(operateBinary(51, 1042, (a,b) ->   a - b));

        System.out.println(operateBinary(51, 1042, (a,b) -> {
            if(b == 0){
                throw new IllegalArgumentException("Nie dziel cholero przez zero");
            }
            return a / b;
        }));


    }

    public static int operateBinary(int a, int b, BiFunction<Integer, Integer, Integer> math){
        return math.apply(a,b);
    }

//    private int oparate(int a, int b){
//        return  a + b;
//    }
}

//
