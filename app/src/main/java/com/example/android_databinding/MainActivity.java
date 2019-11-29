package com.example.android_databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.widget.EditText;

import com.example.android_databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    EditText nameEditTxt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        nameEditTxt=findViewById(R.id.nameEditTxt);
        Person person = new Person("Hello");
        binding.setPerson(person);
      //  setContentView(R.layout.activity_main);


//        nameEditTxt=findViewById(R.id.nameEditTxt);
//
//        name=nameEditTxt.getText().toString();

    }
}
