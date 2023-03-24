package com.interview.string;

public class Test {
    
    final int a = 1;

    public static void main(String[] args) {

        final int a = 1;
        //局部内部类，定义在类中方法内
        class LocalClass {
            
        }
        
        System.out.println(InterTest.get1());
        
    }
    
    private void change(Boolean a){
        a = true;
        //成员方法中使用成院内部类，this找到当前类调用
        MemberClass memberClass = this.new MemberClass();
        
        class InnerClass{
            void method1() {
                System.out.println(Test.this.a);
                
            }
        }

        InnerClass innerClass = new InnerClass();


    }

    //成员内部类，定义在类中方法体外
    class MemberClass {
        
    }
    
}

class TestA {
    
}


//接口里的成员变量必须要实例化，可以使用static也可以普通实例化
interface InterTest {
    public static final int a = 5;
    int b = 0;

    void get();

    //接口中可以使用静态方法
    static int get1() {
        return 1;
    }
}
