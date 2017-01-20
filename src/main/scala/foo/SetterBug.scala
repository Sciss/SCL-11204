package foo

import de.sciss.filecache.{Config, ConfigBuilder}

import scala.concurrent.ExecutionContext

trait SetterBug {
  val c: ConfigBuilder[Unit, Unit] = Config()
  c.executionContext = ExecutionContext.global
}