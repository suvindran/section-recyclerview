package in.example.sec;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;



public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    SectionAdapter adapter;
    ArrayList<SectionModel> sectionModelArrayList = new ArrayList<>();

    ArrayList<String> itemArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler);

        itemArrayList.add("Goat");
        itemArrayList.add("hoat");
        itemArrayList.add("bat");
        itemArrayList.add("you");
        itemArrayList.add("kite");

        sectionModelArrayList.add(new SectionModel("Section 1", itemArrayList));
        sectionModelArrayList.add(new SectionModel("Section 2", itemArrayList));
        sectionModelArrayList.add(new SectionModel("Section 3", itemArrayList));

        adapter = new SectionAdapter(getApplicationContext(), sectionModelArrayList);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

}
