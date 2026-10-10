
import java.util.ArrayList;
import java.util.Scanner;

public class TaskListApp {
    public static void main(String[] args) {
        TaskList taskList = new TaskList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu();
            int choice = getUserChoice(scanner);

            switch (choice) {
                case 1:
                    taskList.addTask(getTaskName(scanner));
                    break;

                case 2:
                    if (!taskList.isEmpty()) {
                        taskList.listTasks();
                        int taskNumber = getUserInput(
                            scanner, "Enter the task number to remove: "
                        );

                        if (taskList.isValidTaskNumber(taskNumber)) {
                            taskList.removeTask(taskNumber);
                        } else {
                            System.out.println("Invalid task number.");
                        }
                    } else {
                        System.out.println("No tasks to remove.");
                    }
                    break;

                case 3:
                    if (!taskList.isEmpty()) {
                        taskList.listTasks();
                    } else {
                        System.out.println("No tasks to list.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting Task List Application.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Enter 1 to 4.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\nTask List Application");
        System.out.println("1. Add Task");
        System.out.println("2. Remove Task");
        System.out.println("3. List Tasks");
        System.out.println("4. Quit");
        System.out.print("Select an option: ");
    }

    private static int getUserChoice(Scanner scanner) {
        return getUserInput(scanner, "");
    }

    private static String getTaskName(Scanner scanner) {
        System.out.print("Enter task name: ");
        return scanner.nextLine().trim();
    }

    private static int getUserInput(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();

            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }
}

class TaskList {
    private ArrayList<String> tasks = new ArrayList<>();

    public void addTask(String name) {
        if (name.isEmpty()) {
            System.out.println("Task name cannot be empty.");
            return;
        }

        tasks.add(name);
        System.out.println("Task added successfully.");
    }

    public void removeTask(int taskNumber) {
        tasks.remove(taskNumber - 1);
        System.out.println("Task removed successfully.");
    }

    public void listTasks() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    public boolean isEmpty() {
        return tasks.isEmpty();
    }

    public boolean isValidTaskNumber(int taskNumber) {
        return taskNumber >= 1 && taskNumber <= tasks.size();
    }
}
