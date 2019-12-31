package com.saket.jetpacklifecycleobserver;

import android.content.Context;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;

/**
 * Created by sshriwas on 2019-08-17
 *
 * This class implements the interface DefaultLifeCycleObserver and overrides its methods
 * to generate toasts based on the current state of the lifecycle owner.
 */
public class SampleLifeCycleObserverClass implements DefaultLifecycleObserver {

    Context mContext;

    SampleLifeCycleObserverClass(Context context) {
        mContext = context;
    }


    @Override
    public void onCreate(@NonNull LifecycleOwner owner) {
        Toast.makeText(mContext, "onCreate", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroy(@NonNull LifecycleOwner owner) {
        Toast.makeText(mContext, "onDestroy", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPause(@NonNull LifecycleOwner owner) {
        Toast.makeText(mContext, "onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onResume(@NonNull LifecycleOwner owner) {
        Toast.makeText(mContext, "onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStart(@NonNull LifecycleOwner owner) {
        Toast.makeText(mContext, "onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStop(@NonNull LifecycleOwner owner) {
        Toast.makeText(mContext, "onStop", Toast.LENGTH_SHORT).show();
    }
}