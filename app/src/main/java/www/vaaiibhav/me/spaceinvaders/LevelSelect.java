package www.vaaiibhav.me.spaceinvaders;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LevelSelect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_select);
        Button lvl1 = (Button)findViewById(R.id.btn_lvl1);
        Button lvl2  = (Button) findViewById(R.id.btn_lvl2);
        lvl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LevelSelect.this,SpaceInvadersActivity.class);
                startActivity(i);
            }
        });
        lvl2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LevelSelect.this,SpaceInvadersActivitytwo.class);
                startActivity(i);
            }
        });
    }
}
