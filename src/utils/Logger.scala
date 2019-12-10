package utils

import org.slf4j.{Logger, LoggerFactory}

/**
 * Project-wide Logging Trait
 *
 */

trait Logging {

  val logger: Logger = LoggerFactory.getLogger(getClass)

  def logInfo(s: String): Unit = {
    logger.info(s)
  }

  def logError(s: String, t: Option[Throwable] = None): Unit = {
    if (t.isDefined) logger.error(s, t)
    else logger.error(s)
  }

  def logWarning(s: String, t: Option[Throwable] = None): Unit = {
    if (t.isDefined) logger.warn(s, t)
    else logger.warn(s)
  }
}
