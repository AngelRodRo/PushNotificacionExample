package com.example.usuario.pushnotificacionexample;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.parse.Parse;
import com.parse.ParseObject;
import com.parse.ParsePush;
import com.parse.ParseQuery;
import com.parse.PushService;


public class MainActivity extends ActionBarActivity {

    String APPLICATION_ID = "0yItYhlK5WbjHvGlS4GTsHeQji977iz7dlwWh6P4";
    String CLIENT_KEY = "NVBcd4b2xzGBSqo1gi8tEJd8lMxltQckDLhRXiwf";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Parse.initialize(this, APPLICATION_ID, CLIENT_KEY);

        ParseQuery<ParseObject> query = ParseQuery.getQuery("TestObject");
        ParseObject objeto1 = new ParseObject("TestObject");
        objeto1.put("foo","valor1");
        objeto1.saveInBackground();

        //ParsePush.subscribeInBackground("Channel1");

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
