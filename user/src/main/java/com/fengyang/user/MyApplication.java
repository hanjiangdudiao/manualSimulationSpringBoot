package com.fengyang.user;

import com.fengyang.springboot.FengyangSpringApplication;
import com.fengyang.springboot.FengyangSpringBootApplication;

@FengyangSpringBootApplication
public class MyApplication { // spring.factories

    public static void main(String[] args) {
        FengyangSpringApplication.run(MyApplication.class);
    }
}
