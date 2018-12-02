package com.spark.unittesting.examples

import org.apache.spark.sql.{DataFrame, SparkSession}

class ReadFileintoDataFrame {

  def readFileFromSession(sparkSession: SparkSession): DataFrame ={
    return sparkSession.read
      .option("header", "true")
      .csv("src/main/resources/sales.csv")
  }

  def createSparkSession(): SparkSession = {
    val sparkSession = SparkSession.builder
      .master("local")
      .appName("spark session example")
      .getOrCreate()
    sparkSession
  }
}
