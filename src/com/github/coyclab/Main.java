package com.github.coyclab;

import com.github.coyclab.facade.Director;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Director director = new Director();
        director.init();

        System.out.println(director.addWorker(4, "TEST"));
        System.out.println(director.getWorkers());
    }
}
