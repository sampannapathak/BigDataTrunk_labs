./bin/spark-shell

val msg="Hello How are you"   ##immutable

var newmsg="Hello How are you" ##mutable

msg=10

val x={val a=20;val b=100;b-a}

lazy val file=scala.io.Source.fromFile("Unitedstates").mkString


var args="700"
var i=0
while(i<args.length)
{
println(args(i))
i+=1
}


var args="hi"
args.foreach(arg=>println(arg))
args.foreach(println)


for (i<-1 to 5)
println(i)


val in ="Hello World"
var sum=0
for (i<-0 until in.length)sum+=i
print(sum)


for(i<-1 to 3;j<-1 to 3)println(10*i+j)


for(i<-1 to 3;j<-1 to 3 if i==j)println(10*i+j)


for(i<-1 to 3; x=4-i;j<-x to 3)println(10*i+j)
val x=for(i<-1 to 20)yield i*2.5
for(i<-x)println(i)


def area(radius:Int):Double={3.14*radius*radius}

val n=new Array[Int] (10)
val s=new Array[String] (10)
val st=Array("Hello", "World")

#

import scala.collection.mutable.ArrayBuffer
val a=ArrayBuffer[Int]()
a+=1
a+=(2,3,5)
a++=Array(6,7,8)


Array(1,2,3,4).sum
Array(1,2,3,4).max
val a=Array(1,7,2,9)
a.mkString("**")


for(el<-a)
println(el)
for(el<-a if el%2==0)yield(2*el)


val mapping=Map("UnitedStates"->"UnitedKingdom","Tokyo"->"India")
val mapping=scala.collection.mutable.Map("UnitedStates"->"U","Tokyo"->"I")
val x=mapping("UnitedStates")
val x=mapping.getOrElse("Unit",0)

#We can use iterator to iterate over a list, but recursion is a preferred practice in scala 
def sum(l:List[Int]):Int={if(l==Nil)0 else l.head + sum(l.tail)}
val y=sum(lst)