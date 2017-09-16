package edu.tufts.cs.annoyingdoge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no);
    }

    public void Doge(View view) {
        Intent intent = new Intent(this, YesActivity.class);
        startActivity(intent);
    }

    public void LastPage(View view) {
        Intent intent = new Intent(this, No2Activity.class);
        startActivity(intent);
    }
}
