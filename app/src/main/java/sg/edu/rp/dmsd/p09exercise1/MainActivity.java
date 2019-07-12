package sg.edu.rp.dmsd.p09exercise1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvExamTips;
    ArrayList<AndroidVersion> movieList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvExamTips = findViewById(R.id.listViewMovie);
        movieList.add(new AndroidVersion("MSA", "1/7/2019"));
        movieList.add(new AndroidVersion("Go For Haircut", "22/9/2019"));


        CustomAdapter adapter = new CustomAdapter(this,
                R.layout.row, movieList);

        lvExamTips.setAdapter(adapter);
    }
}
