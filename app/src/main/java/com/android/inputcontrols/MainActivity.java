package com.android.inputcontrols;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBoxChocolate;
    private CheckBox checkBoxSprinkles;
    private CheckBox checkBoxCrushed;
    private CheckBox checkBoxCherries;
    private CheckBox checkBoxOrio;

    private Button buttonShowResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.checkBoxChocolate = (CheckBox) this.findViewById(R.id.checkBox_chocolate);
        this.checkBoxSprinkles = (CheckBox) this.findViewById(R.id.checkBox_sprinkles);
        this.checkBoxCrushed   = (CheckBox) this.findViewById(R.id.checkBox_crushed);
        this.checkBoxCherries  = (CheckBox) this.findViewById(R.id.checkBox_cherries);
        this.checkBoxOrio      = (CheckBox) this.findViewById(R.id.checkBox_orio);

        this.buttonShowResult  = (Button)   this.findViewById(R.id.button_showResult);

        this.buttonShowResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast();
            }
        });

    }

    private void showToast()  {
        String message = null;
        if(this.checkBoxChocolate.isChecked()) {
            message =  this.checkBoxChocolate.getText().toString();
        }
        if(this.checkBoxSprinkles.isChecked()) {
            if(message== null)  {
                message =  this.checkBoxSprinkles.getText().toString();
            } else {
                message += ", " + this.checkBoxSprinkles.getText().toString();
            }
        }
        if(this.checkBoxCrushed.isChecked()) {
            if(message== null)  {
                message =  this.checkBoxCrushed.getText().toString();
            } else {
                message += ", " + this.checkBoxCrushed.getText().toString();
            }
        }
        if(this.checkBoxCherries.isChecked()) {
            if(message== null)  {
                message =  this.checkBoxCherries.getText().toString();
            } else {
                message += ", " + this.checkBoxCherries.getText().toString();
            }
        }
        if(this.checkBoxOrio.isChecked()) {
            if(message== null)  {
                message =  this.checkBoxOrio.getText().toString();
            } else {
                message += ", " + this.checkBoxOrio.getText().toString();
            }
        }


        message = message == null? "You select nothing": "You select: " + message;
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}