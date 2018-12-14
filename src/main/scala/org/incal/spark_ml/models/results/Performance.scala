package org.incal.spark_ml.models.results

import org.incal.spark_ml.models.classification.ClassificationEvalMetric
import org.incal.spark_ml.models.regression.RegressionEvalMetric

abstract class Performance[T <: Enumeration#Value] {
  def evalMetric: T
  def trainingTestReplicationResults: Traversable[(Double, Double, Option[Double])]
}

case class ClassificationPerformance (
  val evalMetric: ClassificationEvalMetric.Value,
  val trainingTestReplicationResults: Traversable[(Double, Double, Option[Double])]
) extends Performance[ClassificationEvalMetric.Value]

case class RegressionPerformance(
  val evalMetric: RegressionEvalMetric.Value,
  val trainingTestReplicationResults: Traversable[(Double, Double, Option[Double])]
) extends Performance[RegressionEvalMetric.Value]