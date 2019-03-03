package org.satish.mypractice.demo
import org.apache.spark.sql.SparkSession

object HelloWorld {
  def main(args: Array[String]): Unit = {
    val sp =SparkSession.builder().master("local").appName("satish-app").getOrCreate()
    val data =sp.read.json("src\\Resources\\empl.json")
    data.show();
    sp.stop()
  }
}
 