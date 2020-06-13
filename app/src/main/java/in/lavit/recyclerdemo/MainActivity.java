package in.lavit.recyclerdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MyAdpter adpter;
    private ArrayList<Employee> arrayListEmp;
    private RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arrayListEmp = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this);
        //layoutManager = new GridLayoutManager(this,3);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);

        Employee emp1 = new Employee();
        emp1.setName("John");
        emp1.setId("123");
        emp1.setImgUrl("");
        arrayListEmp.add(emp1);
        Employee emp2 = new Employee();
        emp2.setName("Mary");
        emp2.setId("1234");
        emp2.setImgUrl("");
        arrayListEmp.add(emp2);

        adpter = new MyAdpter(this,arrayListEmp);
        recyclerView.setAdapter(adpter);


    }
}
