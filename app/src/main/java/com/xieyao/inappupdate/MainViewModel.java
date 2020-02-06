package com.xieyao.inappupdate;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

import androidx.lifecycle.ViewModel;

import com.xieyao.inappupdate.update.FlexibleFlowActivity;
import com.xieyao.inappupdate.update.ImmediateFlowActivity;

import java.lang.ref.WeakReference;

public class MainViewModel extends ViewModel {

    private WeakReference<Activity> mAcitivyRef;

    public void setup(Activity activity) {
        mAcitivyRef = new WeakReference<>(activity);
    }

    public View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_update_immediate: {
                    Intent intent = new Intent(mAcitivyRef.get(), ImmediateFlowActivity.class);
                    mAcitivyRef.get().startActivity(intent);
                    break;
                }
                case R.id.btn_update_flexible: {
                    Intent intent = new Intent(mAcitivyRef.get(), FlexibleFlowActivity.class);
                    mAcitivyRef.get().startActivity(intent);
                    break;
                }
            }
        }
    };

}
