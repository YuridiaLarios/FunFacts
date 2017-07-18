package com.yurisco.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class FunFactsActivity extends AppCompatActivity {
    // Declare our view variables

    private FactBook mFactBook = new FactBook();       // you have to create an object of the class
    private BackgroundColor mBackgroundColor = new BackgroundColor();
    private TextView mFactTextView;
    private Button mShowFactButton;
    private RelativeLayout mRelativeLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Assign the Views from the layout file to the corresponding variable
        mFactTextView = (TextView) findViewById(R.id.textView);
        mShowFactButton = (Button) findViewById(R.id.FunFactButton);
        mRelativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int color = mBackgroundColor.getColor();

                // update the screen with our dynamic fact
                mFactTextView.setText(mFactBook.getFact());
                mRelativeLayout.setBackgroundColor(color);
                mShowFactButton.setTextColor(color);

            }
        };



        mShowFactButton.setOnClickListener(listener);
    }
}

