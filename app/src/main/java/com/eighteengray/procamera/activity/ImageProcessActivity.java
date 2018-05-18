package com.eighteengray.procamera.activity;


import android.os.Bundle;

import com.eighteengray.procamera.R;
import com.eighteengray.procamera.bean.SaveImage;

import org.greenrobot.eventbus.EventBus;

import butterknife.ButterKnife;

public class ImageProcessActivity extends BaseActivity
{



    @Override
    public void onCreate(final Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResId());
        ButterKnife.bind(this);
        EventBus.getDefault().register(this);
    }

    @Override
    public int getLayoutResId()
    {
        return R.layout.aty_image_process;
    }


}
