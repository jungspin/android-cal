package com.cos.cal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.cos.cal.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity2";

    private TextView ptInput;
    private Button btnOne;
    private Button btnTwo;
    private Button btnThree;
    private Button btnFour;
    private Button btnFive;
    private Button btnSix;
    private Button btnSeven;
    private Button btnEight;
    private Button btnNine;
    private Button btnZero;
    private Button btnAdd;
    private Button btnMinus;
    private Button btnMul;
    private Button btnDiv;
    private Button btnCancel;
    private Button btnResult;

    private String inputData = "";

    //private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: start");
        super.onCreate(savedInstanceState);
        //binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_main);
        //setContentView(binding.getRoot());

        init();
        initListener();
    }


    private void initListener(){
        // 목적 : 숫자 누르면 화면(tpInput)에 띄워야됨
        btnOne.setOnClickListener((View v)-> {
            inputData += "1"; // null11 이렇게 도ㅐ -> 앞에 공백으로 초기화했음 ㅜ
            ptInput.setText(inputData);
        });
        btnTwo.setOnClickListener((View v)-> {
            inputData += "2";
            ptInput.setText(inputData);
        });
        btnThree.setOnClickListener((View v)-> {
            inputData += "3";
            ptInput.setText(inputData);
        });
        btnFour.setOnClickListener((View v)-> {
            inputData += "4";
            ptInput.setText(inputData);
        });
        btnFive.setOnClickListener((View v)-> {
            inputData += "5";
            ptInput.setText(inputData);
        });
        btnSix.setOnClickListener((View v)-> {
            inputData += "6";
            ptInput.setText(inputData);
        });
        btnSeven.setOnClickListener((View v)-> {
            inputData += "7";
            ptInput.setText(inputData);
        });
        btnEight.setOnClickListener((View v)-> {
            inputData += "8";
            ptInput.setText(inputData);
        });
        btnNine.setOnClickListener((View v)-> {
            inputData += "9";
            ptInput.setText(inputData);
        });
        btnZero.setOnClickListener((View v)-> {
            inputData += "0";
            ptInput.setText(inputData);
        });

        btnAdd.setOnClickListener((View v)->{
            inputData += "+";
            ptInput.setText(inputData);
        });

        btnMinus.setOnClickListener((View v)->{
            inputData += "-";
            ptInput.setText(inputData);
        });

        btnMul.setOnClickListener((View v)->{
            inputData += "*";
            ptInput.setText(inputData);
        });

        btnDiv.setOnClickListener((View v)->{
            inputData += "/";
            ptInput.setText(inputData);
        });

        btnCancel.setOnClickListener((View v)->{
            inputData = "";
            ptInput.setText(inputData);
        });

        btnResult.setOnClickListener((View v)-> {
            String result = Eval.cal(inputData);
            ptInput.setText(result);
        });
    }

    private void init(){
        ptInput = findViewById(R.id.ptInput);
        btnOne = findViewById(R.id.btnOne);
        btnTwo = findViewById(R.id.btnTwo);
        btnThree = findViewById(R.id.btnThree);
        btnFour = findViewById(R.id.btnFour);
        btnFive = findViewById(R.id.btnFive);
        btnSix = findViewById(R.id.btnSix);
        btnSeven = findViewById(R.id.btnSeven);
        btnEight = findViewById(R.id.btnEight);
        btnNine = findViewById(R.id.btnNine);
        btnZero = findViewById(R.id.btnZero);
        btnAdd = findViewById(R.id.btnAdd);
        btnMinus = findViewById(R.id.btnMinus);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
        btnCancel = findViewById(R.id.btnCancel);
        btnResult = findViewById(R.id.btnResult);

    }
}