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

    public void sparkTest(){
      List<Integer> data = Arrays.asList(1,2,3,4,5);


      SparkConf conf = new SparkConf().setAppName("ivq").setMaster("local[2]");
      JavaSparkContext spark_contex = new JavaSparkContext(conf);

      JavaRDD<Integer> dist_data = spark_contex.parallelize(data);
      int total_length = dist_data.reduce((a,b) -> a + b);
      System.out.print(total_length);

      LDAModel ldaModel = new LDA();


      return;
    }

}
