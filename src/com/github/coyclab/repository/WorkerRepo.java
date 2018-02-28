package com.github.coyclab.repository;

import com.github.coyclab.api.ARepository;
import com.github.coyclab.models.Worker;

import java.util.ArrayList;
import java.util.List;

public class WorkerRepo extends ARepository {

    private List<Worker> workerList;

    public WorkerRepo() {
        this.workerList = new ArrayList<>();
    }

    public List<Worker> getWorkerList() {
        return workerList;
    }
}
