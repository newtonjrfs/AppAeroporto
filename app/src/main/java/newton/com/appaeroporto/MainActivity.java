package newton.com.appaeroporto;

import android.app.Activity;
import android.graphics.drawable.Animatable2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {

    public ImageView imageView;
    public TextView textView;
    Animation aparece;
    Animation some;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.img_seta);
        textView = findViewById(R.id.txt_texto);

        aparece = new AlphaAnimation(0,1);
        some = new AlphaAnimation(1,0);

        some.setDuration(500);


        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Math.random()<0.5){
                    textView.setText("Siga para a esquerda");
                    imageView.setScaleX(1f);

                }else{
                    textView.setText("Siga para a direita");
                    imageView.setScaleX(-1f);
                }

                imageView.startAnimation(some);

            }
        });

    }
}
