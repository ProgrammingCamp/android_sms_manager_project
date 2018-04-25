package com.programmingcamp.smsmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView lblDestination, lblMessage;
    EditText txtDestination, txtMessage;
    Button btnSend, btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lblDestination = (TextView)findViewById(R.id.lblDestination);
        lblMessage = (TextView)findViewById(R.id.lblMessage);
        txtDestination = (EditText)findViewById(R.id.txtDestination);
        txtMessage = (EditText)findViewById(R.id.txtMessage);

        btnSend = (Button)findViewById(R.id.btnSend);
        btnClear = (Button)findViewById(R.id.btnClear);

    }

    public void SendMessage(android.view.View button){
        SmsManager smsManager = SmsManager.getDefault();
        smsManager.sendTextMessage(txtDestination.getText().toString(),"0911999999",txtMessage.getText().toString(),null,null);

        Toast.makeText(this, "Message Sent", Toast.LENGTH_LONG).show();
    }

    public void ClearMessage(android.view.View button){
        txtDestination.setText("");
        txtMessage.setText("");
    }
}
