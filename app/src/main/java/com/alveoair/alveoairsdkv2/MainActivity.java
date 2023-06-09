package com.alveoair.alveoairsdkv2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.sdk.alveoairsdk.StartSpirometryTest;

import java.util.UUID;

public class MainActivity extends AppCompatActivity {

    private Button button;

    public static final String CLIENT_ID="791k0ri37hb9vkf3cl1upkq3v";
    public static final String SERVER_KEY="10n7j0lngtjab2vua1a2b1o0bhub689u0cq5jg1rprjgb8l3amvi";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new StartSpirometryTest().startStandard(MainActivity.this,
                        CLIENT_ID,
                        SERVER_KEY,
                        19,
                        "af282574-edc0-11ed-a05b-022e12ed312wgrsvaegwadve",
                        "Vaibhav Bhav",
                        "MALE",
                        29,
                        "SOUTH_INDIAN",
                        150f,
                        100f,
                        UUID.randomUUID().toString());
            }
        });
    }

}