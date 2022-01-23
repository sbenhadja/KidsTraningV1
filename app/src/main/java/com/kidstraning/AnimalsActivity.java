package com.kidstraning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.annotation.Annotation;

import java.lang.annotation.Annotation;

public class AnimalsActivity extends AppCompatActivity {
    Button acceil, svt, prc;
    ImageView image;
    TextView txtView;
    MediaPlayer media;
    Animation packageimg,packagetxt;;
    int x=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals);
        media = MediaPlayer.create(this, R.raw.lettersnd3);
        media.start();
       // packagetxt = (Annotation) AnimationUtils.loadAnimation(this,R.anim.packagetxt);
    }
    //stop music if it playing in back
    private void StopMsq(){
        if(media!=null && media.isPlaying()){
            media.stop();}
    }
    //initialiser les attrubuts de pallet
    private void AtrubutInitialisation(){
        image = (ImageView) findViewById(R.id.imageView);
        txtView = (TextView) findViewById(R.id.textView2);
        svt = (Button) findViewById(R.id.suivant);
        prc = (Button) findViewById(R.id.prec);
        //Appl animation
        packagetxt = AnimationUtils.loadAnimation(this,R.anim.packagetxt);
        packageimg = AnimationUtils.loadAnimation(this,R.anim.packageimg);
    }

    //onClick butoton acceil رجوع
    public void Acceil(View view){
        Intent intent = new Intent( AnimalsActivity.this, MainActivity.class);
        startActivity(intent);
        StopMsq();
    }


    //onClick butoton suivant التالي
    public void Suivant(View view){
        AtrubutInitialisation();
        StopMsq();

        int resID=R.drawable.sos;
        // String sos;
        //  int id = getResources().getIdentifier(sos, "drawable", getPackageName());
        //   image.setImageResource(id);
        if(x==0){
            x++;
            image.setImageResource(R.drawable.sos);
            txtView.setText("Poussin -- كتكوت");
            prc.setClickable(true);
            image.startAnimation(packageimg);
            txtView.startAnimation(packagetxt);
            media = MediaPlayer.create((Context) this, R.raw.lettersnd1);
            media.start();
        }
        else if(x==1){
            x++;
            image.setImageResource(R.drawable.dajaja);
            txtView.setText("poulet -- دجاجة");
            image.startAnimation(packageimg);
            txtView.startAnimation(packagetxt);
            media = MediaPlayer.create((Context) this, R.raw.lettersnd2);
            media.start();
        }
        else if(x==2){
            x++;
            image.setImageResource(R.drawable.bata);
            txtView.setText("Canard -- بطة");
            image.startAnimation(packageimg);
            txtView.startAnimation(packagetxt);
        }
        else if(x==3){
            x++;
            image.setImageResource(R.drawable.dik);
            txtView.setText("Coq -- ديك");
        }
        else if(x==4){
            x++;
            image.setImageResource(R.drawable.git);
            txtView.setText("chat -- قط");
        }
        else if(x==5){
            x++;
            image.setImageResource(R.drawable.kalb);
            txtView.setText("Chien -- كلب");
        }
        else if(x==6){
            x++;
            image.setImageResource(R.drawable.kharof);
            txtView.setText("Moutons -- خروف");
        }
        else if(x==7){
            x++;
            image.setImageResource(R.drawable.maza);
            txtView.setText("chèvre -- معزات");
        }
        else if(x==8){
            x++;
            image.setImageResource(R.drawable.bakara);
            txtView.setText("Vache -- بقرة");
        }
        else if(x==9){
            x++;
            image.setImageResource(R.drawable.camel);
            txtView.setText("Chameau -- جمل");
        }
        else if(x==10){
            x++;
            image.setImageResource(R.drawable.hissan);
            txtView.setText("Cheval -- حصان");
        }
        else if(x==11){
            x++;
            image.setImageResource(R.drawable.hmar);
            txtView.setText("Âne -- حمار");
        }
        else if(x==12){
            x++;
            image.setImageResource(R.drawable.himarwahchi);
            txtView.setText("Zèbre -- حمار وحشي");
        }
        else if(x==13){
            x++;
            image.setImageResource(R.drawable.zarafa);
            txtView.setText("Gerafe -- زرافة");
        }
        else if(x==14){
            x++;
            image.setImageResource(R.drawable.fil);
            txtView.setText("éléphant -- فيل");
        }
        else if(x==15){
            x++;
            image.setImageResource(R.drawable.kangar);
            txtView.setText("Kangourou -- كنغر");
        }
        else if(x==16){
            x++;
            image.setImageResource(R.drawable.wahid);
            txtView.setText("Rhinocéros -- وحيد القرن");
        }
        else if(x==17){
            x++;
            image.setImageResource(R.drawable.kird);
            txtView.setText("Singe -- قرد");
        }
        else if(x==18){
            x++;
            image.setImageResource(R.drawable.fnek);
            txtView.setText("Fennec -- فنك");
        }
        else if(x==19){
            x++;
            image.setImageResource(R.drawable.taaleb);
            txtView.setText("Fennec -- فنك");
        }
        else if(x==20){
            x++;
            image.setImageResource(R.drawable.dib);
            txtView.setText("Loup -- ذئب");
        }
        else if(x==21){
            x++;
            image.setImageResource(R.drawable.dbaa);
            txtView.setText("Hyène -- ضبع");
        }
        else if(x==22){
            x++;
            image.setImageResource(R.drawable.nmar);
            txtView.setText("Tigre --  نمر");
        }
        else if(x==23){
            x++;
            image.setImageResource(R.drawable.asad);
            txtView.setText("Lion -- أسد");
        }
        else if(x==24){
            x++;
            image.setImageResource(R.drawable.nisr);
            txtView.setText("Aigle -- نسر");
        }
        else if(x==25){
            x++;
            image.setImageResource(R.drawable.asfor);
            txtView.setText("Oiseau -- عصفور");
        }
        else if(x==26){
            x++;
            image.setImageResource(R.drawable.faracha);
            txtView.setText("Papillon -- فراشة");
        }
        else if(x==27){
            x++;
            image.setImageResource(R.drawable.dolfin);
            txtView.setText("Dauphin -- دلفين");
        }
        else if(x==28){
            x++;
            image.setImageResource(R.drawable.fokma);
            txtView.setText("Sceau -- فقمة");
        }
        else if(x==29){
            x++;
            image.setImageResource(R.drawable.betrik);
            txtView.setText("Pingouin -- بطريق");
        }
        else if(x==30){
             x++;
            image.setImageResource(R.drawable.kirch);
            txtView.setText("Requin -- قرش");
            svt.setClickable(false);
        }
    }

    //onClick butoton arrier السابق
    public void Precedent(View view){
        AtrubutInitialisation();
        StopMsq();
        Toast.makeText(AnimalsActivity.this,"test"+x, Toast.LENGTH_LONG).show();

        if(x==0){
            prc.setClickable(false);
        }
        else  if(x==1){
            x--;
            image.setImageResource(R.drawable.hamama);
            txtView.setText("حمامة -- Pigeon");

        }
        else if(x==2){
            x--;
            image.setImageResource(R.drawable.sos);
            txtView.setText("Poussin -- كتكوت");
        }
        else if(x==3){
            x--;
            image.setImageResource(R.drawable.dajaja);
            txtView.setText("poulet -- دجاجة");
        }
        else if(x==4){
            x--;
            image.setImageResource(R.drawable.bata);
            txtView.setText("Canard -- بطة");
        }
        else if(x==5){
            x--;
            image.setImageResource(R.drawable.dik);
            txtView.setText("Coq -- ديك");
        }
        else if(x==6){
            x--;
            image.setImageResource(R.drawable.git);
            txtView.setText("chat -- قط");
        }
        else if(x==7){
            x--;
            image.setImageResource(R.drawable.kalb);
            txtView.setText("Chien -- كلب");
        }
        else if(x==8){
            x--;
            image.setImageResource(R.drawable.kharof);
            txtView.setText("Moutons -- خروف");
        }
        else if(x==9){
            x--;
            image.setImageResource(R.drawable.maza);
            txtView.setText("chèvre -- معزات");
        }
        else if(x==10){
            x--;
            image.setImageResource(R.drawable.bakara);
            txtView.setText("Vache -- بقرة");
        }
        else if(x==11){
            x--;
            image.setImageResource(R.drawable.camel);
            txtView.setText("Chameau -- جمل");
        }
        else if(x==12){
            x--;
            image.setImageResource(R.drawable.hissan);
            txtView.setText("Cheval -- حصان");
        }
        else if(x==13){
            x--;
            image.setImageResource(R.drawable.hmar);
            txtView.setText("Âne -- حمار");
        }
        else if(x==14){
            x--;
            image.setImageResource(R.drawable.himarwahchi);
            txtView.setText("Zèbre -- حمار وحشي");
        }
        else if(x==15){
            x--;
            image.setImageResource(R.drawable.zarafa);
            txtView.setText("Gerafe -- زرافة");
        }
        else if(x==16){
            x--;
            image.setImageResource(R.drawable.fil);
            txtView.setText("éléphant -- فيل");
        }
        else if(x==17){
            x--;
            image.setImageResource(R.drawable.kangar);
            txtView.setText("Kangourou -- كنغر");
        }
        else if(x==18){
            x--;
            image.setImageResource(R.drawable.wahid);
            txtView.setText("Rhinocéros -- وحيد القرن");
        }
        else if(x==19){
            x--;
            image.setImageResource(R.drawable.kird);
            txtView.setText("Singe -- قرد");
        }
        else if(x==20){
            x--;
            image.setImageResource(R.drawable.fnek);
            txtView.setText("Fennec -- فنك");
        }
        else if(x==21){
            x--;
            image.setImageResource(R.drawable.taaleb);
            txtView.setText("Renard -- ثعلب");
        }
        else if(x==22){
            x--;
            image.setImageResource(R.drawable.dib);
            txtView.setText("Loup -- ذئب");
        }
        else if(x==23){
            x--;
            image.setImageResource(R.drawable.dbaa);
            txtView.setText("Hyène -- ضبع");
        }
        else if(x==24){
            x--;
            image.setImageResource(R.drawable.nmar);
            txtView.setText("Tigre --  نمر");
        }
        else if(x==25){
            x--;
            image.setImageResource(R.drawable.asad);
            txtView.setText("Lion -- أسد");
        }
        else if(x==26){
            x--;
            image.setImageResource(R.drawable.nisr);
            txtView.setText("Aigle -- نسر");
        }
        else if(x==27){
            x--;
            image.setImageResource(R.drawable.asfor);
            txtView.setText("Oiseau -- عصفور");
        }
        else if(x==28){
            x--;
            image.setImageResource(R.drawable.faracha);
            txtView.setText("Papillon -- فراشة");
        }
        else if(x==29){
            x--;
            image.setImageResource(R.drawable.dolfin);
            txtView.setText("Dauphin -- دلفين");
        }
        else if(x==30){
            x--;
            image.setImageResource(R.drawable.fokma);
            txtView.setText("Sceau -- فقمة");
        }
        else if(x==31){
            x--;
            image.setImageResource(R.drawable.betrik);
            txtView.setText("Pingouin -- بطريق");
            svt.setClickable(true);
        }
    }
    public void NameSond(View view) {
        StopMsq();
        if (x == 0) {
            media = MediaPlayer.create((Context) this, R.raw.ananas);
            media.start();
        } else if (x == 1) {
            media = MediaPlayer.create((Context) this, R.raw.banans);
            media.start();
        }
    }
}
