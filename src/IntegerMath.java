/**
 * Created by OskarPraca on 2017-05-22.
 */


public interface IntegerMath {
    int oparate(int a, int b);

    default void oparateNewMethod() {
          System.out.println("hello world");
    }
}
