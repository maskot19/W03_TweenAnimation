package student.if419005.w03_tweenanimation;

import androidx.appcompat.app.AppCompatActivity;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void scale(View view) {
        ImageView image=(ImageView) findViewById(R.id.imageView);

        Animation animation1=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.scale);

        image.startAnimation(animation1);
    }

    public void clockwise(View view) {
        ImageView image=(ImageView) findViewById(R.id.imageView);

        AnimatorSet animator=(AnimatorSet) AnimatorInflater.loadAnimator(this,R.animator.clockwise);
        animator.setTarget(image);
        animator.start();
    }

    public void heart(View view) {
        ImageView image=(ImageView) findViewById(R.id.imageView);

        image.setImageResource(R.drawable.heart_filling);
    }

    public void blink(View view) {
        ImageView image=(ImageView) findViewById(R.id.imageView);

        Animation animation1=AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);

        image.startAnimation(animation1);
    }

    public void move(View view) {
        ImageView image=(ImageView) findViewById(R.id.imageView);

        Animation animation1=AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);

        image.startAnimation(animation1);
    }

    public void slide(View view) {
        ImageView image=(ImageView) findViewById(R.id.imageView);

        Animation animation1=AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide);

        image.startAnimation(animation1);
    }
}