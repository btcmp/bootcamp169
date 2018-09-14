# Java Teory

## Java Object 
* java object merupakan proses instansiasi dari sebuah java class
* example 
```java
    String[] data = new String[5];
	Object object = new Object(); //proses instansiasi object
	Employee employee = new Employee();
	Integer myinteger = new Integer(5);
	int myint = 5;
```

## Java Clas
* merupakan descripsi atau blue print dari sebuah object.
* example : 
```java
//java class
class Motor{
	//properties
	String merk;
	String color;
	String platNomor;
	Double price;
}

//ketika java class mau dipanggil maka, 
//Motor motor = new Motor(); //java object / instansiasi object
```

## Variable Primitive
* merupakan sebuah variable yang tidak mememiliki class reference 
atau hanya type data itu sendiri.
* contoh : 
```java
int a = 5;
char b= '5';
double c = 400.0;
```

## Constructor
* sebuah contructor akan dijalankan ketika 
terjadinya instansiasi dari sebuah class
* Contoh : 
```java
class Employee{
    //empty constructor
    Employee(){
        System.out.println("hallo constructor");
    }
    //parameter consturctor / overloading constructor
    Employee(String username){
        System.out.println("hallo : "+ username);
    }
    public void info(){
        System.out.println("hallo world");
    }
}

public class MyContructor {
    public static void main(String[] args) {
        Employee emp =  new Employee();
        Employee emp2 = new Employee("husni");
       // emp.info();
    }
}
```

## Overloading
* adalah sebuah method / constructor yang memiliki nama yang sama
namun memiliki perbedaan dalam : 
	1. jumlah paremeter
	2. Class Refference / datatype

* contoh : 
```java
public class MyOverloading {
    
    //method 1
    public void info(){
    }
    
    //overload jumlah parameter
    public void info(String username){
    }
    //overload
    public void info(String username, int age){
    }
    //overload
    public void info(int age){
    }
    
    public static void main(String[] args) {
        MyOverloading over = new MyOverloading();
        over.info();
    }
}
```	

## Inheritance 
* sebuah super class yang dapat diturunkan kepada subclass 
dengan memiliki kesamaan description / properties
* contoh : 
```java
class EmployeeX{
    String name;
    String email;
}

class ManagerX extends EmployeeX{
}

class DirectorX extends ManagerX{
}

//key dari inhiritance adalah 'IS'
public class MyInheritance {
    public static void main(String[] args) {
        EmployeeX emp = new EmployeeX();
        emp.name="rusdan";
        DirectorX dir = new DirectorX();
        dir.name = "dini";
        //polymorphism
//        EmployeeX manager = new ManagerX();
//        manager.name = "dono";       
    }
}
```
1. Java Object ?*
2. Java Class ?*
#. Variable Primitive *
3. Constructor *
4. Overloading *
5. Inheritance ? *
6. Overriding ? * 
7. Super ?
8. Java Beans and Encapsulation?
9. Polymorphism ?