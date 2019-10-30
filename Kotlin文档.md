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
---
### 类与对象
### 类
Kotlin 中使用关键字 **class** 声明类
```
class Invoice { /*……*/ }
```
### 构造函数
在 Kotlin 中的一个类可以有一个主构造函数以及一个或多个次构造函数。主构造函数是类头的一部分：它跟在类名（与可选的类型参数）后。
```
class Person constructor(firstName: String) { /*……*/ }
```
如果主构造函数没有任何注解或者可见性修饰符(private)，可以省略这个 constructor 关键字。
```
class Person(firstName: String) { /*……*/ }
```
init 关键字作为前缀的初始化块
```
class User{
    init{
        //init codes
    }
}
```
### 继承
在 Kotlin 中所有类都有一个共同的超类 Any(Java 中的 Object)，这对于没有超类型声明的类是默认超类
Any 有三个方法：equals()、 hashCode() 与 toString()
### 伴生对象
### 属性与字段
#### 声明属性
Kotlin 类中的属性既可以用关键字 var 声明为可变的，也可以用关键字 val 声明为只读的。
要使用一个属性，只要用名称引用它即可：
#### Getters 与 Setters
```
var <propertyName>[: <PropertyType>] [= <property_initializer>]
    [<getter>]
    [<setter>]
    
    var name:String = "sl"
        get(){
            return "c"+field
        }
        set(value){
            field = value
        }
        
```
#### 延迟初始化属性与变量
一般地，属性声明为非空类型必须在构造函数中初始化。 然而，这经常不方便。例如：属性可以通过依赖注入来初始化， 或者在单元测试的 setup 方法中初始化。 这种情况下，你不能在构造函数内提供一个非空初始器。 但你仍然想在类体中引用该属性时避免空检测。

为处理这种情况，你可以用 ***lateinit*** 修饰符标记该属性

#### 关键字 open & override
### 接口
Kotlin 的接口可以既包含抽象方法的声明也包含实现。与抽象类不同的是，接口无法保存状态。它可以有属性但必须声明为抽象或提供访问器实现。

使用关键字 interface 来定义接口
```
interface MyInterface {
    fun bar()
    fun foo() {
      // 可选的方法体
    }
}
```
### 可见性修饰符
类、对象、接口、构造函数、方法、属性和它们的 setter 都可以有 可见性修饰符。 （getter 总是与属性有着相同的可见性。） 在 Kotlin 中有这四个可见性修饰符：private、 protected、 internal 和 public。 如果没有显式指定修饰符的话，默认可见性是 public。
### 扩展函数
### Kotlin 集合
1. List 是一个有序集合，可通过索引（反映元素位置的整数）访问元素。元素可以在 list 中出现多次。列表的一个示例是一句话：有一组字、这些字的顺序很重要并且字可以重复。
2. Set 是唯一元素的集合。它反映了集合（set）的数学抽象：一组无重复的对象。一般来说 set 中元素的顺序并不重要。例如，字母表是字母的集合（set）。
3. Map（或者字典）是一组键值对。键是唯一的，每个键都刚好映射到一个值。值可以重复。map 对于存储对象之间的逻辑连接非常有用，例如，员工的 ID 与员工的位置。
### 构造集合
创建集合的最常用方法是使用标准库函数 listOf<T>()、setOf<T>()、mutableListOf<T>()、mutableSetOf<T>()。 如果以逗号分隔的集合元素列表作为参数，编译器会自动检测元素类型。创建空集合时，须明确指定类型。
### 集合操作 map filter ...
---
### 其他
### 解构声明
### 类型检测与类型转换：“is”与“as” as?
### This 表达式
### 相等性(结构相等 & 引用相等)
1. 结构相等（用 equals() 检测）；
2. 引用相等（两个引用指向同一对象）。
> 引用相等由 ===（以及其否定形式 !==）操作判断。a === b 当且仅当 a 与 b 指向同一个对象时求值为 true。对于运行时表示为原生类型的值 （例如 Int），=== 相等检测等价于 == 检测。
    
---
### let with apply also when
### 协程 （个人觉得和dart中的async await相同）










