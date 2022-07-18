package com.mandooa20220717

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

//        회원가입 버튼 눌렀을때 로직 작성
        signUpBtn.setOnClickListener {
//            ~~회원가입 시 서버와 통신하는 API
            Toast.makeText(this, "${nicknameEdt.text}님 회원가입을 축하합니다", Toast.LENGTH_SHORT).show()
            finish()
        }

    }
}