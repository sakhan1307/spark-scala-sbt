package example

import org.apache.spark._
import org.apache.spark.SparkContext._

object WordCount {
  def main(args: Array[String]) {
    // val inputFile = args(0)
    val inputFile = "wordcount.txt"
    //val outputFile = args[1]
    val outputFile = "count_output"
    val conf = new SparkConf().setAppName("wordCount").setMaster("local[*]").set("spark.submit.deployMode", "client")
    // Create a Scala Spark Context.
    val sc = new SparkContext(conf)
    // Load our input data.
    val input = sc.textFile(inputFile)
    // Split up into words.
    val words = input.flatMap(line => line.split(" "))
    // Transform into word and count.
    // val counts = words.map(word => (word, 1)).reduceByKey{case (x, y) => x + y}
    val counts = words.map(word => (word, 1)).reduceByKey(_ + _)
    // Save the word count back out to a text file, causing evaluation.
    counts.saveAsTextFile(outputFile)
  }
}