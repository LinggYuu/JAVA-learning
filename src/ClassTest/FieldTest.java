package ClassTest;

import java.util.Scanner;

public class FieldTest {
    public static void main(String[] args) {
        User au = new User();
        int age = au.age(4);
        System.out.println("my age is "+age);
    }
}

class User{
    //属性field,成员变量
    String name;
    int age;
    public void eat(String food){
        System.out.println("I ate an "+food);
    }//food为形参,为局部变量
    public void speak(){
        String lan = "chinese";//lan为局部变量
        //非形参的局部变量初始化一下
        System.out.println("我讲 "+lan);
    }
    public int age(int age){
        return age;
    }
}