# 1. Y HALO THAR WURLD

Welcome to the first session of this training course.

Slides are located in `index.html`. It should work out-of-the-box by just opening the file in your browser.

This folder also contains a `build.sbt`, and some sample code that we'll soon be modifying.


## Notes for Slides

This section is mainly for teacher notes. They're located in this handy README so that people can easily locate them, and possibly, do the course by themselves.


#### 1 Intro

 - This course aims to get you up to speed with Scala.
 - Scala can actually be simple.
 - We want to build things.
 - Things will be missed out. We will mention this, and provide links for further reading.

#### 2

 - This is Hello World in Scala.
 - Just this simple example already says some things about the language.
   - Objects and Classes. An object is a Singleton class.
   - def defines methods. They are public by default.
   - It has generics, as shown by `Array[String]`.
   - println is how we send text to `stdout`.

#### 3

 - We can define functions inside other functions.
 - Closures.
 - String concatentation.

#### 4

 - You've seen classes before. Scala also has `case class`.
 - These are classes with lots of utility methods already defined for you.
 - Case classes are most commonly used as Value objects / Data objects. They rarely have methods in Scala codebases.
 - If you want to represent some data, model it using a case class.
 - classes can be used to model data
   - you'll need to use the `new` keyword
   - declare the constructor params as vals, or write get methods for all of them
 - classes to encapsulate behaviour. case classes for data.

#### 5. Exercise 1

 - Time to code! Checkout this repo, run SBT in this directory. Change code in src/main/scala.
 - We have a case class, and a few instances of it.
 - We have a class, with a method.
 - Code up the rules, so when you pass each case class to the method, it behaves appropriately.
 - Use an if statements.

#### 6

 - You don't actually need if-statements! Match statements provide more power, and are often easier to read.
 - name and price are destructured to n and p, and usuable only in the scope of the statement after the arrow.
 - For this example, match is superfluous.

#### 7

 - Match statements can have guard clauses via `if`.
 - Match statements are tried in order. All combinations must be included in a match statement, or your code will throw a `scala.MatchError`.

#### 8

 - The middle clause now only matches if the name equals "Black Shoes", and the underscore represents that we don't care about the price.
 - You can also do OR statements in a match case.

#### 9. Exercise 2

 - Use match statements. Watch out for MatchErrors.

