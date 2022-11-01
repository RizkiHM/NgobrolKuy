package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EmailCheck extends AppCompatActivity {
    private Button kembali_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_check);
        kembali_btn = findViewById(R.id.btn_kembali);

        kembali_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(EmailCheck.this, LoginActivity.class);
                startActivity(intent1);
            }
        });
    }
}