package org.fasttrackit;

import org.fasttrackit.domain.Task;
import org.fasttrackit.persitance.TaskRepository;
import org.fasttrackit.transfer.CreateTaskRequest;
import org.fasttrackit.transfer.UpdateTaskRequest;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException, SQLException, ClassNotFoundException {
        CreateTaskRequest request = new CreateTaskRequest();
        request.setDescription("Learn JDBC");
        request.setDeadline(LocalDate.now().plusWeeks(2));

        TaskRepository taskRepository = new TaskRepository();
        taskRepository.createTask(request);

//        UpdateTaskRequest updateRequest = new UpdateTaskRequest();
//        updateRequest.setDone(true);

//        taskRepository.updateTask(1, updateRequest);

//        taskRepository.deleteTask(1);

        List<Task> tasks = taskRepository.getTasks();
        System.out.println(tasks);
    }
}
