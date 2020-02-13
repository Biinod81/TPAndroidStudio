package org.lythomas.myeventapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        LinearLayout r = findViewById(R.id.LinearLayout2);

        for(int i=1;i<51;i++) {
            TextView Tv = new TextView(getApplicationContext());
            Tv.setText("Item #"+i);
            Tv.setTextColor(Color.BLACK);
            r.addView(Tv);
        }
    }

}
