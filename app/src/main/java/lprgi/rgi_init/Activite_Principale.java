package lprgi.rgi_init;

import android.content.Intent;
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

        });
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
