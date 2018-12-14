package org.incal.spark_ml.models.results

import org.incal.core.util.STuple3
import org.incal.spark_ml.models.classification.ClassificationEvalMetric

case class ClassificationResultsHolder(
  performanceResults: Traversable[ClassificationPerformance],
  counts: Traversable[Long],
  binCurves: Traversable[STuple3[Option[BinaryClassificationCurves]]]
)

case class ClassificationResultsAuxHolder(
  evalResults: Traversable[(ClassificationEvalMetric.Value, Double, Seq[Double])],
  count: Long,
  binTrainingCurves: Option[BinaryClassificationCurves],
  binTestCurves: Seq[Option[BinaryClassificationCurves]]
)
