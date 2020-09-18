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
        System.out.println("Main Menu");
        System.out.println("1.View Habits");
        System.out.println("2.Add Habits");
        System.out.println("3.Edit Habits");
        System.out.println("4.Save Habits");


        switch (choice){
            case 1:
                //Todo add function here for view habits
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


        }
    }
}
