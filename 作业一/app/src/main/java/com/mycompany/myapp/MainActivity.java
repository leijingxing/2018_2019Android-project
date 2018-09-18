package com.mycompany.myapp;

import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
    
		Button button = (Button) findViewById(R.id.mainButton1);
        
    
		button.setOnClickListener(new OnClickListener() {

			
			@Override
			
			public void onClick(View p1)
		
			{
				
				// TODO: Implement this method
			
				textView.setText("Clicked");
			
			}
			
		});
    }
}
