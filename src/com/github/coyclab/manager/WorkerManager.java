package com.github.coyclab.manager;

import com.github.coyclab.api.AManager;
import com.github.coyclab.models.Worker;
import com.github.coyclab.repository.WorkerRepo;

import java.util.ArrayList;
import java.util.List;

public class WorkerManager extends AManager<WorkerRepo, Worker> {

    public WorkerManager() {
        super(new WorkerRepo());
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
}
