package Entities;

import java.util.ArrayList;
import java.util.Scanner;

public class User extends Habit {


    private int habitIndex;
    private int todayInt;
    public static ArrayList<Habit> habitList;
    private Scanner scanner = new Scanner(System.in);


    public int getHabitIndex() {
        return habitIndex;
    }

    public void setHabitIndex(Integer habitIndex) {
        this.habitIndex = habitIndex;
    }

    public int getTodayInt() {
        return todayInt;
    }

    public void setTodayInt(int todayInt) {
        this.todayInt = todayInt;
    }

    public ArrayList<Habit> getHabitList() {
        return habitList;
    }

    public void setHabitList(ArrayList<Habit> habitList) {
        this.habitList = habitList;
    }

    private String inputTitle(){
        System.out.println("Enter title of new Habit");
        String title = scanner.nextLine();
        return title;
    }
    private String inputDescription(){
        System.out.println("Enter a brief Description of new Habit");
        String description = scanner.nextLine();
        return description;
    }

    public void addHabit(){
        Habit habit = new Habit();
        System.out.println("CREATING NEW HABIT");
        habit.setTitle(inputTitle());
        habit.setDescription(inputDescription());

        habitList.add(habit);
    }

    public void deleteHabit(){
        habitList.remove(habitIndex);
        setHabitIndex(null);
    }

}





