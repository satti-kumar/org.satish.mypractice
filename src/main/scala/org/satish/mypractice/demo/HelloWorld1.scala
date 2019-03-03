package org.satish.mypractice.demo

import org.apache.spark.sql.SparkSession

object HelloWorld1 {

  def main(args:Array[String]):Unit ={
    val sp2 =SparkSession.builder().master("local").appName("satish-first-app").getOrCreate()
    val path ="C:/Users/viswa/Desktop/spark_all/Resorces"
    val file1 ="pandujsonfile.json"
    val file2 ="empl1.json"
    var dat=java.time.LocalDate.now
    var tedi=dat.toString.replace("-","/")
    val data =sp2.read.json(s"$path\\$file1")
//    data.show()
    data.write.save(s"$path\\$tedi\\outputfile")
    println("******************************************")
    println("******************************************")
    println("******************************************")
    println(tedi)
    sp2.stop()
  }
}
