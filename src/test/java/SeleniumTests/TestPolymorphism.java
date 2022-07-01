package SeleniumTests;


import org.testng.annotations.Test;

import java.util.*;

public class TestPolymorphism {

    int a=10;

    TestPolymorphism()
    {
        this.a=25;
    }
    TestPolymorphism(int a)
    {
        this.a=a;
    }


    int overloading(int a)
    {
        System.out.println("I am in Super class now");
        System.out.println(this.a);
        return a;
    }

}
class TestPoly1 extends TestPolymorphism
{
    int a=7;
    int overloading(int a)
    {
        System.out.println("I am in Super class:"+super.a);
        System.out.println("I am in function:"+this.a);
        System.out.println("I am in class:"+a);
        super.overloading(a);
        return a;
    }

}

interface asasasa{
    static int a=0;
}
interface asasasa1{
    static int a=0;
}
class asasaa implements asasasa,asasasa1
{

}
class Main{
    public static void main(String[] args) {
        TestPolymorphism testPolymorphism = new TestPoly1();
        testPolymorphism.overloading(5);
    }

    Set<String> hashSet = new HashSet<>();






}

    class Test123
    {
        public static void main(String[] args) {
            String a="SNJV";
            a=a.toLowerCase();

            List<Character> charSet = new ArrayList<Character>();
            charSet.add('a');
            charSet.add('e');
            charSet.add('i');
            charSet.add('o');
            charSet.add('u');
            charSet.add('A');
            charSet.add('E');
            charSet.add('I');
            charSet.add('O');
            charSet.add('U');

            boolean b=false;
            char []aa=a.toCharArray();
            for(char c:aa) {
                if (charSet.contains(c))
                {
                    b=true;
                    break;
                }
            }
        System.out.println(b);
        }

    }
