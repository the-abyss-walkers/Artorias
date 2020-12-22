package org.dark.code

import org.apache.spark.sql.SparkSession

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

  }
}
