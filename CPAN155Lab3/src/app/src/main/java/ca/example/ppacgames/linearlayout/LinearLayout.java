package ca.example.ppacgames.linearlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import ca.example.ppacgames.linearlayout.R;

public class LinearLayout extends AppCompatActivity {

    private Button clear;
    private Button send;
    private TextView to;
    private TextView subject;
    private TextView message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);
        to = (TextView)findViewById(R.id.textto);
        subject = (TextView)findViewById(R.id.textsubject);
        message = (TextView)findViewById(R.id.textmessage);
        clear = (Button)findViewById(R.id.btnClear);

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            to.setText("");
                subject.setText("");
                message.setText("");
            }

        });

        send = (Button)findViewById(R.id.btnsend);

        send.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(LinearLayout.this,"TO:" +to.getText()+ ", SUBJECT:" + subject.getText()+", MESSAGE: "+message.getText(), Toast.LENGTH_SHORT).show();
            }

        });

    }


}
