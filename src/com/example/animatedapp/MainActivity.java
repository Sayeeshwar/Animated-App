package com.example.animatedapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {
	
	Animation a_alpha,a_rotate,a_set,a_scale,a_translate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
        Button alpha = (Button) findViewById(R.id.button1);
        Button rotate = (Button) findViewById(R.id.button2);
        Button set = (Button) findViewById(R.id.button3);
        Button scale = (Button) findViewById(R.id.button4);
        Button translate = (Button) findViewById(R.id.button5);
        final ImageView image= (ImageView) findViewById(R.id.imageView1);
        
        
        a_alpha=AnimationUtils.loadAnimation(this,R.anim.anim_alpha);
        a_rotate=AnimationUtils.loadAnimation(this,R.anim.anim_rotate);
        a_set=AnimationUtils.loadAnimation(this, R.anim.anim_set);
        a_scale=AnimationUtils.loadAnimation(this, R.anim.anim_scale);
        a_translate=AnimationUtils.loadAnimation(this, R.anim.anim_translate);
        
        alpha.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				image.startAnimation(a_alpha);
				
			}
		});
        
        rotate.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				image.startAnimation(a_rotate);
				
			}
		});

        set.setOnClickListener(new OnClickListener() {
	
        	@Override
        	public void onClick(View arg0) {
        		// 	TODO Auto-generated method stub
        		image.startAnimation(a_set);
		
        	}
        });

        scale.setOnClickListener(new OnClickListener() {
	
        	@Override
        	public void onClick(View arg0) {
        		// 	TODO Auto-generated method stub
        		image.startAnimation(a_scale);
		
        	}
        });

        translate.setOnClickListener(new OnClickListener() {
	
        	@Override
        	public void onClick(View arg0) {
        		// 	TODO Auto-generated method stub
        		image.startAnimation(a_translate);
		
        	}
        });
        
        
        
    
    }
    
}
