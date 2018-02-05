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