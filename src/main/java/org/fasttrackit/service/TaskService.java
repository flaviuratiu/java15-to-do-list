package org.fasttrackit.service;

import org.fasttrackit.domain.Task;
import org.fasttrackit.persitance.TaskRepository;
import org.fasttrackit.transfer.CreateTaskRequest;
import org.fasttrackit.transfer.UpdateTaskRequest;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class TaskService {

    private TaskRepository taskRepository = new TaskRepository();

    public void createTask(CreateTaskRequest request) throws SQLException, IOException, ClassNotFoundException {
        System.out.println("Creating task: " + request);
        taskRepository.createTask(request);
    }

    public void updateTask(long id, UpdateTaskRequest request) throws SQLException, IOException, ClassNotFoundException {
        System.out.println("Updating task " + id + ": " + request);
        taskRepository.updateTask(id, request);
    }

    public void deleteTask(long id) throws SQLException, IOException, ClassNotFoundException {
        System.out.println("Deleting task " + id);
        taskRepository.deleteTask(id);
    }

    public List<Task> getTasks() throws SQLException, IOException, ClassNotFoundException {
        System.out.println("Retrieving tasks");
        return taskRepository.getTasks();
    }
}
