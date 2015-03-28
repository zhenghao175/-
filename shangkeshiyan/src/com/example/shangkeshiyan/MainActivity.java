package com.example.shangkeshiyan;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	private TextView info;
	private EditText input;
	private Button button;
	private int target;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        info=(TextView)findViewById(R.id.info);
        input=(EditText)findViewById(R.id.input);
        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
        	public void onClick(View View){
        		if(button.getText().equals("OK")){
        			if(input.getText().toString().equals(""))
        				return;
        			int tmp = Integer.parseInt(input.getText().toString());
        			if(tmp==target){
        				info.setText("恭喜您，猜对了！");
        				button.setText("再来一次");
        			}
        			else if(tmp<target)
        				info.setText("猜小了，请重试：");
        			else
        				info.setText("猜大了，请重试：");
        		}
        		else{
        			newGame();
        		}
        		
        			}
        });
        newGame();
    }

        		
      private void newGame(){
    	  info.setText("请输入1——10之间的数字:" );
    	  input.setText("");
    	  button.setText("OK");
    	  target=(int)((Math.random())*9+1);
      }
    	  
    	  
        
    


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
