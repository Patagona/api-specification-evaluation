package de.patagona

import org.coursera.autoschema.AutoSchema

object Main {
  def main(args: Array[String]): Unit = {
    val out = AutoSchema.createSchema[Job]
    print(out)
  }
}
