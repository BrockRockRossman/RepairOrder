package com.example.repairorder;

import android.hardware.biometrics.PromptContentItemPlainText;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

import java.util.Random;

public class RepairOrderActivity extends AppCompatActivity {

    double numbers = 0.0;
    TextView totalTV;

    EditText A1PT;
    EditText A2PT;
    EditText A3PT;
    EditText A4PT;
    EditText A5PT;
    EditText A6PT;





    // Create button variable
    Button submitB;
    // clreate button listener
    View.OnClickListener buttonListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {


            Random gen = new Random();
            double number = gen.nextDouble();


            String v1 = "$ " + R.string.Sub_TotalNum;
            totalTV.setText(v1);

            String value = totalTV.getText().toString();

            Double subTotal = Double.parseDouble(A1PT.getText().toString());

            String orderTypeValue = A1PT.getText().toString();


        }

    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {





        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_repair_order);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });





        A1PT = findViewById(R.id.plainTextA1);
        A2PT = findViewById(R.id.plainTextA2);
        A3PT = findViewById(R.id.plainTextA3);
        A4PT = findViewById(R.id.plainTextA4);
        A5PT = findViewById(R.id.plainTextA5);
        A6PT = findViewById(R.id.plainTextA6);

        totalTV = findViewById(R.id.SubTotalNum);
        submitB = findViewById(R.id.submitButton);
        submitB.setOnClickListener(buttonListener);













    }
}