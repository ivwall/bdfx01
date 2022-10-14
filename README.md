# bdfx01
block dat file explorer

starting with this example
https://vlkan.com/blog/post/2014/06/27/parse-bitcoin-blockchain/


other links
https://learnmeabitcoin.com/technical/blkdat
https://subscription.packtpub.com/book/data/9781788475686/1/ch01lvl1sec03/interact-with-the-blockchain


<pre>
cf2141s-MacBook-Pro:bdfx01 cf2141$ gradle init

Select type of project to generate:
  1: basic
  2: application
  3: library
  4: Gradle plugin
Enter selection (default: basic) [1..4] 2

Select implementation language:
  1: C++
  2: Groovy
  3: Java
  4: Kotlin
  5: Scala
  6: Swift
Enter selection (default: Java) [1..6] 3

Split functionality across multiple subprojects?:
  1: no - only one application project
  2: yes - application and library projects
Enter selection (default: no - only one application project) [1..2] 2

Select build script DSL:
  1: Groovy
  2: Kotlin
Enter selection (default: Groovy) [1..2] 

Generate build using new APIs and behavior (some features may change in the next minor release)? (default: no) [yes, no] 
Project name (default: bdfx01): io.crtp.bdfx
Source package (default: io.crtp.bdfx): 

> Task :init
Get more help with your project: https://docs.gradle.org/7.5.1/samples/sample_building_java_applications_multi_project.html

BUILD SUCCESSFUL in 2m 17s
2 actionable tasks: 2 executed
cf2141s-MacBook-Pro:bdfx01 cf2141$
</pre>

## setup to generate a fat file, fatJar
see src/build.gradle

## slf4j
https://mkyong.com/logging/slf4j-logback-tutorial/

https://www.slf4j.org/download.html
