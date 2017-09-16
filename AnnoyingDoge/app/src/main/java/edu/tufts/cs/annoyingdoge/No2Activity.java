package edu.tufts.cs.annoyingdoge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class No2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no2);
    }

    public void Doge(View view) {
        Intent intent = new Intent(this, YesActivity.class);
        startActivity(intent);
    }
}
