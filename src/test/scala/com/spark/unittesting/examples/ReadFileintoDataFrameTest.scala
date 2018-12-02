package com.spark.unittesting.examples

import com.holdenkarau.spark.testing.DataFrameSuiteBase
import org.apache.spark
import org.apache.spark.sql._
import org.scalatest.{FunSuite, FunSpec}


class ReadFileintoDataFrameTest extends FunSuite with DataFrameSuiteBase {

  implicit val sparkImpl: SparkSession = spark
  var app: ReadFileintoDataFrame = new ReadFileintoDataFrame()

  override def beforeAll() {
    super.beforeAll()
    super.sqlBeforeAllTestCases()
  }

  test("Your test") {
    val df = app.readFileFromSession(sparkImpl)
    assert(df.isInstanceOf[DataFrame])
  }
}
