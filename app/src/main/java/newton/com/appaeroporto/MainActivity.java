package newton.com.appaeroporto;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {

    public ImageView imageView;
    public TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.img_seta);
        textView = findViewById(R.id.txt_texto);

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

            }
        });

    }
}
