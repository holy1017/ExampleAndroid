package com.example.lilly.example;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        //test();

        setContentView(R.layout.login_layout);  //로그인 레이아웃
    }

    private void test() {
        setContentView(R.layout.activity_main);

        //툴바 설정
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //우측 하단 메일 버튼 설정
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //하단에서 메세지 내용이 바처럼 올라왔다가 사라짐
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        EditText etId=(EditText) findViewById(R.id.et_id);
        EditText etPw=(EditText) findViewById(R.id.et_pw);
        Button btLogin = (Button) findViewById(R.id.bt_login);
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
        if(id == R.id.action_settings){
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void login(View view) {
        EditText etId=(EditText) findViewById(R.id.et_id);
        EditText etPw=(EditText) findViewById(R.id.et_pw);

        Toast.makeText(this, "ID:"+etId.getText()+" PW:"+etPw.getText(), Toast.LENGTH_SHORT).show();

        test();


    }
}
