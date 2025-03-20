package com.example.edittext_test;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    // EditText 객체들
    private EditText eTextId;
    private EditText eTextPassword;
    private EditText eTextPhone;

    // Button 객체
    private Button eButton;

    // TextView 객체들
    private TextView eTextViewId;
    private TextView eTextViewPassword;
    private TextView eTextViewPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // 시스템 바 인셋 처리
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // UI 요소들 초기화
        eTextId = findViewById(R.id.edittext);           // 아이디 입력 EditText
        eTextPassword = findViewById(R.id.edittext2);    // 패스워드 입력 EditText
        eTextPhone = findViewById(R.id.edittext3);       // 전화번호 입력 EditText

        eButton = findViewById(R.id.button);             // 회원가입 버튼

        // 출력할 TextView 초기화
        eTextViewId = findViewById(R.id.textPassword);   // 아이디 출력 TextView
        eTextViewPassword = findViewById(R.id.textView5); // 패스워드 출력 TextView
        eTextViewPhone = findViewById(R.id.textView6);    // 전화번호 출력 TextView
    }

    // 회원가입 버튼 클릭 시 호출되는 메서드
    public void onClicked(View view) {
        // EditText에서 입력된 값 가져오기
        String id = eTextId.getText().toString();
        String password = eTextPassword.getText().toString();
        String phone = eTextPhone.getText().toString();

        // 각 TextView에 해당 값 설정
        eTextViewId.setText("아이디: " + id);
        eTextViewPassword.setText("패스워드: " + password);
        eTextViewPhone.setText("전화 번호: " + phone);
    }
}
