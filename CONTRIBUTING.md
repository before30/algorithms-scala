## Scala and SBT version
- [Scala 2.11.8](http://www.scala-lang.org/api/2.11.8/)
- [SBT 0.13.15](http://www.scala-sbt.org/0.13/docs)

## Code Style
- Follow [.editorconfig](.editorconfig)

## Writing test codes
- Write your test codes with [scalatest](http://www.scalatest.org).
- [WordSpec](http://www.scalatest.org/user_guide/selecting_a_style) style

## How to import project
### IntelliJ IDEA
1. install scala plugin
2. import project with sbt

### Eclipse
1. move to project root
2. open **sbt** shell and command  
    ```sbtshell
    > eclipse
    ```
3. install [scalatest-eclipse-plugin](https://github.com/scalatest/scalatest-eclipse-plugin)
4. import project with _**Existing Projects into Workspace**_
