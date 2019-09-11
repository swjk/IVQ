package sc;

/**
*   Main Class description
*
*/
import org.apache.spark.api.java.*;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.*;


public class MainClass {

  public static int count = 0;

  public static void main(String[] args) {
    System.out.print("test");
  }


  public void sparkTest(){



    SparkConf conf = new SparkConf().setAppName("IVQ").setMaster("local[2]");
    JavaSparkContext spark_context = new JavaSparkContext(conf);

    JavaRDD<String> lines = spark_context.textFile("../resources/file1.txt");


    for(String line: lines.collect()){
      System.out.print("* " + line);
    }

    return;
  }

}
