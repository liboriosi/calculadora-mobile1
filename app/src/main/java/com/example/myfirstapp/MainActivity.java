package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import expr.Expr;
import expr.Parser;
import expr.SyntaxException;


public class MainActivity extends AppCompatActivity {
    String text = "";
    Expr expr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button= (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView helloTextView = (TextView) findViewById(R.id.textView);
                text += '0';
                helloTextView.setText (text);



            }
        });

        Button button2= (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView helloTextView = (TextView) findViewById(R.id.textView);
                text += ',';
                helloTextView.setText (text);


            }
        });
        Button button4= (Button)findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView helloTextView = (TextView) findViewById(R.id.textView);
                text += '+';
                helloTextView.setText (text);


            }
        });
        Button button8= (Button)findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView helloTextView = (TextView) findViewById(R.id.textView);
                text += '1';
                helloTextView.setText (text);


            }
        });
        Button button9= (Button)findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView helloTextView = (TextView) findViewById(R.id.textView);
                text += '2';
                helloTextView.setText (text);


            }
        });
        Button button10= (Button)findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView helloTextView = (TextView) findViewById(R.id.textView);
                text += '3';
                helloTextView.setText (text);


            }
        });
        Button button11= (Button)findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView helloTextView = (TextView) findViewById(R.id.textView);
                text += '-';
                helloTextView.setText (text);


            }
        });
        Button button16= (Button)findViewById(R.id.button16);
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView helloTextView = (TextView) findViewById(R.id.textView);
                text += '4';
                helloTextView.setText (text);


            }
        });
        Button button17= (Button)findViewById(R.id.button17);
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView helloTextView = (TextView) findViewById(R.id.textView);
                text += '5';
                helloTextView.setText (text);


            }
        });
        Button button18= (Button)findViewById(R.id.button18);
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView helloTextView = (TextView) findViewById(R.id.textView);
                text += '6';
                helloTextView.setText (text);


            }
        });
        Button button19= (Button)findViewById(R.id.button19);
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView helloTextView = (TextView) findViewById(R.id.textView);
                text += '*';
                helloTextView.setText (text);


            }
        });
        Button button20= (Button)findViewById(R.id.button20);
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView helloTextView = (TextView) findViewById(R.id.textView);
                text += '7';
                helloTextView.setText (text);


            }
        });
        Button button21= (Button)findViewById(R.id.button21);
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView helloTextView = (TextView) findViewById(R.id.textView);
                text += '8';
                helloTextView.setText (text);


            }
        });
        Button button22= (Button)findViewById(R.id.button22);
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView helloTextView = (TextView) findViewById(R.id.textView);
                text += '9';
                helloTextView.setText (text);


            }
        });
        Button button23= (Button)findViewById(R.id.button23);
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView helloTextView = (TextView) findViewById(R.id.textView);
                text += '/';
                helloTextView.setText (text);


            }
        });
        Button button25= (Button)findViewById(R.id.button25);
        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView helloTextView = (TextView) findViewById(R.id.textView);
                text += '(';
                helloTextView.setText (text);


            }
        });
        Button button26= (Button)findViewById(R.id.button26);
        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView helloTextView = (TextView) findViewById(R.id.textView);
                text += ')';
                helloTextView.setText (text);


            }
        });
        Button button27= (Button)findViewById(R.id.button27);
        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView helloTextView = (TextView) findViewById(R.id.textView);
                text += "^";
                helloTextView.setText (text);


            }
        });
        Button button24= (Button)findViewById(R.id.button24);
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView helloTextView = (TextView) findViewById(R.id.textView);
                final TextView helloTextView2 = (TextView) findViewById(R.id.textView2);

                text = "";
                helloTextView.setText (text);
                helloTextView2.setText (text);


            }
        });
        Button button3= (Button)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView helloTextView2 = (TextView) findViewById(R.id.textView2);

                Log.i("text", text);

                try {
                    expr = Parser.parse(text);
                    helloTextView2.setText(expr.value()+"");
                } catch (SyntaxException e) {
                    helloTextView2.setText(e.explain());
                }

            }
        });
    }
}