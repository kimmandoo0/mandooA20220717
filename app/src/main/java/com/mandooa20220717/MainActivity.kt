package com.mandooa20220717

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        회원가입창으로 이동
        signUpBtn.setOnClickListener {
//            비행기 티켓을 발권(출발지 : this(MainActivity) -> 목적지(SignUpActivity)
            val myIntent = Intent(this, SignUpActivity::class.java)
//            실제 비행기를 출발
            startActivity(myIntent)
        }


//      로그인 시작
        loginBtn.setOnClickListener {
//            아이디 값과 비밀번호 변수화
            val id = idEdt.text.toString() // 아이디값 변수화
            val password = passwordEdt.text.toString() //비밀번호 변수화
//            1. 아이디값이 "admin"인가 패스워드가 "asdf"
//            2. 아이디값 판별
            if ( id != "admin"){
                Toast.makeText(this, "아이디가 잘못되었습니다.", Toast.LENGTH_SHORT).show()
            }
//            3. 비밀번호 값 판별
            else if ( password != "asdf"){
                Toast.makeText(this, "비밀번호가 잘못되었습니다.", Toast.LENGTH_SHORT).show()
            }
//            4. 두가지 모두 맞을때
            else {
                Toast.makeText(this, "관리자님 환영합니다.", Toast.LENGTH_SHORT).show()
            }
            Log.d("메인 액티비티","로그인 버튼 클릭")
        }

    }
}