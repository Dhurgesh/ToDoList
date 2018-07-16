package sg.edu.rp.c346.todolist;

import java.util.Calendar;

/**
 * Created by 16033265 on 7/16/2018.
 */

public class Todo {

    private String task;
    private Calendar date;

    public Todo(String task, Calendar date){
        this.task = task;
        this.date = date;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public String getDateString(){
        String str = date.get(Calendar.DAY_OF_MONTH)+"/"+date.get(Calendar.MONTH)+"/"+date.get(Calendar.YEAR);

        return str ;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "task='" + task + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
