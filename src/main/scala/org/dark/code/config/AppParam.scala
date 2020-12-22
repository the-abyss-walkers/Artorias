package org.dark.code.config

import org.rogach.scallop.ScallopConf
import org.rogach.scallop.ScallopOption

case class AppParam(arguments: Seq[String]) extends ScallopConf(arguments) {

  val configPath: ScallopOption[String] = opt[String](
    short = 'c',
    required = true,
    descr = "Config path"
  )
}
