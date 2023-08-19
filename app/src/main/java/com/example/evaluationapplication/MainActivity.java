package com.example.evaluationapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{
    private ListView postListView;

    //String[] lan = {"Python", "Java", "C#", ".net"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        postListView = findViewById(R.id.postListView);

        List<Post> posts = generateSamplePosts();
        PostAdapter adapter = new PostAdapter(this, posts);
        postListView.setAdapter(adapter);


    }

//    Spinner spinner = findViewById(R.id.spinner1);
//    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, lan);


    private List<Post> generateSamplePosts() {
        List<Post> posts = new ArrayList<>();
        posts.add(new Post("تمت تغطية محاور الدورة بالتفاصيل الكافية"));
        posts.add(new Post("محتوى الدورة مناسب لمتطلباتي"));
        posts.add(new Post("طول الدورة التدريبية كان مناسبا للمحتوى"));
        posts.add(new Post("أنصح باستمرار طرح هذه الدورة في المسار"));
        posts.add(new Post("يوجد تنوع في الوسائل التدريبية المستخدمة"));

        // Add more posts here
//        adapter2.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
//        spinner.setAdapter(adapter2);
//
//        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//
//            }
//        });
        return posts;

    }

}
