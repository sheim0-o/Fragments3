package com.example.fragments3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements com.example.fragments3.MyDialog.MyDialogHost {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showDialog(View view) {
        MyDialog dialog = new MyDialog();
        dialog.show(getSupportFragmentManager(), null);
    }

    public void positive() {
        Toast.makeText(this, "Файл был удален", Toast.LENGTH_SHORT).show();
    }

    public void negative() {
        Toast.makeText(this, "Операция была отменена", Toast.LENGTH_SHORT).show();
    }
}







