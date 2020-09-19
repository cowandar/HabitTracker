package Display;

import Entities.User;

import java.util.Scanner;

public class ToConsole {


    static Scanner scanner = new Scanner(System.in);
    User user = new User();
    int choice = scanner.nextInt();

    public void welcome(){
        System.out.println("Welcome to Habitual");
        System.out.println("You're habit tracking app");
    }

    public void mainMenu(){
        user.setHabitIndex(null);

        System.out.println("Main Menu");
        System.out.println("1.View Habits");
        System.out.println("2.Add Habits");
        System.out.println("3.Edit Habits");
        System.out.println("4.Save Habits");


        switch (choice){
            case 1:
                viewHabitsOptions();
                mainMenu();
            case 2:
                user.addHabit();
                mainMenu();
            case 3:
                //TODO add function here for Edit Habits
            case 4:
                //TODO add function here for Save Habits
        }
    }

    private void viewHabitsOptions() {
        printAllHabitsTitles();
        System.out.println("OPTIONS");
        switch (choice) {
            case 1:
                // TODO Edit habit function
                selectHabit();


            case 2:
                //TODO Delete Habit function
            case 3:
                //TOdo
                // Back to main menu
        }
    }


    private void printAllHabitsTitles(){
        for (int i = 0; user.getHabitList().size() > i; i++){
            System.out.println("Habits:");
            System.out.println(i + ":- " + user.getHabitList().get(i).getTitle());
        }
    }

    private void selectHabit(){
        System.out.println("Select a Habit");
        printAllHabitsTitles();
        user.setHabitIndex(choice);
        System.out.println("Habit " + user.getHabitIndex() + " Selected");
            }

        }


