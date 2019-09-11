package sc;

/**
*   Main Class description
*
*/
import org.apache.spark.api.java.*;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.*;
import java.util.List;
import org.apache.spark.api.java.function.Function;



public class MainClass {

  public static int count = 0;

  public static void main(String[] args) {
    sparkTest();
  }


  public static void sparkTest(){



    SparkConf conf = new SparkConf().setAppName("IVQ").setMaster("local[2]");
    JavaSparkContext spark_context = new JavaSparkContext(conf);

    JavaRDD<String> lines = spark_context.textFile("file1.txt");

    List<String> llist = lines.collect();
    System.out.println(llist);



    JavaRDD<String> filtered_lines = Transformations.filtering(lines, (String a ) -> {return a.length()>1; });
    List<String> flist = filtered_lines.collect();
    System.out.println(flist);




    return;
  }

}
