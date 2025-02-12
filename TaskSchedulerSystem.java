import java.util.Scanner;

class Task {
    int taskId;
    String taskName;
    int priority;
    String dueDate;
    Task next;

    public Task(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

class TaskScheduler {
    private Task head = null;
    private Task tail = null;
    private Task currentTask = null;

    public void addTaskAtBeginning(int taskId, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newTask;
            tail = newTask;
            newTask.next = head;
        } else {
            newTask.next = head;
            head = newTask;
            tail.next = head;
        }
    }

    public void addTaskAtEnd(int taskId, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newTask;
            tail = newTask;
            newTask.next = head;
        } else {
            tail.next = newTask;
            tail = newTask;
            tail.next = head;
        }
    }

    public void addTaskAtPosition(int taskId, String taskName, int priority, String dueDate, int position) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (position <= 1 || head == null) {
            addTaskAtBeginning(taskId, taskName, priority, dueDate);
            return;
        }
        Task temp = head;
        for (int i = 1; i < position - 1 && temp.next != head; i++) {
            temp = temp.next;
        }
        newTask.next = temp.next;
        temp.next = newTask;
        if (newTask.next == head) {
            tail = newTask;
        }
    }

    public void removeTaskById(int taskId) {
        if (head == null) {
            return;
        }
        Task temp = head, prev = null;
        if (head.taskId == taskId) {
            if (head == tail) {
                head = null;
                tail = null;
                return;
            }
            head = head.next;
            tail.next = head;
            return;
        }
        do {
            prev = temp;
            temp = temp.next;
            if (temp.taskId == taskId) {
                prev.next = temp.next;
                if (temp == tail) {
                    tail = prev;
                }
                return;
            }
        } while (temp != head);
    }

    public void viewCurrentTask() {
        if (currentTask == null) {
            currentTask = head;
        }
        if (currentTask != null) {
            System.out.println("Current Task: " + currentTask.taskName);
        }
    }

    public void moveToNextTask() {
        if (currentTask != null) {
            currentTask = currentTask.next;
            viewCurrentTask();
        }
    }

    public void displayAllTasks() {
        if (head == null) {
            return;
        }
        Task temp = head;
        do {
            System.out.println("ID: " + temp.taskId + ", Name: " + temp.taskName + ", Priority: " + temp.priority + ", Due Date: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    public void searchTaskByPriority(int priority) {
        if (head == null) {
            return;
        }
        Task temp = head;
        boolean found = false;
        do {
            if (temp.priority == priority) {
                System.out.println("Task Found: " + temp.taskName);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);
        if (!found) {
            System.out.println("No tasks found with priority: " + priority);
        }
    }
}

public class TaskSchedulerSystem {
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();
        scheduler.addTaskAtEnd(1, "Task A", 3, "2025-02-15");
        scheduler.addTaskAtEnd(2, "Task B", 2, "2025-02-20");
        scheduler.addTaskAtBeginning(3, "Task C", 1, "2025-02-10");
        scheduler.displayAllTasks();
        scheduler.viewCurrentTask();
        scheduler.moveToNextTask();
        scheduler.searchTaskByPriority(2);
        scheduler.removeTaskById(2);
        scheduler.displayAllTasks();
    }
}
