# SparkDemo

----------------
scala ---
https://www.dropbox.com/sh/hh1mdhuvabcanra/AABxJCrS89s6tJIbNKRfbRs9a?dl=0

https://1drv.ms/o/s!AqpaeaxFd6hUgnozsMeEGnfC3QUQ

Scala==

cmd-WS> sbt new https://github.com/sbt/scala-seed.g8
	
project name: HelloWorldSBT

cmd-ws> cd helloworldsbt

helloworldsbt> sbt

sbt:hello> compile

sbt:hello> package

sbt:hello> run

sbt:hello> runMain example.Hello

--create .sbt/1.0/plugins/plugins.sbt add 'addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "5.2.4")'
sbt:hello> eclipse

--------------------------------------------------------------------------------------------
Spark---

$spark-shell

$spark-submit --class driverClass clientjar input output

cmd> scala -version

cmd> sbt sbt-version

vm - 	scala version - 2.12.2,	spark -2.1.1

cmd-WS> sbt new https://github.com/sbt/scala-seed.g8
	
project name: SparkDemo

cmd-ws> cd SparkDemo

change inside buildt.sbt file name as SparkDemo instead of Hello
add spark-core dependencies in this file and make scala and sbt version consitent with your env

cmd-ws> sbt update 

cmd-ws> sbt eclipse:clean eclipse

import into eclipse

--------------------------------------------------------------------------------------------
----RUN on hdfs
$ spark-submit --verbose --class com.laboros.spark.driver.WordCountDriver sparkdemo_2.11-0.1.0-SNAPSHOT.jar /user/edureka/WordCount.txt /user/edureka/WCOP_SP1

OR

$ spark-submit --verbose --class com.laboros.spark.driver.WordCountDriver sparkdemo_2.11-0.1.0-SNAPSHOT.jar hdfs://localhost:9000/user/edureka/WordCount.txt hdfs://localhost:9000/user/edureka/WCOP_SP1

--------------
Using properties file: /usr/lib/spark-2.1.1-bin-hadoop2.7/conf/spark-defaults.conf
Adding default property: spark.master=spark://localhost:7077
Parsed arguments:
  master                  spark://localhost:7077
  deployMode              null
  executorMemory          null
  executorCores           null
  totalExecutorCores      null
  propertiesFile          /usr/lib/spark-2.1.1-bin-hadoop2.7/conf/spark-defaults.conf
  driverMemory            null
  driverCores             null
  driverExtraClassPath    null
  driverExtraLibraryPath  null
  driverExtraJavaOptions  null
  supervise               false
  queue                   null
  numExecutors            null
  files                   null
  pyFiles                 null
  archives                null
  mainClass               com.laboros.spark.driver.WordCountDriver
  primaryResource         file:/home/edureka/SHAHBAZWS/BATCH170917/sparkjobs/sparkdemo_2.11-0.1.0-SNAPSHOT.jar
  name                    com.laboros.spark.driver.WordCountDriver
  childArgs               [/user/edureka/WordCount.txt /user/edureka/WCOP_SP1]
  jars                    null
  packages                null
  packagesExclusions      null
  repositories            null
  verbose                 true

Spark properties used, including those specified through
 --conf and those from the properties file /usr/lib/spark-2.1.1-bin-hadoop2.7/conf/spark-defaults.conf:
  spark.master -> spark://localhost:7077

    
Main class:
com.laboros.spark.driver.WordCountDriver
Arguments:
/user/edureka/WordCount.txt
/user/edureka/WCOP_SP1
System properties:
SPARK_SUBMIT -> true
spark.app.name -> com.laboros.spark.driver.WordCountDriver
spark.jars -> file:/home/edureka/SHAHBAZWS/BATCH170917/sparkjobs/sparkdemo_2.11-0.1.0-SNAPSHOT.jar
spark.submit.deployMode -> client
spark.master -> spark://localhost:7077
Classpath elements:
file:/home/edureka/SHAHBAZWS/BATCH170917/sparkjobs/sparkdemo_2.11-0.1.0-SNAPSHOT.jar


18/02/07 10:50:20 INFO SparkContext: Running Spark version 2.1.1
18/02/07 10:50:21 WARN NativeCodeLoader: Unable to load native-hadoop library for your platform... using builtin-java classes where applicable
18/02/07 10:50:21 WARN Utils: Your hostname, localhost.localdomain resolves to a loopback address: 127.0.0.1; using 10.0.2.15 instead (on interface enp0s3)
18/02/07 10:50:21 WARN Utils: Set SPARK_LOCAL_IP if you need to bind to another address
18/02/07 10:50:21 INFO SecurityManager: Changing view acls to: edureka
18/02/07 10:50:21 INFO SecurityManager: Changing modify acls to: edureka
18/02/07 10:50:21 INFO SecurityManager: Changing view acls groups to: 
18/02/07 10:50:21 INFO SecurityManager: Changing modify acls groups to: 
18/02/07 10:50:21 INFO SecurityManager: SecurityManager: authentication disabled; ui acls disabled; users  with view permissions: Set(edureka); groups with view permissions: Set(); users  with modify permissions: Set(edureka); groups with modify permissions: Set()
18/02/07 10:50:22 INFO Utils: Successfully started service 'sparkDriver' on port 37629.
18/02/07 10:50:22 INFO SparkEnv: Registering MapOutputTracker
18/02/07 10:50:22 INFO SparkEnv: Registering BlockManagerMaster
18/02/07 10:50:22 INFO BlockManagerMasterEndpoint: Using org.apache.spark.storage.DefaultTopologyMapper for getting topology information
18/02/07 10:50:22 INFO BlockManagerMasterEndpoint: BlockManagerMasterEndpoint up
18/02/07 10:50:22 INFO DiskBlockManager: Created local directory at /tmp/blockmgr-862ed95a-7d0f-4361-ae57-a8c910622614
18/02/07 10:50:22 INFO MemoryStore: MemoryStore started with capacity 366.3 MB
18/02/07 10:50:23 INFO SparkEnv: Registering OutputCommitCoordinator
18/02/07 10:50:23 INFO Utils: Successfully started service 'SparkUI' on port 4040.
18/02/07 10:50:23 INFO SparkUI: Bound SparkUI to 0.0.0.0, and started at http://10.0.2.15:4040
18/02/07 10:50:23 INFO SparkContext: Added JAR file:/home/edureka/SHAHBAZWS/BATCH170917/sparkjobs/sparkdemo_2.11-0.1.0-SNAPSHOT.jar at spark://10.0.2.15:37629/jars/sparkdemo_2.11-0.1.0-SNAPSHOT.jar with timestamp 1517980823482
18/02/07 10:50:23 INFO Executor: Starting executor ID driver on host localhost
18/02/07 10:50:23 INFO Utils: Successfully started service 'org.apache.spark.network.netty.NettyBlockTransferService' on port 45130.
18/02/07 10:50:23 INFO NettyBlockTransferService: Server created on 10.0.2.15:45130
18/02/07 10:50:23 INFO BlockManager: Using org.apache.spark.storage.RandomBlockReplicationPolicy for block replication policy
18/02/07 10:50:23 INFO BlockManagerMaster: Registering BlockManager BlockManagerId(driver, 10.0.2.15, 45130, None)
18/02/07 10:50:23 INFO BlockManagerMasterEndpoint: Registering block manager 10.0.2.15:45130 with 366.3 MB RAM, BlockManagerId(driver, 10.0.2.15, 45130, None)
18/02/07 10:50:23 INFO BlockManagerMaster: Registered BlockManager BlockManagerId(driver, 10.0.2.15, 45130, None)
18/02/07 10:50:23 INFO BlockManager: Initialized BlockManager: BlockManagerId(driver, 10.0.2.15, 45130, None)
18/02/07 10:50:25 INFO MemoryStore: Block broadcast_0 stored as values in memory (estimated size 242.2 KB, free 366.1 MB)
18/02/07 10:50:25 INFO MemoryStore: Block broadcast_0_piece0 stored as bytes in memory (estimated size 23.2 KB, free 366.0 MB)
18/02/07 10:50:25 INFO BlockManagerInfo: Added broadcast_0_piece0 in memory on 10.0.2.15:45130 (size: 23.2 KB, free: 366.3 MB)
18/02/07 10:50:25 INFO SparkContext: Created broadcast 0 from textFile at WordCountDriver.scala:26
18/02/07 10:50:26 INFO FileInputFormat: Total input paths to process : 1
18/02/07 10:50:27 INFO deprecation: mapred.tip.id is deprecated. Instead, use mapreduce.task.id
18/02/07 10:50:27 INFO deprecation: mapred.task.id is deprecated. Instead, use mapreduce.task.attempt.id
18/02/07 10:50:27 INFO deprecation: mapred.task.is.map is deprecated. Instead, use mapreduce.task.ismap
18/02/07 10:50:27 INFO deprecation: mapred.task.partition is deprecated. Instead, use mapreduce.task.partition
18/02/07 10:50:27 INFO deprecation: mapred.job.id is deprecated. Instead, use mapreduce.job.id
18/02/07 10:50:27 INFO FileOutputCommitter: File Output Committer Algorithm version is 1
18/02/07 10:50:27 INFO SparkContext: Starting job: saveAsTextFile at WordCountDriver.scala:39
18/02/07 10:50:27 INFO DAGScheduler: Registering RDD 3 (map at WordCountDriver.scala:36)
18/02/07 10:50:27 INFO DAGScheduler: Got job 0 (saveAsTextFile at WordCountDriver.scala:39) with 1 output partitions
18/02/07 10:50:27 INFO DAGScheduler: Final stage: ResultStage 1 (saveAsTextFile at WordCountDriver.scala:39)
18/02/07 10:50:27 INFO DAGScheduler: Parents of final stage: List(ShuffleMapStage 0)
18/02/07 10:50:27 INFO DAGScheduler: Missing parents: List(ShuffleMapStage 0)
18/02/07 10:50:27 INFO DAGScheduler: Submitting ShuffleMapStage 0 (MapPartitionsRDD[3] at map at WordCountDriver.scala:36), which has no missing parents
18/02/07 10:50:27 INFO MemoryStore: Block broadcast_1 stored as values in memory (estimated size 4.8 KB, free 366.0 MB)
18/02/07 10:50:27 INFO MemoryStore: Block broadcast_1_piece0 stored as bytes in memory (estimated size 2.8 KB, free 366.0 MB)
18/02/07 10:50:27 INFO BlockManagerInfo: Added broadcast_1_piece0 in memory on 10.0.2.15:45130 (size: 2.8 KB, free: 366.3 MB)
18/02/07 10:50:27 INFO SparkContext: Created broadcast 1 from broadcast at DAGScheduler.scala:996
18/02/07 10:50:27 INFO DAGScheduler: Submitting 1 missing tasks from ShuffleMapStage 0 (MapPartitionsRDD[3] at map at WordCountDriver.scala:36)
18/02/07 10:50:27 INFO TaskSchedulerImpl: Adding task set 0.0 with 1 tasks
18/02/07 10:50:27 INFO TaskSetManager: Starting task 0.0 in stage 0.0 (TID 0, localhost, executor driver, partition 0, PROCESS_LOCAL, 6064 bytes)
18/02/07 10:50:27 INFO Executor: Running task 0.0 in stage 0.0 (TID 0)
18/02/07 10:50:27 INFO Executor: Fetching spark://10.0.2.15:37629/jars/sparkdemo_2.11-0.1.0-SNAPSHOT.jar with timestamp 1517980823482
18/02/07 10:50:28 INFO TransportClientFactory: Successfully created connection to /10.0.2.15:37629 after 60 ms (0 ms spent in bootstraps)
18/02/07 10:50:28 INFO Utils: Fetching spark://10.0.2.15:37629/jars/sparkdemo_2.11-0.1.0-SNAPSHOT.jar to /tmp/spark-b1bc1e07-6ec9-4c69-8963-eddebf1766dd/userFiles-a5de2679-14a5-4866-a1f5-450962b4dae9/fetchFileTemp3456527237333941237.tmp
18/02/07 10:50:28 INFO Executor: Adding file:/tmp/spark-b1bc1e07-6ec9-4c69-8963-eddebf1766dd/userFiles-a5de2679-14a5-4866-a1f5-450962b4dae9/sparkdemo_2.11-0.1.0-SNAPSHOT.jar to class loader
18/02/07 10:50:28 INFO HadoopRDD: Input split: hdfs://localhost:9000/user/edureka/WordCount.txt:0+64
18/02/07 10:50:29 INFO Executor: Finished task 0.0 in stage 0.0 (TID 0). 1814 bytes result sent to driver
18/02/07 10:50:29 INFO DAGScheduler: ShuffleMapStage 0 (map at WordCountDriver.scala:36) finished in 1.304 s
18/02/07 10:50:29 INFO DAGScheduler: looking for newly runnable stages
18/02/07 10:50:29 INFO DAGScheduler: running: Set()
18/02/07 10:50:29 INFO DAGScheduler: waiting: Set(ResultStage 1)
18/02/07 10:50:29 INFO DAGScheduler: failed: Set()
18/02/07 10:50:29 INFO TaskSetManager: Finished task 0.0 in stage 0.0 (TID 0) in 1253 ms on localhost (executor driver) (1/1)
18/02/07 10:50:29 INFO TaskSchedulerImpl: Removed TaskSet 0.0, whose tasks have all completed, from pool 
18/02/07 10:50:29 INFO DAGScheduler: Submitting ResultStage 1 (MapPartitionsRDD[5] at saveAsTextFile at WordCountDriver.scala:39), which has no missing parents
18/02/07 10:50:29 INFO MemoryStore: Block broadcast_2 stored as values in memory (estimated size 73.1 KB, free 366.0 MB)
18/02/07 10:50:29 INFO MemoryStore: Block broadcast_2_piece0 stored as bytes in memory (estimated size 26.6 KB, free 365.9 MB)
18/02/07 10:50:29 INFO BlockManagerInfo: Added broadcast_2_piece0 in memory on 10.0.2.15:45130 (size: 26.6 KB, free: 366.2 MB)
18/02/07 10:50:29 INFO SparkContext: Created broadcast 2 from broadcast at DAGScheduler.scala:996
18/02/07 10:50:29 INFO DAGScheduler: Submitting 1 missing tasks from ResultStage 1 (MapPartitionsRDD[5] at saveAsTextFile at WordCountDriver.scala:39)
18/02/07 10:50:29 INFO TaskSchedulerImpl: Adding task set 1.0 with 1 tasks
18/02/07 10:50:29 INFO TaskSetManager: Starting task 0.0 in stage 1.0 (TID 1, localhost, executor driver, partition 0, ANY, 5829 bytes)
18/02/07 10:50:29 INFO Executor: Running task 0.0 in stage 1.0 (TID 1)
18/02/07 10:50:29 INFO ShuffleBlockFetcherIterator: Getting 1 non-empty blocks out of 1 blocks
18/02/07 10:50:29 INFO ShuffleBlockFetcherIterator: Started 0 remote fetches in 7 ms
18/02/07 10:50:29 INFO FileOutputCommitter: File Output Committer Algorithm version is 1
18/02/07 10:50:30 INFO FileOutputCommitter: Saved output of task 'attempt_20180207105027_0001_m_000000_1' to hdfs://localhost:9000/user/edureka/WCOP_SP1/_temporary/0/task_20180207105027_0001_m_000000
18/02/07 10:50:30 INFO SparkHadoopMapRedUtil: attempt_20180207105027_0001_m_000000_1: Committed
18/02/07 10:50:30 INFO Executor: Finished task 0.0 in stage 1.0 (TID 1). 1890 bytes result sent to driver
18/02/07 10:50:30 INFO TaskSetManager: Finished task 0.0 in stage 1.0 (TID 1) in 1314 ms on localhost (executor driver) (1/1)
18/02/07 10:50:30 INFO TaskSchedulerImpl: Removed TaskSet 1.0, whose tasks have all completed, from pool 
18/02/07 10:50:30 INFO DAGScheduler: ResultStage 1 (saveAsTextFile at WordCountDriver.scala:39) finished in 1.317 s
18/02/07 10:50:30 INFO DAGScheduler: Job 0 finished: saveAsTextFile at WordCountDriver.scala:39, took 3.349920 s
18/02/07 10:50:31 INFO SparkContext: Invoking stop() from shutdown hook
18/02/07 10:50:31 INFO SparkUI: Stopped Spark web UI at http://10.0.2.15:4040
18/02/07 10:50:31 INFO MapOutputTrackerMasterEndpoint: MapOutputTrackerMasterEndpoint stopped!
18/02/07 10:50:31 INFO MemoryStore: MemoryStore cleared
18/02/07 10:50:31 INFO BlockManager: BlockManager stopped
18/02/07 10:50:31 INFO BlockManagerMaster: BlockManagerMaster stopped
18/02/07 10:50:31 INFO OutputCommitCoordinator$OutputCommitCoordinatorEndpoint: OutputCommitCoordinator stopped!
18/02/07 10:50:31 INFO SparkContext: Successfully stopped SparkContext
18/02/07 10:50:31 INFO ShutdownHookManager: Shutdown hook called
18/02/07 10:50:31 INFO ShutdownHookManager: Deleting directory /tmp/spark-b1bc1e07-6ec9-4c69-8963-eddebf1766dd

--------
----RUN on local file system

$ spark-submit --verbose --class com.laboros.spark.driver.WordCountDriver sparkdemo_2.11-0.1.0-SNAPSHOT.jar file:///home/edureka/SHAHBAZWS/BATCH170917/WordCount.txt /user/edureka/WCOP_SP2

[edureka@localhost sparkjobs]$ hadoop fs -ls /user/edureka/WCOP_SP2
Found 2 items
-rw-r--r--   1 edureka supergroup          0 2018-02-07 11:04 /user/edureka/WCOP_SP2/_SUCCESS
-rw-r--r--   1 edureka supergroup         96 2018-02-07 11:04 /user/edureka/WCOP_SP2/part-00000
[edureka@localhost sparkjobs]$ hadoop fs -cat /user/edureka/WCOP_SP2/part-00000
(learning,1)
(it,1)
(is,2)
(hurryyyyy,1)
(mazing,1)
(This,1)
(first,1)
(my,1)
(hdfs,1)
(file,1)

------------
If spark-shell not work then start all spark services
$ cd /usr/lib/spark-2.1.1-bin-hadoop2.7/sbin/
$ sudo ./start-all.sh

--------Run Weather programe
$ spark-submit --verbose --class com.laboros.spark.driver.WeatherDriver sparkdemo_2.11-0.1.0-SNAPSHOT.jar /user/edureka/Weather
OR
$ spark-submit --verbose --class com.laboros.spark.driver.WeatherDriver sparkdemo_2.11-0.1.0-SNAPSHOT.jar hdfs://localhost:9000/user/edureka/Weather

for yarn cluster its actually failing

$ $ spark-submit --verbose --master yarn --deploy-mode cluster --class com.laboros.spark.driver.WeatherDriver sparkdemo_2.11-0.1.0-SNAPSHOT.jar hdfs://localhost:9000/user/edureka/Weather
