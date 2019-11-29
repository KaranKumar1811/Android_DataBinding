package com.example.android_databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.android_databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    EditText nameEditTxt;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityMainBinding binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        nameEditTxt=findViewById(R.id.nameEditTxt);
        Person person = new Person("Hello");
        binding.setPerson(person);
        btn=findViewById(R.id.change);
      btn.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              String chng;
              chng=nameEditTxt.getText().toString();
              Person person1=new Person(chng);
              binding.setPerson(person1);
          }
      });
        //  setContentView(R.layout.activity_main);


//        nameEditTxt=findViewById(R.id.nameEditTxt);
//
//        name=nameEditTxt.getText().toString();

    }
}
