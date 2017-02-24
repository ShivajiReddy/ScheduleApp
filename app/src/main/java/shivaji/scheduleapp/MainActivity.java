package shivaji.scheduleapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button a = (Button) findViewById(R.id.sa);
        Button b = (Button) findViewById(R.id.sb);
        Button c = (Button) findViewById(R.id.sc);
        Button d = (Button) findViewById(R.id.sd);
        Button e = (Button) findViewById(R.id.se);
        Button f = (Button) findViewById(R.id.sf);
        Button g = (Button) findViewById(R.id.sg);
        Button h = (Button) findViewById(R.id.sh);
        Button i = (Button) findViewById(R.id.si);
        Button j = (Button) findViewById(R.id.sj);
        Button k = (Button) findViewById(R.id.sk);
        Button l = (Button) findViewById(R.id.sl);
        Button m = (Button) findViewById(R.id.sm);
        Button n = (Button) findViewById(R.id.sn);
        Button o = (Button) findViewById(R.id.so);
        Button p = (Button) findViewById(R.id.sp);
        Button q = (Button) findViewById(R.id.sq);
        Button r = (Button) findViewById(R.id.sr);
        Button s = (Button) findViewById(R.id.ss);
        Button t = (Button) findViewById(R.id.st);
        Button u = (Button) findViewById(R.id.su);
        Button v = (Button) findViewById(R.id.sv);
        Button w = (Button) findViewById(R.id.sw);
        Button x = (Button) findViewById(R.id.sx);


        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendReq("a");
            }
        });
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                sendReq("b");
            }
        });
        c.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                sendReq("c");
            }
        });
        d.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                sendReq("d");
            }
        });
        e.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                sendReq("e");
            }
        });
        f.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                sendReq("f");
            }
        });
        g.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                sendReq("g");
            }
        });
        h.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                sendReq("h");
            }
        });
        i.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                sendReq("i");
            }
        });
        j.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                sendReq("j");
            }
        });
        k.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                sendReq("k");
            }
        });
        l.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                sendReq("l");
            }
        });
        m.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                sendReq("m");
            }
        });
        n.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                sendReq("n");
            }
        });
        o.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                sendReq("o");
            }
        });
        p.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                sendReq("p");
            }
        });
        q.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                sendReq("q");
            }
        });
        r.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                sendReq("r");
            }
        });
        s.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                sendReq("s");
            }
        });
        t.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                sendReq("t");
            }
        });
        u.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                sendReq("u");
            }
        });
        v.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                sendReq("v");
            }
        });
        w.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                sendReq("w");
            }
        });
        x.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                sendReq("x");
            }
        });


    }

    public void sendReq(String string){
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        intent.putExtra("section", string);
        startActivity(intent);
    }
}
