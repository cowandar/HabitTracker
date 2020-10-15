package Display;


import Entities.User;

import java.io.IOException;
import java.util.Scanner;

public class ToConsole {


    static Scanner scanner = new Scanner(System.in);
    User user = new User();


    public void welcome(){
        System.out.println("Welcome to Habitual");
        System.out.println("You're habit tracking app");
    }

    public void mainMenu() throws IOException {


        System.out.println("Main Menu");
        System.out.println("1.View Habits");
        System.out.println("2.Add Habits");
        System.out.println("3.Save Habits");


        switch (scanner.nextInt()){
            case 1:
                viewHabitsOptions();
                mainMenu();
            case 2:
                user.addHabit();
                mainMenu();
            case 3:
                Data.WriteToJson.writeToJson(user);
                mainMenu();
        }
    }

    private void viewHabitsOptions() throws IOException {
        printAllHabitsTitles();
        System.out.println("OPTIONS");
        System.out.println("1: Edit Habit");
        System.out.println("2: Delete Habit");
        System.out.println("3: Exit to Main Menu");

        switch (scanner.nextInt()) {
            case 1:
                System.out.println("Edit Habit");
                selectHabit();
                System.out.println("Edit Options");
                System.out.println("1: Edit Title");
                System.out.println("2: Edit Description");
                System.out.println("3: Go back");
                switch (scanner.nextInt()){
                    case 1:
                        System.out.println("Edit Title");
                        System.out.println("Enter new Title");
                        user.getHabitList().get(user.getHabitIndex()).setTitle(scanner.nextLine());
                        break;
                    case 2:
                        System.out.println("Edit Description");
                        System.out.println("Enter new Description");
                        user.getHabitList().get(user.getHabitIndex()).setDescription(scanner.nextLine());
                        break;
                    default:
                        mainMenu();
                }

            case 2:
                System.out.println("Delete Habit");
                selectHabit();
                System.out.println("Are you sure you want to delete the following Habit");
                System.out.println(user.getHabitList().get(user.getHabitIndex()).getTitle());
                System.out.println("Press 1 for Yes, delete this habit");
                System.out.println("Press 2 for No");

                switch (scanner.nextInt()){
                    case 1:
                        user.deleteHabit();
                    case 2:
                        //Go back to previous menu
                        user.setHabitIndex(null);
                        viewHabitsOptions();
                }

            default:
                mainMenu();
        }

        mainMenu();
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
        user.setHabitIndex(scanner.nextInt());
        System.out.println("Habit " + user.getHabitIndex() + " Selected");
            }

        }


