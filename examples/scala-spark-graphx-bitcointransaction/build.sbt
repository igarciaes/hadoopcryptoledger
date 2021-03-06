lazy val root = (project in file(".")).
  settings(
    name := "example-hcl-spark-scala-graphx-bitcointransaction",
    version := "0.1",
    scalaVersion := "2.10.6"
  )

scalacOptions += "-target:jvm-1.7"

assemblyJarName in assembly := "example-hcl-spark-scala-graphx-bitcointransaction.jar"

libraryDependencies += "com.github.zuinnote" % "hadoopcryptoledger-fileformat" % "1.0.2" % "compile"

libraryDependencies += "org.apache.spark" % "spark-core_2.10" % "1.5.0" % "provided"

libraryDependencies += "org.apache.spark" % "spark-graphx_2.10" % "1.5.0" % "provided"

libraryDependencies += "org.apache.hadoop" % "hadoop-client" % "2.7.0" % "provided"

libraryDependencies += "org.scalatest" % "scalatest_2.10" % "2.2.1" % "test"

