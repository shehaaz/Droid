package com.androidbook.droid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class DroidActivity extends Activity {

	 public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
			 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_droid);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_droid, menu);
        return true;
    }
    
    /** Called when the user clicks the Send button */
    public void sendMessage(View view){
    	//An intent provides runtime binding between separate components.
    	//They are used to start another activity
    	Intent intent = new Intent(this, DisplayMessageActivity.class);
    	EditText editText = (EditText) findViewById(R.id.edit_message);
    	String message = editText.getText().toString();
    	intent.putExtra(EXTRA_MESSAGE, message);
    	startActivity(intent);
    }
}
