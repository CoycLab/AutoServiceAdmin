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
            if (w.getWorkerStatus().equals(Worker.Status.FREE)) {
                freeWorkers.add(w);
            }
        }

        return freeWorkers;
    }

    public boolean add(int id, String name) {
        return repository.add(new Worker(id, name));
    }

    public boolean remove(int id) {
        return repository.remove(getItemById(id));
    }
}
