package lprgi.rgi_init;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActiviteSecondaire extends AppCompatActivity {

    //on créer un objet de type button
    private Button monBoutonQuitter;

    private TextView montextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_activite_secondaire);

        //on place le widget dans notre variable grâce à son id
        monBoutonQuitter = findViewById(R.id.id_btn_quitter);

        montextView = findViewById(R.id.id_txtview);

        //===============================================
        //   Recuperer les infos d'une autre activité
        //===============================================
        //va recuperer l'intent qui m'a appelé
        Intent unIntent=getIntent();

        Bundle sonBundle=unIntent.getExtras();

        int i= sonBundle.getInt("clef_de_entier");
        CharSequence cq = sonBundle.getCharSequence("clef_de_chaine");

        montextView.setText(i + " - " + cq);


        //======================================================
        //                      Revenir en arriere
        //======================================================
        /*
        //méthode qui permet de revenir sur l'écran précedent
        monBoutonQuitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });*/

        //version pour java 8
        monBoutonQuitter.setOnClickListener(v->{

            finish();
        });
    }
}
