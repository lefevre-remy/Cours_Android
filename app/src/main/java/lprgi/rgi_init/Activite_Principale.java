package lprgi.rgi_init;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activite_Principale extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*fait reference à la ressource situé dans le dossier res (dans notre cas layout/layout...)*/
        setContentView(R.layout.layout_activite__principale);
    }

    //méthode créer automatique depuis le onclick xml
    public void LancerActivite(View view) {

    }
}
