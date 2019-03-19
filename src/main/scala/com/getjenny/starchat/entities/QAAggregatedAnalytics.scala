package com.getjenny.starchat.entities

/**
  * Created by Angelo Leto <angelo@getjenny.com> on 15/03/19.
  */

case class ScoreHistogram(
                           key: String,
                           docCount: Long,
                         )

case class ConversationsHistogram(
                                   key: Long,
                                   keyAsString: String,
                                   docCount: Long
                                 )
case class ScoresOverTime(
                                keyAsString: String,
                                key: Long,
                                docCount: Long,
                                avgScore: Double
                              )

case class QAAggregatedAnalytics(
                                  totalDocuments: Long = 0,
                                  totalConversations: Long = 0,
                                  avgFeedbackConvScore: Option[Double] = None,
                                  avgAlgorithmConvScore: Option[Double] = None,
                                  avgAlgorithmAnswerScore: Option[Double] = None,
                                  avgFeedbackAnswerScore: Option[Double] = None,
                                  scoreHistograms: Option[Map[String, ScoreHistogram]] = None,
                                  conversationsHistograms: Option[Map[String, ConversationsHistogram]] = None,
                                  scoresOverTime: Option[Map[String, ScoresOverTime]] = None
                                )
