addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.9")
addSbtPlugin("io.spray"     % "sbt-revolver" % "0.10.0")
// Figure out how to setup new permissions https://github.com/sbt/sbt-native-packager/pull/1190
addSbtPlugin("com.github.sbt"        % "sbt-native-packager"  % "1.9.16")
addSbtPlugin("com.eed3si9n"          % "sbt-buildinfo"        % "0.9.0")
addSbtPlugin("com.github.sbt"        % "sbt-dynver"           % "5.0.1")
addSbtPlugin("org.scalameta"         % "sbt-scalafmt"         % "2.4.2")
addSbtPlugin("com.snowplowanalytics" % "sbt-snowplow-release" % "0.3.1")
