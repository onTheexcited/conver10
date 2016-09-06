package cn.edu.bistu.cs.se.mainapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button btn1 = (Button) findViewById(R.id.button2);

               final Intent intent = getIntent();
               final String name = intent.getStringExtra("name");
               final Integer age = intent.getIntExtra("age", 13);
              Toast.makeText(Main2Activity.this,name+age,Toast.LENGTH_LONG).show();
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("result","姓名："+name+" 年龄"+age);
                setResult(0, intent);
                finish();
            }
        });

    }

}
