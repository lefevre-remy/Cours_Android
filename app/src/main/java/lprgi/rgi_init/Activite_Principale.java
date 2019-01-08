package lprgi.rgi_init;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activite_Principale extends AppCompatActivity {

    private Button boutonAvecRetour;
    private TextView textViewResultat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*fait reference à la ressource situé dans le dossier res (dans notre cas layout/layout...)*/
        setContentView(R.layout.layout_activite__principale);

        boutonAvecRetour = findViewById(R.id.id_btn_avec_retour);

        textViewResultat = findViewById(R.id.id_txtview_rslt);

        //lorsque l'on clique avec le bouton
        boutonAvecRetour.setOnClickListener(v->{
            Intent monIntent=new Intent(this, ActiviteTertiaire.class);

            Bundle monBundle = new Bundle();
            monBundle.putDouble("clef_pi", Math.PI);
            monBundle.putCharSequence("une_chaine","AbbA");

            monIntent.putExtras(monBundle);

            startActivityForResult(monIntent, 456);
            //
            //
            //
        });
    }

    //auto-généré par ctrl+o onactivity...
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        switch (requestCode){

            case  456 : {
                Bundle unBundle = data.getExtras();

                double d = unBundle.getDouble("retour_double");
                CharSequence cq=unBundle.getCharSequence("retour_chaine");
                textViewResultat.setText(d + " " + cq);
                //
                //
                //
            };break;

        }
    }

    //méthode créer automatique depuis le onclick xml
    public void LancerActivite(View view) {

        //on instancie un intent avec la classe que l'on veut déclencher
        Intent monIntent = new Intent(this, ActiviteSecondaire.class);

        //==============================================
        // Bundle : conteneur de donnée clé/valeur
        //==============================================

        Bundle monBundle = new Bundle();

        monBundle.putInt("clef_de_entier", 123);
        monBundle.putCharSequence("clef_de_chaine", "Malecifient");

        monIntent.putExtras(monBundle);

        //si tu l'a connais déclenche là
        startActivity(monIntent);
    }
}
