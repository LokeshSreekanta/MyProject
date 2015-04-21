package edu.sdsu.lokesh.lifecycleevents;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class LifeCycleEvents extends ActionBarActivity {

    private TextView textView;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle_events);
        textView= (TextView)findViewById(R.id.textOnScreen);
        textView.setText("onCreate\n");
        Log.i("onCreate", "onCreate() called");
    }

     @Override
    public void onStart() {
        super.onStart();
        textView.append("onStart\n");
        Log.i("onStart", "onStart() called");
    }

    @Override
    public void onResume() {
        super.onResume();
        textView.append("onResume\n");
        Log.i("onResume", "onResume() called");
    }

    @Override
    public void onPause() {
        super.onPause();
        textView.append("onPause\n");
        Log.i("onPause","onPause() called");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        textView.append("onRestoreInstanceState\n");
        Log.i("onRestoreInstanceState", "onRestoreInstanceState() called");
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        textView.append("onSaveInstanceState\n");
        Log.i("onSaveInstanceState", "onSaveInstanceState() called");
    }

    @Override
    public void onRestart() {
        super.onRestart();
        textView.append("onRestart\n");
        Log.i("onRestart", "onRestart() called");
    }

    public void clear(View clearButton) {
        textView.setText(" ");

    }
}
