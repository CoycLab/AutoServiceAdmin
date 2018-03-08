package com.github.coyclab.managers;

import com.github.coyclab.api.AManager;
import com.github.coyclab.models.Worker;
import com.github.coyclab.repository.WorkerRepo;

import java.util.ArrayList;
import java.util.List;

public class WorkerManager extends AManager<WorkerRepo, Worker> {

    public WorkerManager() {
        super(new WorkerRepo());
    }

    public List<Worker> getWorkers() {

        return repository.getRepository();
    }

    public List<Worker> getFreeWorkers() {
        List<Worker> workers = repository.getRepository();
        List<Worker> freeWorkers = new ArrayList<>();

        for (Worker w : workers) {
            if (w.isFree()) {
                freeWorkers.add(w);
            }
        }

        return freeWorkers;
    }

    public Boolean add(int id, String name) {
        if (isFreeId(id)){
            Worker worker = new Worker(id, name);
            repository.getRepository().add(worker);
            return true;
        }
        return false;
    }

    public void remove(int id) {
        List<Worker> workerList = repository.getRepository();
        boolean flag = false;
        for (int i = 0; i < workerList.size(); i++) {
            if (workerList.get(i).getId().equals(id)) {
                workerList.remove(i);
                flag = true;
            }
        }

        if (!flag) {
            System.out.println("Нет работника с таким номером...");
        }
    }

    public void remove(String name) {
        List<Worker> workerList = repository.getRepository();
        boolean flag = false;

        for (int i = 0; i < workerList.size(); i++) {
            if (workerList.get(i).getName().equals(name)) {
                workerList.remove(i);
                flag = true;
                break;
            }
        }

        if (!flag) {
            System.out.println("Нет работника с таким именем...");
        }

    }

}
