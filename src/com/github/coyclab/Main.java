package com.github.coyclab;

import com.github.coyclab.facade.Director;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Director director = new Director();
        director.init();


        director.addOrder(11,new Date(), new Date(), 55.55f);
        director.closeOrder(11);
        System.out.println(director.getFreeWorkers());

    }
}
