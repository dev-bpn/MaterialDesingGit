package materialdesinggit.com.materialdesinggit;

import android.animation.Animator;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.Window;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        setContentView(R.layout.activity_main);

    }

    // Simple Transition Animation Between the Activities
    public void onClick(View view){
//        getWindow().setExitTransition(new Explode());
//        Intent intent = new Intent(this , Activity2.class);
//        startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
        startViewAnimation();
    }

    private void startViewAnimation(){
        View myView = (View) findViewById(R.id.textView);

        int cx = myView.getWidth()/2;
        int cy = myView.getHeight()/2;

        int finalRadius = Math.max(myView.getWidth() , myView.getHeight());

        Animator anim = ViewAnimationUtils.createCircularReveal(myView, cx, cy, 0, finalRadius);
        myView.setVisibility(View.VISIBLE);
        anim.start();
    }
}
