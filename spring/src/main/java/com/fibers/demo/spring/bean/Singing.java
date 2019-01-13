package com.fibers.demo.spring.bean;

import com.fibers.demo.spring.iface.Performance;

public class Singing implements Performance {

    @Override
    public void perform_pointcut() {
        System.out.println("Singing a song");
    }

    @Override
    public void perform_namedPointcut() {
        System.out.println("Singing a song");
    }

    @Override
    public void perform_parameterPointcut(String what) {
        System.out.println("Singing a song : " + what);
    }
}
