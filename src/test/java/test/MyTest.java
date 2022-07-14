package test;

import org.junit.Test;

public class MyTest {

    @Test
    public void test1() {
        for (int i = 0; i < 4; i++) {
            // i ==> byte、char、short、int、String、enum (对应的包装类型)
            // 不支持long类型
            switch (i) {
                case 1:
                    System.out.println("one");
                    break;

                case 2:
                    System.out.println("two");
                    break;

                case 3:
                    System.out.println("three");
                    break;
            }
        }
    }
}
