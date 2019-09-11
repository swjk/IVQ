package sc;
import org.apache.spark.api.java.*;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.*;
import org.apache.spark.api.java.function.Function;


public class Transformations{


  /*
  public static <T> boolean filter(T input){
    return true;
  }
  */

  public static <T> JavaRDD<T> filtering(JavaRDD<T> data, Function<T,Boolean> f1){
    /*Transformations::filter*/
    return data.filter(f1);
  }

}
