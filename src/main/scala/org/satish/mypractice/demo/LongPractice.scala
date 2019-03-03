package org.satish.mypractice.demo

import org.apache.spark.sql.SparkSession

object LongPractice {
  def main(args:Array[String]):Unit ={
    val ss =SparkSession.builder().master("local").appName("mysparkjob_after long time").getOrCreate()

    val dataDf =ss.read.json("C:\\Users\\viswa\\Desktop\\spark_all\\Resorces\\pandujsonfile.json")
//    dataDf
//    dataDf.printSchema()
    dataDf.select($"empename",$"empid").show()
//    dataDf.show()
    ss.stop()
  }
}
