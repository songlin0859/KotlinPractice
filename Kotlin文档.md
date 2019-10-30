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
变量定义可用使用var/val val定义的变量，只能为其赋值一次
```
var name:String = "sl"
//var name = "sl"
name = "ll" //ok

val age:Int = 28
age = 29 //error
```
### kotlin 代码不需要以逗号结尾 新建一个兑现不需要 new 关键字
```
val user:User = User("name",23)
```

### 注释
Kotlin 支持单行（或行末）与多行（块）注释
```
// 这是一个行注释

/* 这是一个多行的
   块注释。 */
```
### 字符串模板
```
var a = 1
// 模板中的简单名称：
val s1 = "a is $a" 

a = 2
// 模板中的任意表达式：
val s2 = "${s1.replace("is", "was")}, but now is $a"
```
### 空值与 null 检测
### 类型检测与自动类型转换
### if
### for
### while 
### in
### Collections














