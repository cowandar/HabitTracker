package Entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Habit {

    private String title;
    private String description;

    private List<Boolean> dailyChecklist = new ArrayList<Boolean>(6);
    // 0 = Monday, 1= Tuesday, 2 = Wednesday, 3= Thursday, 4 = Friday, 5 = Saturday, 6 = Sunday

    public Habit(String title, String description) {
        this.title = title;
        this.description = description;
        setDailyChecklistAllFalse();
    }


    public Habit(String title, String description, ArrayList<Boolean> dailyChecklist) {
        this.title = title;
        this.description = description;
        this.dailyChecklist = dailyChecklist;
    }

    public Habit() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Boolean> getDailyChecklist() {
        return dailyChecklist;
    }

    public Boolean isHabitCompleteOnThisDay(int day){
        return dailyChecklist.get(day);
    }

    public void setHabitStatus(int today, boolean status){
        dailyChecklist.set(today, status);
    }

    private void setDailyChecklistAllFalse(){
        Collections.fill(this.dailyChecklist, Boolean.FALSE);
    }

    @Override
    public String toString() {
        return
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", dailyChecklist=" + dailyChecklist +
                '}';
    }
}


