package com.example.android_hw2_alerts;

import android.support.v7.app.ActionBarActivity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
	private Button btn1, btn2, btn3, btn4;
	
	private Button.OnClickListener doAlert = 
    		new Button.OnClickListener() {
    			public void onClick(View v) {
    				switch (v.getId()) {
    					case R.id.button1:
	    					Toast toastAlert_1 = Toast.makeText(MainActivity.this, "我是一號", Toast.LENGTH_LONG);
	        				toastAlert_1.show();
	        				break;
    					case R.id.button2:
	    					Toast toastAlert_2 = Toast.makeText(MainActivity.this, "我是二號", Toast.LENGTH_LONG);
	        				toastAlert_2.show();
	        				break;
    					case R.id.button3:
	    					new AlertDialog.Builder(MainActivity.this)
	    						.setTitle("o\"_\"o")
	    						.setMessage("我是三號按鈕")
	    						.setPositiveButton("我知道惹", new DialogInterface.OnClickListener() {
				    	        	public void onClick(DialogInterface dialog, int id) {
				    	        	}
				    	        })
	    						.show();
	        				break;
    					case R.id.button4:
    						new AlertDialog.Builder(MainActivity.this)
    						.setTitle("o\"_\"o")
    						.setMessage("我是四號按鈕")
    						.setPositiveButton("我知道惹", new DialogInterface.OnClickListener() {
			    	        	public void onClick(DialogInterface dialog, int id) {
			    	        	}
			    	        })
    						.show();
	        				break;
    						
    				}
    				
    				
    			}
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        btn1 = (Button)findViewById(R.id.button1);
        btn2 = (Button)findViewById(R.id.button2);
        btn3 = (Button)findViewById(R.id.button3);
        btn4 = (Button)findViewById(R.id.button4);
        
        btn1.setOnClickListener(doAlert);
        btn2.setOnClickListener(doAlert);
        btn3.setOnClickListener(doAlert);
        btn4.setOnClickListener(doAlert);

    }
    
    


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
