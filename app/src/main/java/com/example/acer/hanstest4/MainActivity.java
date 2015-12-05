package com.example.acer.hanstest4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Scanner;
import com.example.acer.tuna;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    public String name;
    //this is a field
    public static String gender = "Male";
    //this is a static field

    private String hansString = simpleMessage();

    tuna tunaObject = new tuna ();
    //private String hansString = tunaObject.simpleMessage();


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button hansButton = (Button) findViewById(R.id.hansButton);


        System.out.println("Hallo !");
        //Log.w("haaa", "afasdfa");

        hansButton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView mijnText = (TextView)findViewById(R.id.mijnText);

                        mijnText.setText(hansString);
                    }
                }
        );
    }

    public static void main(String[] args){

        //System.out.println("Hallo !");
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
