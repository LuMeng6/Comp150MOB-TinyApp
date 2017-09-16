package edu.tufts.cs.annoyingdoge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void Doge(View view) {
        Intent intent = new Intent(this, YesActivity.class);
        startActivity(intent);
    }

    public void NextPage(View view) {
        Intent intent = new Intent(this, NoActivity.class);
        startActivity(intent);
    }
}
