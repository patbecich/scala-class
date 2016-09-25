
// Read here for dependencies
// https://github.com/scalanlp/breeze#sbt

// Set sub-project on SBT start: http://stackoverflow.com/a/22240142/1007926
//     onLoad in Global := { Command.process("project distributions", _: State) } compose (onLoad in Global).value



// formatting of dependencies
// http://www.scala-sbt.org/0.13/docs/Library-Dependencies.html#The++key
// Task 4d
// lazy val commonSettings: Seq[Def.Setting[_]] = ???

// Task 4c
// lazy val root: Project = ???

// Task 4a
lazy val distributions: Project =  (project in file("distributions")).
  settings(
    name := "distributions",
    version := "1.0",
    scalaVersion := "2.11.8",
    // formatting of dependencies
    // http://www.scala-sbt.org/0.13/docs/Library-Dependencies.html#The++key
    libraryDependencies ++= Seq(
      "org.scalanlp" %% "breeze" % "0.12",
      "org.scalanlp" %% "breeze-natives" % "0.12"
    )
  )

// Task 4b
// lazy val plotting: Project = ???


