package main.java.list.basicoperations;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
  //attributes
  private List<Task> taskList;

  public TaskList() {
    this.taskList = new ArrayList<>();
  }

  public void addTask(String description) {
    taskList.add(new Task(description));
  }

  public void removeTask(String description) {
    List<Task> tasksToRemove = new ArrayList<>();
    if (!taskList.isEmpty()) {
    for (Task task : taskList) {
       if (task.getDescription().equalsIgnoreCase(description)) {
           tasksToRemove.add(task);
       }
    }
    taskList.removeAll(tasksToRemove);
  } else {
      System.out.println("The list is empty!");
    }
  }

  public int getTotalTasksNumber() {
    return taskList.size();
  }

  public void getTasksDescriptions() {
    if (!taskList.isEmpty()) {
      System.out.println(taskList);
    } else {
      System.out.println("The list is empty!");
    }
  }

  public static void main(String[] args) {
    //creating an instance of tasklist class
    TaskList taskList = new TaskList();

    //adding tasks to the list
    taskList.addTask("Buy milk");
    taskList.addTask("Study for the exams");
    taskList.addTask("Do exercises");

    //displaying the total number of tasks in list
    System.out.println("You have " + taskList.getTotalTasksNumber() + " tasks in list:");

    //showing the tasks descriptions in list
    taskList.getTasksDescriptions();

    //removing a task from the list
    taskList.removeTask("Do exercises");

    //displaying the total number of tasks in list after the remotion
    System.out.println("You have " + taskList.getTotalTasksNumber() + " tasks in list now:");

    //showing the updated tasks descriptions in list
    taskList.getTasksDescriptions();

    //removing tasks from the list
    taskList.removeTask("Buy milk");
    taskList.removeTask("Study for the exams");

    //removing a task from the list when the list is empty
    taskList.removeTask("Study for the exams");

    //displaying the total number of tasks in list after trying to remove from a empty list
    System.out.println("You have " + taskList.getTotalTasksNumber() + " tasks in list now.");
  }
}
