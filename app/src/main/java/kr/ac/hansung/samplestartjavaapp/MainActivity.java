package kr.ac.hansung.samplestartjavaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

// ----- 이름 ----
// int hollys_coffee;       // X
// int hollysCoffee;        // lowerCamelCase : 변수/메소드
// class MainActivity       // upperCamelCase : 클래스 이름..인터페이스 이름..
// 상수 public static final ...  (#define MAX_NUM)    // 전부 대문자!! 단어 사이는 _ 로!

public class MainActivity extends AppCompatActivity {

    // callback method = 이벤트 처리 함수
    // 이름이 on~~~ ()

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // xml 에서의 리소스 참조 : @ / java 에서의 리소스 참조 : R

        // View initialize
        Button toastButton = (Button) findViewById(R.id.toastBtn);
        Button outputButton = (Button) findViewById(R.id.outputBtn);
        Button inputButton = (Button) findViewById(R.id.inputBtn);


        MyClickListener mListener = new MyClickListener();
        toastButton.setOnClickListener(mListener);
        outputButton.setOnClickListener(mListener);
        inputButton.setOnClickListener(mListener);

    }


    // Event 처리
    public class MyClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.toastBtn :
                    Toast.makeText(MainActivity.this, "클릭됨!!", Toast.LENGTH_LONG).show();
                    break;
                case R.id.inputBtn :
                    Toast.makeText(MainActivity.this, "INPUT BTN CLICKED", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.outputBtn :
                    Toast.makeText(MainActivity.this, "OUTPUT BTN CLICKED", Toast.LENGTH_SHORT).show();
                    break;
                default:
                    break;
            }


        }
    }


}
