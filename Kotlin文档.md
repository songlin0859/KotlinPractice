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
在 Kotlin 中，if是一个表达式，即它会返回一个值。 因此就不需要三元运算符（条件 ? 然后 : 否则），因为普通的 if 就能胜任这个角色。
```
// 传统用法
var max = a 
if (a < b) max = b

// With else 
var max: Int
if (a > b) {
    max = a
} else {
    max = b
}
 
// 作为表达式
val max = if (a > b) a else b
```
### when
when 取代了类 C 语言的 switch 操作符
when 将它的参数与所有的分支条件顺序比较，直到某个分支满足条件。
```
when (x) {
    //我们可以用任意表达式（而不只是常量）作为分支条件
    1 -> print("x == 1")
    2 -> print("x == 2")
    else -> { // 注意这个块
        print("x is neither 1 nor 2")
    }
}
```
### for
for 循环可以对任何提供迭代器（iterator）的对象进行遍历
```
for (item: Int in ints) {
    // ……
}
```
### while 
while 与 do..while 照常使用
```
while (x > 0) {
    x--
}
```
### in
### 返回和跳转
Kotlin 有三种结构化跳转表达式：
1. return。默认从最直接包围它的函数或者匿名函数返回。
2. break。终止最直接包围它的循环。
3. continue。继续下一次最直接包围它的循环。


### Collections
### 基本类型
#### 数字
```
类型 	大小（比特数） 	最小值 	最大值
Byte 	8 	-128 	127
Short 	16 	-32768 	32767
Int 	32 	-2,147,483,648 (-231) 	2,147,483,647 (231 - 1)
Long 	64 	-9,223,372,036,854,775,808 (-263) 	9,223,372,036,854,775,807 (263 - 1)
```
### 字符
```
Char 
```
### 布尔
```
布尔用 Boolean 类型表示，它有两个值：true 与 false。
```
### 数组
数组在 Kotlin 中使用 Array 类来表示，它定义了 get 与 set 函数（按照运算符重载约定这会转变为 []）以及 size 属性，以及一些其他有用的成员函数：
### 字符串
字符串用 String 类型表示
#### 字符串模板
字符串字面值可以包含模板表达式 ，即一些小段代码，会求值并把结果合并到字符串中。 模板表达式以美元符（$）开头，由一个简单的名字构成
```
val i = 10
println("i = $i") // 输出“i = 10”
```











