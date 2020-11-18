package com.young.targetclickdemo

import android.content.Context
import com.young.targetclickdemo.databinding.TestItemLayoutBinding

/*
 * Des  
 * Author Young
 * Date 
 */class TestAdapter :BaseBindingAdapter<TestItemLayoutBinding,String> {
    constructor(context: Context,clickImpl: MainActivityTargetClickImpl) : super(context, R.layout.test_item_layout){
        click=clickImpl
    }
    override fun bindView(viewHolder: CommonViewHolder?, position: Int) {
        viewHolder?.bindView?.click=click
        viewHolder?.bindView?.content=getDataList()[position]
        viewHolder?.bindView?.position=position

    }
}