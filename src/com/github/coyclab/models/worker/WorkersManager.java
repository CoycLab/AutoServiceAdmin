package com.github.coyclab.models.worker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WorkersManager {

    private static List<Worker> workerList = new ArrayList<>();

    public static void addWorker(String name) {
        Worker worker = new Worker(name);
        workerList.add(worker);
    }

    public static void deleteWorker(String name) {
        for (int i = 0; i < workerList.size() ; i++) {
            if (workerList.get(i).getWorkerName().equals(name)){
                workerList.remove(i);
            }
        }
    }

    public static void sortByName(List<Worker> list){

        Collections.sort(list, (o1, o2) -> o1.getWorkerName().compareTo(o2.getWorkerName()));
    }

    public static void sortByFree(List<Worker> list){
        Collections.sort(list, (o1, o2) -> {
            if (!o1.isFree() && o2.isFree()){
                return 1;
            } else if (o1.isFree() && !o2.isFree()){
                return -1;
            } else return 0;
        });
    }

    public static List<Worker> getWorkerList() {
        return workerList;
    }


}
