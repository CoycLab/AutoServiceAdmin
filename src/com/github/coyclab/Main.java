package com.github.coyclab;

import com.github.coyclab.facade.Director;
import com.github.coyclab.models.Order;
import com.github.coyclab.utils.MyList;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Director director = new Director();
        director.init();

        MyList<Integer> list = new MyList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);
        System.out.println(list.size());


    }
}
