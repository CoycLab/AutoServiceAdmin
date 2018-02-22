package com.github.coyclab;

import com.github.coyclab.models.worker.Worker;
import com.github.coyclab.models.worker.WorkersManager;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        WorkersManager.addWorker("Zigmund");
        WorkersManager.addWorker("Alexey");
        WorkersManager.addWorker("Fedor");

        List<Worker> workers = WorkersManager.getWorkerList();


    }
}
