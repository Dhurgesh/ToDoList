package sg.edu.rp.c346.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvTodo;
    ArrayList<Todo> alTodoList;
    CustomAdapter caTodo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvTodo = findViewById(R.id.ListViewToDo);
        alTodoList = new ArrayList<>();

        Calendar date1 = Calendar.getInstance();
        date1.set(2018,7,1);

        Calendar date2 = Calendar.getInstance();
        date1.set(2018,9,29);

        Todo item1 = new Todo("MSA",date1);
        Todo item2 = new Todo("Go for Haircut",date2);


        alTodoList.add(item1);
        alTodoList.add(item2);

        caTodo = new CustomAdapter(this,R.layout.todo_object,alTodoList);

        lvTodo.setAdapter(caTodo);




    }
}
