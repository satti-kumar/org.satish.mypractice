package org.satish.mypractice.demo

import org.apache.spark.sql.SparkSession

object SayHello {
  def main(args: Array[String]): Unit = {
    val sp1 =SparkSession.builder().master("local").appName("satti1-app").getOrCreate()
    val data1 = sp1.read.json("C:\\Users\\viswa\\Desktop\\empl.json")
    data1.show()
    sp1.stop()
  }
}
