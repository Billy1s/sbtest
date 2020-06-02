package com.bt

import org.apache.spark.sql.SparkSession


object runner extends App{

  val spark = SparkSession.builder()
    .config("spark.master", "yarn") // Not sure on what this should be set too
    .appName("test")
    .getOrCreate()

  println("hello")

  import spark.implicits._

  val someDF = Seq(
    (10, "bob"),
    (64, "karen"),
    (22, "apples")
  ).toDF("age", "name")


  someDF.show

}
