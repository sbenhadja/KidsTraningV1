package com.kidstraning;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.Collator;
import android.os.Bundle;
import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ColorActivity<mFirebaseAnalyticsFacebook> extends AppCompatActivity {

    Animation animImg;
    Animation animTxt;

    ImageView backBtn;

    ImageView svtBtn;
    ImageView precBtn;

    ImageView sondBtn;
    ImageView voixBtn;

    ImageView Imagething;
    TextView Namething;

    ArrayList<LingThing> listeThing;

    int xSign;
    MediaPlayer media;
    AudioManager.OnAudioFocusChangeListener audioListener;
    String type;
    private Object mFirebaseAnalyticsFacebook;
    private Collator FirebaseAnalytics;

    private void tableThing() {

            this.listeThing.add(new LingThing("حمامة -- Pigeon", R.drawable.hamama, R.raw.camel));
            this.listeThing.add(new LingThing("Poussin -- كتكوت", R.drawable.sos, R.raw.bear));
            this.listeThing.add(new LingThing("poulet -- دجاجة", R.drawable.dajaja, R.raw.bear));
            this.listeThing.add(new LingThing("Canard -- بطة", R.drawable.bata, R.raw.bear));
            this.listeThing.add(new LingThing("Coq -- ديك", R.drawable.dik, R.raw.bear));
            this.listeThing.add(new LingThing("chat -- قط", R.drawable.git, R.raw.bear));
            this.listeThing.add(new LingThing("Chien -- كلب", R.drawable.kalb, R.raw.bear));
            this.listeThing.add(new LingThing("Moutons -- خروف", R.drawable.kharof, R.raw.bear));
            this.listeThing.add(new LingThing("chèvre -- معزات", R.drawable.maza, R.raw.bear));
            this.listeThing.add(new LingThing("Vache -- بقرة", R.drawable.bakara, R.raw.bear));
            this.listeThing.add(new LingThing("Chameau -- جمل", R.drawable.camel, R.raw.bear));
            this.listeThing.add(new LingThing("Cheval -- حصان", R.drawable.hissan, R.raw.bear));
            this.listeThing.add(new LingThing("Âne -- حمار", R.drawable.hmar, R.raw.bear));
            this.listeThing.add(new LingThing("Zèbre -- حمار وحشي", R.drawable.himarwahchi, R.raw.bear));
            this.listeThing.add(new LingThing("Gerafe -- زرافة", R.drawable.zarafa, R.raw.bear));
            this.listeThing.add(new LingThing("éléphant -- فيل", R.drawable.fil, R.raw.bear));
            this.listeThing.add(new LingThing("Kangourou -- كنغر", R.drawable.kangar, R.raw.bear));
            this.listeThing.add(new LingThing("Rhinocéros -- وحيد القرن", R.drawable.wahid, R.raw.bear));
            this.listeThing.add(new LingThing("Singe -- قرد", R.drawable.kird, R.raw.bear));
            this.listeThing.add(new LingThing("Fennec -- فنك", R.drawable.fnek, R.raw.bear));
            this.listeThing.add(new LingThing("Renard -- ثعلب", R.drawable.taaleb, R.raw.bear));
            this.listeThing.add(new LingThing("Loup -- ذئب", R.drawable.dib, R.raw.bear));
            this.listeThing.add(new LingThing("Hyène -- ضبع", R.drawable.dbaa, R.raw.bear));
            this.listeThing.add(new LingThing("Tigre --  نمر", R.drawable.nmar, R.raw.bear));
            this.listeThing.add(new LingThing("Lion -- أسد", R.drawable.asad, R.raw.bear));
            this.listeThing.add(new LingThing("Aigle -- نسر", R.drawable.nisr, R.raw.bear));
            this.listeThing.add(new LingThing("Oiseau -- عصفور", R.drawable.asfor, R.raw.bear));
            this.listeThing.add(new LingThing("Papillon -- فراشة", R.drawable.faracha, R.raw.bear));
            this.listeThing.add(new LingThing("Dauphin -- دلفين", R.drawable.dolfin, R.raw.bear));
            this.listeThing.add(new LingThing("Sceau -- فقمة", R.drawable.fokma, R.raw.bear));
            this.listeThing.add(new LingThing("Pingouin -- بطريق", R.drawable.betrik, R.raw.bear));
            this.listeThing.add(new LingThing("Requin -- قرش", R.drawable.kirch, R.raw.bear));
    }

    private void fillObjectsWithData() {
        this.Imagething.setImageResource(((LingThing) this.listeThing.get(this.xSign)).getImageOfThingId());
        this.Namething.setText(((LingThing) this.listeThing.get(this.xSign)).getThingName());
        startSong();
    }

    private void startSong() {
        final AudioManager audioManager = (AudioManager)getSystemService((String)"audio");
        if (audioManager.requestAudioFocus(this.audioListener, 3, 1) == 1)
            if (this.media != null) {
                this.media.release();
                this.media = null;
                this.media = MediaPlayer.create((Context)this, ((LingThing)this.listeThing.get(this.xSign)).getSong());
                this.media.start();
            } else {
                this.media = MediaPlayer.create((Context)this, ((LingThing)this.listeThing.get(this.xSign)).getSong());
                this.media.start();
            }
        this.media.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer param1MediaPlayer) { audioManager.abandonAudioFocus(ColorActivity.this.audioListener); }
        });
    }

    public Object getmFirebaseAnalyticsFacebook() {
        return mFirebaseAnalyticsFacebook;
    }

    protected void onCreate(Bundle paramBundle) {
        super.onCreate(paramBundle);
        setContentView(R.layout.activity_color);
        this.listeThing = new ArrayList<LingThing>();
        tableThing();
        this.svtBtn = (ImageView) findViewById(R.id.suivantBtn);
        this.precBtn = (ImageView)findViewById(R.id.precedentBtn);
        this.Imagething = (ImageView)findViewById(R.id.imageThing);
        this.Namething = (TextView)findViewById(R.id.textThing);
        this.sondBtn = (ImageView) findViewById(R.id.sondBtn);
        this.voixBtn = (ImageView) findViewById(R.id.voixBtn);
        this.backBtn = (ImageView) findViewById(R.id.menuBtn);
        fillObjectsWithData();
        this.svtBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View param1View) {
                ColorActivity colorActivity = ColorActivity.this;
                colorActivity.xSign++;
                if (ColorActivity.this.xSign >= ColorActivity.this.listeThing.size())
                    ColorActivity.this.xSign = 0;
                ColorActivity.this.fillObjectsWithData();
            }
        });
        this.precBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View param1View) {
                ColorActivity colorActivity = ColorActivity.this;
                colorActivity.xSign--;
                if (ColorActivity.this.xSign < 0)
                    ColorActivity.this.xSign = ColorActivity.this.listeThing.size() - 1;
                ColorActivity.this.fillObjectsWithData();
            }
        });
        this.sondBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View param1View) { ColorActivity.this.startSong(); }
        });
        this.backBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View param1View) { ColorActivity.this.onBackPressed(); }
        });
        this.audioListener = new AudioManager.OnAudioFocusChangeListener() {
            public void onAudioFocusChange(int param1Int) {
                switch (param1Int) {
                    default:
                        return;
                    case -1:
                        if (ColorActivity.this.media != null)
                            ColorActivity.this.media.pause();
                    case -2:
                        if (ColorActivity.this.media != null)
                            ColorActivity.this.media.pause();
                    case -3:
                        if (ColorActivity.this.media != null)
                            ColorActivity.this.media.setVolume(0.5F, 0.5F);
                        break;
                    case 1:
                        break;
                }
                if (ColorActivity.this.media != null) {
                    ColorActivity.this.media.setVolume(1.0F, 1.0F);
                    ColorActivity.this.media.start();
                    return;
                }
            }
        };
    }

    protected void onPause() {
        super.onPause();
        if (this.media != null) {
            this.media.release();
            this.media = null;
        }
    }
}


