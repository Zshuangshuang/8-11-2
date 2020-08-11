package com.Zss.www;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-08-11
 * Time:21:39
 **/
class Money implements Cloneable{
    double money = 12.99;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class Person implements Cloneable{
    public int age;
    Money m = new Money();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //return super.clone();
        Person p1 = (Person)super.clone();
        p1.m =(Money)this.m.clone();
        return p1;
    }
}
public class TestDemo {
    public static void main(String[] args) throws CloneNotSupportedException  {
        Person p1 = new Person();
        Person p2 =(Person) p1.clone();
        System.out.println(p1.m.money);
        System.out.println(p2.m.money);
        p2.m.money = 990;
        System.out.println(p1.m.money);
        System.out.println(p2.m.money);
    }
    public static void main1 (String[] args)throws CloneNotSupportedException {
        Person p1 = new Person();
        Person p2 =(Person) p1.clone();
        System.out.println(p1.age);
        System.out.println(p2.age);
        p2.age = 99;
        System.out.println(p1.age);
        System.out.println(p2.age);
    }
}
