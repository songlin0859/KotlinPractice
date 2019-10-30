### 基本语法
#### 包的定义与导入
包的声明应处于源文件顶部：
```
package my.demo
import kotlin.text.*
```
目录与包的结构无需匹配：源代码可以在文件系统的任意位置。
#### 程序入口点
Kotlin 应用程序的入口点是 main 函数。
```
fun main() {
    println("Hello world!")
}
```
### 函数
函数定义
```
fun 函数名（参数1：参数1类型...）:返回值（没有可用省略或者Unit）{
}
```
### 变量
