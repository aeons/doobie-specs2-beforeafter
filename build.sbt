scalaVersion := "2.12.3"

libraryDependencies ++= Seq(
  "org.tpolecat"   %% "doobie-core"   % "0.5.0-M6",
  "org.postgresql" % "postgresql"     % "42.1.4",
  "org.tpolecat"   %% "doobie-specs2" % "0.5.0-M6" % "test"
)
