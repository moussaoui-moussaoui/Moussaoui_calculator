package com.example.calculator_moussaoui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {


        Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bac, bc, bp, bsqrt, bplus, bminus, bdiv, bmod, bequal, bdot, bbrac1, bbrac2, bsin, bcos, btan, bsquare, bpi, bfact, blog, bln, binv;
        TextView tvmain, tvsec;
        int sum = 0;
        String pi = "3.14159265";

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            b1 = findViewById(R.id.b1);
            b2 = findViewById(R.id.b2);
            b3 = findViewById(R.id.b3);
            b4 = findViewById(R.id.b4);
            b5 = findViewById(R.id.b5);
            b6 = findViewById(R.id.b6);
            b7 = findViewById(R.id.b7);
            b8 = findViewById(R.id.b8);
            b9 = findViewById(R.id.b9);
            b0 = findViewById(R.id.b0);
            bac = findViewById(R.id.bac);
            bc = findViewById(R.id.bc);
            bplus = findViewById(R.id.bplus);
            bminus = findViewById(R.id.bminus);
            bdiv = findViewById(R.id.bdiv);
            bmod = findViewById(R.id.bmod);
            bequal = findViewById(R.id.bequal);
            bdot = findViewById(R.id.bdot);
            bsqrt = findViewById(R.id.bsqrt);
            bfact = findViewById(R.id.bfact);
            bsquare = findViewById(R.id.bsquare);
            bsin = findViewById(R.id.bsin);
            bcos = findViewById(R.id.bcos);
            btan = findViewById(R.id.btan);
            bpi = findViewById(R.id.bpi);
            bbrac1 = findViewById(R.id.bbrac1);
            bbrac2 = findViewById(R.id.bbrac2);
            blog = findViewById(R.id.blog);
            bln = findViewById(R.id.bln);
            binv = findViewById(R.id.binv);

            tvmain = findViewById(R.id.tvmain);
            tvsec = findViewById(R.id.tvsec);

            //onclick listeners
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String val = tvmain.getText().toString();
                    tvmain.setText(val + b1.getText().toString());
                }
            });
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String val = tvmain.getText().toString();
                    tvmain.setText(val + b2.getText().toString());
                }
            });
            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String val = tvmain.getText().toString();
                    tvmain.setText(val + b3.getText().toString());
                }
            });
            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String val = tvmain.getText().toString();
                    tvmain.setText(val + b4.getText().toString());
                }
            });
            b5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String val = tvmain.getText().toString();
                    tvmain.setText(val + b5.getText().toString());
                }
            });
            b6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String val = tvmain.getText().toString();
                    tvmain.setText(val + b6.getText().toString());
                }
            });
            b7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String val = tvmain.getText().toString();
                    tvmain.setText(val + b7.getText().toString());
                }
            });
            b8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String val = tvmain.getText().toString();
                    tvmain.setText(val + b8.getText().toString());
                }
            });
            b9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String val = tvmain.getText().toString();
                    tvmain.setText(val + b9.getText().toString());
                }
            });
            b0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String val = tvmain.getText().toString();
                    tvmain.setText(val + b0.getText().toString());
                }
            });
            bdot.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String val = tvmain.getText().toString();
                    if (!val.contains(".")) {
                        tvmain.setText(val + bdot.getText().toString());
                    }
                }
            });
            bplus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String val = tvmain.getText().toString();
                    if (!val.equals("")) {
                        tvmain.setText(val + bplus.getText().toString());
                    }
                }
            });
            bdiv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String val = tvmain.getText().toString();
                    if (!val.equals("")) {
                        tvmain.setText(val + bdiv.getText().toString());
                    }
                }
            });
            bminus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String val = tvmain.getText().toString();
                    char last = val.charAt(val.length() - 1);
                    if (last != '-') {
                        tvmain.setText(val + bminus.getText().toString());
                    }
                }
            });
            bmod.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String val = tvmain.getText().toString();
                    char last = val.charAt(val.length() - 1);
                    if (!val.equals("")) {
                        tvmain.setText(val + bmod.getText().toString());
                    }
                }
            });
            bsqrt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String val = tvmain.getText().toString();
                    double r = Math.sqrt(Double.parseDouble(val));
                    String result = String.valueOf(r);
                    tvmain.setText(result);
                }
            });

            bac.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    tvmain.setText("");
                    tvsec.setText("");
                }
            });
            bc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String val = tvmain.getText().toString();
                    if (!val.equals("")) {
                        val = val.substring(0, val.length() - 1);
                        tvmain.setText(val);
                    }

                }
            });

            bbrac1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    tvmain.setText(tvmain.getText() + "(");
                }
            });
            bbrac2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    tvmain.setText(tvmain.getText() + ")");
                }
            });
            bpi.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    tvmain.setText(tvmain.getText() + pi);
                    tvsec.setText(bpi.getText());
                    //hold
                }
            });
            bsin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    tvmain.setText(tvmain.getText() + "sin");
                    //hold
                }
            });
            bcos.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    tvmain.setText(tvmain.getText() + "cos");
                    //hold
                }
            });
            btan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    tvmain.setText(tvmain.getText() + "tan");
                    //hold
                }
            });
            bsquare.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    double d = Double.parseDouble(tvmain.getText().toString());
                    double square = d * d;
                    tvmain.setText(String.valueOf(square));
                    tvsec.setText(d + "??");
                }
            });

            binv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    tvmain.setText(tvmain.getText().toString() + "^" + "(-1)");
                }
            });
            bln.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    tvmain.setText(tvmain.getText().toString() + "ln");
                }
            });
            blog.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    tvmain.setText(tvmain.getText().toString() + "log");
                }
            });
        }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            MenuInflater inflater = getMenuInflater();
            inflater.inflate(R.menu.mymenu, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.item1:
                    Intent obj = new Intent(this, MainActivity2.class);
                default:
                    Intent obj2 = new Intent(this, MainActivity2.class);

            }
            return super.onOptionsItemSelected(item);
        }

        //factorial


        //evaluation


    }