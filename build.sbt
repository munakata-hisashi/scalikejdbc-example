scalaVersion := "2.12.4"

libraryDependencies ++= Seq(
  "org.scalikejdbc"  %% "scalikejdbc"  % "3.2.+",
  "org.slf4j"        %  "slf4j-simple" % "1.7.+",
  "com.h2database"   %  "h2"           % "1.4.+",
  "org.scalatest"    %% "scalatest"    % "3.0.+" % "test",
  "joda-time" % "joda-time" % "2.10.5",
  "org.scalikejdbc" %% "scalikejdbc-joda-time" % "3.4.0",
  "org.scalikejdbc" %% "scalikejdbc-syntax-support-macro" % "3.2.+"
)
