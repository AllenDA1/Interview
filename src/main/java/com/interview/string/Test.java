package com.interview.string;

import com.google.gson.Gson;
import com.google.gson.JsonParser;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Test {

    public static void main(String[] args) {
    }
    
    private void change(Boolean a){
        a = true;
    }
    
}


//接口里的成员变量必须要实例化，可以使用static也可以普通实例化
interface interTest {
    public static final int a = 5;
    int b = 0;
}
