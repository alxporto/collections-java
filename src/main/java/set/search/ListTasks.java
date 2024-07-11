package main.java.set.search;

import java.util.HashSet;
import java.util.Set;

public class ListTasks {
  //attributes
  private Set<Task> tasksSet;

  //constructor
  public ListTasks() {
      this.tasksSet = new HashSet<>();
  }
  public void addTask(String description) {
      tasksSet.add(new Task(description));
  }
  public void removeTask(String description) {
      Task taskToRemove = null;
      if (!tasksSet.isEmpty()) {
          for (Task task : tasksSet) {
               if (task.getDescription().equalsIgnoreCase(description)) {
                   taskToRemove = task;
                   break;
               }
          }
          tasksSet.remove(taskToRemove);
      } else {
        System.out.println("The set is empty!");
      }
      if (taskToRemove == null) {
          System.out.println("Task not found!");
      }
  }
  public void showTasks() {
      if (!tasksSet.isEmpty()) {
          System.out.println(tasksSet);
      } else {
          System.out.println("Task not found!");
      }
  }
  public int countTasks() {
      return tasksSet.size();
  }
  public Set<Task> getDoneTasks() {
      Set<Task> doneTasks = new HashSet<>();
      for (Task task : tasksSet) {
           if (task.isDone()) {
               doneTasks.add(task);
           }
      }
      return doneTasks;
  }
  public Set<Task> getPendingTasks() {
      Set<Task> pendingTasks = new HashSet<>();
      for (Task task : tasksSet) {
           if (!task.isDone()) {
               pendingTasks.add(task);
           }
      }
      return pendingTasks;
  }
  public void markDoneTasks(String description) {
      for (Task task : tasksSet) {
           if (task.getDescription().equalsIgnoreCase(description)) {
               task.setDone(true);
           }
      }
  }
  public void markPendingTasks(String description) {
      Task taskToMarkAsPending = null;
      for (Task task : tasksSet) {
           if (task.getDescription().equalsIgnoreCase(description)) {
               taskToMarkAsPending = task;
               break;
           }
      }

      if (taskToMarkAsPending != null) {
          if (taskToMarkAsPending.isDone()) {
              taskToMarkAsPending.setDone(false);
          }
      } else {
          System.out.println("Task not found in list.");
      }
  }
  public void cleanTasksList() {
      if (!tasksSet.isEmpty()) {
          System.out.println("The list is already empty!");
      } else {
          tasksSet.clear();
      }
  }

  public static void main(String[] args) {
    //creating an instance of the listtasks class
    ListTasks listTasks = new ListTasks();

    //adding tasks to the list
    listTasks.addTask("Study Java");
    listTasks.addTask("Do exercises");
    listTasks.addTask("Organize the work table");
    listTasks.addTask("Read a book");
    listTasks.addTask("Prepare the presentation");

    //showing the tasks in list
    listTasks.showTasks();

    //removing a task
    listTasks.removeTask("Do exercises");
    listTasks.showTasks();

    //counting the number of tasks in list
    System.out.println("Total of tasks in list: " + listTasks.countTasks());

    //getting the pending tasks
    System.out.println(listTasks.getPendingTasks());

    //marking the done tasks
    listTasks.markDoneTasks("Read a book");
    listTasks.markDoneTasks("Study Java");

    //getting the done tasks
    System.out.println(listTasks.getDoneTasks());

    //marking the pending tasks
    listTasks.markPendingTasks("Sudy Java");
    listTasks.showTasks();

    //cleaning the tasks list
    listTasks.cleanTasksList();
    listTasks.showTasks();
  }
}
