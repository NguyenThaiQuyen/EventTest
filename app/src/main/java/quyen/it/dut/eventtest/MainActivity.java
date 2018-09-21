package quyen.it.dut.eventtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    private Button btn_tong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_tong = findViewById(R.id.btn_tong);
        btn_tong.setOnClickListener(this);

        // the way Anonymous listener
        btn_tong = findViewById(R.id.btn_tong);
        btn_tong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText soa= (EditText)findViewById(R.id.edt_so_a);
                int a= Integer.parseInt(soa.getText()+ "");
                EditText sob= (EditText)findViewById(R.id.edt_so_b);
                int b= Integer.parseInt(sob.getText()+ "");

                TextView text_result= (TextView)findViewById(R.id.txt_result);
                text_result.setText(a + b + " ");
            }
        });

    }

    // the way onClick in XML
    public void btn_Sum(View view) {

        EditText soa= (EditText)findViewById(R.id.edt_so_a);
        int a= Integer.parseInt(soa.getText()+ "");
        EditText sob= (EditText)findViewById(R.id.edt_so_b);
        int b= Integer.parseInt(sob.getText()+ "");

        TextView text_result= (TextView)findViewById(R.id.txt_result);
        text_result.setText(a + b + " ");
    }

    // the way  Activity is listener
    @Override
    public void onClick(View v) {
        EditText soa= (EditText)findViewById(R.id.edt_so_a);
        int a= Integer.parseInt(soa.getText()+ "");
        EditText sob= (EditText)findViewById(R.id.edt_so_b);
        int b= Integer.parseInt(sob.getText()+ "");

        TextView text_result= (TextView)findViewById(R.id.txt_result);
        text_result.setText(a + b + " ");
    }
}
