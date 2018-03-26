package gtbit.retro06.www.sikkimelectricityboard;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class NearByCenter extends AppCompatActivity {

    public Button button1;
    public Button button2;
    public Button button3;
    public Button button4;
    public Button button5;
    public Button button6;
    public Button button7;
    public Button button8;
    public Button button9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_near_by_center);

        button1=findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loc1 = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("google.navigation:q=dominoes+near+me"));
                startActivity(loc1);
            }
        });

        button2=findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loc2 = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("google.navigation:q=dominoes+near+me"));
                startActivity(loc2);
                startActivity(loc2);
            }
        });

        button3=findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loc3 = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("google.navigation:q=dominoes+near+me"));
                startActivity(loc3);
            }
        });

        button4=findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loc4 = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("google.navigation:q=dominoes+near+me"));
                startActivity(loc4);
            }
        });

        button5=findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loc5 = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("google.navigation:q=dominoes+near+me"));
                startActivity(loc5);
            }
        });

        button6=findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loc6 = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("google.navigation:q=dominoes+near+me"));
                startActivity(loc6);
            }
        });
        button7=findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loc7 = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("google.navigation:q=dominoes+near+me"));
                startActivity(loc7);
            }
        });
        button8=findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loc8 = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("google.navigation:q=dominoes+near+me"));
                startActivity(loc8);
            }
        });
        button9=findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loc9 = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("google.navigation:q=dominoes+near+me"));
                startActivity(loc9);
            }
        });
    }
}
