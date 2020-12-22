package org.dark.code

import org.apache.spark.sql.SparkSession
import org.dark.code.config.AppParam

/**
  * Hello world!
  *
  */
object Application extends App {

  /**
    * function that initialize the spark session object.
    * (get or create).
    *
    * @param appName app name
    * @return        spark session
    */
  private def sparkInicializer(appName: String): SparkSession = {
    SparkSession.builder().appName(appName).getOrCreate()
  }

  override def main(args: Array[String]): Unit = {

    val spark: SparkSession = sparkInicializer("Artorias")
    val addParams: AppParam = AppParam(args)
    val outputPath: String = addParams.configPath()

  }
}
