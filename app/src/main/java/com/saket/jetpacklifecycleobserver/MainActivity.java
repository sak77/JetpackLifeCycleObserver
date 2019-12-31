package com.saket.jetpacklifecycleobserver;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


/**
 * This application demonstrates how the SimpleLifeCycleObserverClass observes
 * the lifeCycle of the MainActivity.
 *
 * The MainActivity is the lifecycleOwner here. We use its getLifeCycle().addObserver()
 * method to add an instance of the SimpleLifeCycleObserver observer class to the activity.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SampleLifeCycleObserverClass sampleLifeCycleObserverClass =
                new SampleLifeCycleObserverClass(this);
        this.getLifecycle().addObserver(sampleLifeCycleObserverClass);
    }
}
