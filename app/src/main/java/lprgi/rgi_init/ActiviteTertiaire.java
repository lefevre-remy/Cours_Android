package lprgi.rgi_init;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActiviteTertiaire extends AppCompatActivity {

    private double monDouble;
    private CharSequence maCharSequence;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_activite_tertiaire);

        //je recupere l'intent
        Intent unIntent = getIntent();

        //je demande à l'intent qu'il me donne son bundle
        Bundle unBundle = unIntent.getExtras();

        monDouble = unBundle.getDouble("clef_pi");
        maCharSequence=unBundle.getCharSequence("une_chaine");
    }

    public void onclickQuitterTertiaire(View view) {

        Intent retourIntent = new Intent();

        Bundle retourBundle = new Bundle();

        retourBundle.putDouble("retour_double", -monDouble);
        retourBundle.putCharSequence("retour_chaine", maCharSequence.toString().toUpperCase());

        retourIntent.putExtras(retourBundle);

        setResult(Activity.RESULT_OK, retourIntent);

        //
        //
        //

        finish();
    }
}
