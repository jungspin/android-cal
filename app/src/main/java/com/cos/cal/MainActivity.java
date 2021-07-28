package com.cos.cal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.cos.cal.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private static final String TAG = "MainActivity2";

    private TextView ptInput;
    private Button[] btn = new Button[16]; // 이름 다 적으면 너무 많아.. 배열로

    private String inputData = "";



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

    @Override
    public void onClick(View view) {
        Button btn = (Button) view; // 들어오는게 버튼 타입 밖에 없으니까 통일할 수 있음
        ptInput.append(btn.getText());
    }


    private void initListener(){
        // 목적 : 숫자 누르면 화면(tpInput)에 띄워야됨
        // 어떻게 만드는게 좋을까? -> 가장 좋은 방법은 리스너의 스택을 재활용하면 됨
        for(int i=0; i<14; i++){
            btn[i].setOnClickListener(this);
        }
        btn[15].setOnClickListener(v -> { // 괄호 없으면 타입을 적어줄 필요가 없다
            String setData = ptInput.getText().toString(); // 타입이 charSequence 라서 스트링으로 변환해준것
            String result = Eval.cal(setData);
            ptInput.setText(result);
        });
        btn[14].setOnClickListener(v -> {
            ptInput.setText("");
        });
    }

    private void init(){
        ptInput = findViewById(R.id.ptInput);
        // init 에서는 for문 돌릴 수가 없어. 왜? R.id.뭐시기가 안돼
        btn[0] = findViewById(R.id.btnOne);
        btn[1] = findViewById(R.id.btnTwo);
        btn[2] = findViewById(R.id.btnThree);
        btn[3] = findViewById(R.id.btnFour);
        btn[4] = findViewById(R.id.btnFive);
        btn[5] = findViewById(R.id.btnSix);
        btn[6] = findViewById(R.id.btnSeven);
        btn[7] = findViewById(R.id.btnEight);
        btn[8] = findViewById(R.id.btnNine);
        btn[9] = findViewById(R.id.btnZero);
        btn[10] = findViewById(R.id.btnAdd);
        btn[11] = findViewById(R.id.btnMinus);
        btn[12] = findViewById(R.id.btnMul);
        btn[13] = findViewById(R.id.btnDiv);
        btn[14] = findViewById(R.id.btnCancel);
        btn[15] = findViewById(R.id.btnResult);
    }
}