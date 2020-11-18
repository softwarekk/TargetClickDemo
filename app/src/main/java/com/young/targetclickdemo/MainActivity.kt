package com.young.targetclickdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.young.targetclick.annotation.TargetClick
import com.young.targetclick.base.TargetClickImplCallback
import com.young.targetclickdemo.databinding.ActivityMainBinding

@TargetClick
class MainActivity : AppCompatActivity(),TargetClickImplCallback{
    private val clickImpl=MainActivityTargetClickImpl(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding=DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)
        binding.clickImpl=clickImpl
        val adapter=TestAdapter(this,clickImpl)
        binding.recycleview.adapter=adapter
        adapter.setDataList(arrayListOf("1111","22222","3333","44444"))
    }

    override fun viewOnclick(view: Any, index: Int?, data: Any?) {
        Log.i("viewOnClick","{$view --$index}")
    }
}