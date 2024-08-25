### Notes

* Run `./gradlew build`, see it pass
* Go to `build.gradle.kts` change Kotlin version from `2.0.0` to `1.9.20` on line 4
* Run `./gradlew build` again, see it fail with 

```
> Task :compileKotlin FAILED
e: warnings found and -Werror specified
w: file:///Users/qwwdfsad/Desktop/warnings-test/src/main/kotlin/Main.kt:4:9 Variable 'a' is never used
w: file:///Users/qwwdfsad/Desktop/warnings-test/src/main/kotlin/Main.kt:9:9 Variable 'a' is never used
```
