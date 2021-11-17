package com.example.lifecycleandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    //액티비티 상태: 만들어짐
    //액티비티가 생성, 실제 코드를 가장 많이 작성하는 메서드

    override fun onStart() {
        super.onStart()
    }
    //액티비티 상태: 화면에 나타남
    //화면에 보이기 시작함

    override fun onResume() {
        super.onResume()
    }
    //액티비티 상태: 화면에 나타남, 현재 실행 중
    //실제 액티비티가 실행됨

    override fun onPause() {
        super.onPause()
    }
    //액티비티 상태: 화면이 가려짐
    //액티비티 화면의 일부가 다른 액티비티에 가려짐

    override fun onStop() {
        super.onStop()
    }
    //액티비티 상태: 화면이 없어짐
    //다른 액티비티가 실행되어서 화면이 완전히 가려짐

    override fun onDestroy() {
        super.onDestroy()
    }
    //액티비티 상태: 종료됨
    //종료됨
}
