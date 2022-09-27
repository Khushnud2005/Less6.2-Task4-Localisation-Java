package uz.exemple.less62_task4_localisation_java.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import uz.exemple.less62_task4_localisation_java.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    void initViews() {
        Button b_home = findViewById(R.id.b_home);
        b_home.setText(getString(R.string.app_name));
        b_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callLanguageActivity();
            }
        });
    }

    void callLanguageActivity() {
        Intent intent = new Intent(this, LanguageActivity.class);
        startActivity(intent);
    }
}