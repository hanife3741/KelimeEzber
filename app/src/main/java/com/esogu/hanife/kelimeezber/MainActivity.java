package com.esogu.hanife.kelimeezber;


import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;


public class MainActivity extends ActionBarActivity {
static String[] tr;
static String[] en;
    Button ileri;
    Button geri;
    Button yenile;
    Button goster;
    Button ekle;
    TextView sayac;
    TextView kelime;
    int say;
    int diziBoy;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sayac=(TextView)findViewById(R.id.sayac);
        kelime=(TextView)findViewById(R.id.textView);
        ileri=(Button)findViewById(R.id.button2);
        geri=(Button)findViewById(R.id.button);
        yenile=(Button)findViewById(R.id.button5);
        goster=(Button)findViewById(R.id.button3);
        ekle=(Button)findViewById(R.id.button4);

        //say=Integer.parseInt(sayac.getText().toString());
        en=new String[]{"comence","cynic","screen","cencencus","Prove","Accept","Establish","Convince","Validate","Frusration","Enhance","Halt","Uneart","Conduct","Shift","Expire","İmpair","Reign","Forecast","Compherend","İnspire","İplement","İnvestigste","Negotiate","Reside","Suffer","Cease","Undergo","Make use of","Misuse","Accelerate","Resolve","Find out","Fallow","Loan","Concur","Genuiene","Keen","Frustradet","Abrubt","Exploit","Antagonistik","Appeal","Depict","Consent","Appreciation","Comprehension", " Cognition"," Period"," Space"," Step"," Ambiguity","Nutrition"," Dimension","Measurment"," Paradox"," Contradiction"," Obstacle", "Barrier"," Fact"," Force", "Strength","power Credibility", "Dependability","Classification","Exterior","Interior" ,"Latitude","Cover", "Proof."," Evidence","Crack", "Fragment.","Matter ","Subtance.","Curiosity.. ","Pulse+beat" ,"Particle.","Frequency ","Solid "," Liguid","Respiration."," Inhale..","Exhale."," Approach.","Insight","Point of view.."," Intensity ","DensityTool..","Device.. ","Instrument.","Gizmo ","Gadget..","Infastructure..","Substructure.","Superstructure ","Features.","Qualities "," Vessel ","Flow "," Comprehend.."," ","Realize ","Recognize..","Discover ","Trigger.. "," Adapt.. ","Adopt "," Abandon","Leave "," Give up ","Proceed ","Maintain..","Carry on ","Persist "," Influence.","Impact ","Find.. "," Found ","Fund.."," Back up"};
        tr=new String[] {"başlamak","inanmayan","görüntü","uzlaşı","Onaylamak","Kabul etmek","Kurmak","İkna etmek","Gecerli kılmak","Başarısızlık","Artmak","Bırakmak","Gün yuzune cıkarmak","yönetmek","Değiştirmek","Sonlanmak","Zarar Vermek","Yönetmek","Öngörmek","Anlamak","Etkilenmek","Uygulamak","İncelemek","Tartısmak","Yaşamak","Maruz Kalmak","Durdurmak","Maruz kalmak","Kullanmak","harcamak","Hızlanmak","Çözmek","Bulma","Takip Etmek","Borc vermek finanse etmek","Anlaşmak","Gercek","Kararlı","Kızgın","Ani","Sömürmek","Düşmanca","Etkilemek","Tarif etmek","Razı olmak","algi", "anlayis","dusunus","surec","aralik","asama","belirsizlik" ,"beslenme","boyut","ebat","celiski"," anlasmazlik","engel"," engel"," hakikat", "zorlamak","Power", "guvenilirlik" ,"guvenilirlik","siniflandirma","dıs","ic "," yukseklik", "kapak, gizlemek", "kanit","kanit","kirik ","kirik ","madde","altyapi ","merak ","ritim","nabiz-beat "," parca-tanecik", "sıklık ","kati","sivi ","solunum"," nefes almak ","nefes vermek","bakis acisi"," yaklasim "," bakis acisi "," yogunluk" ,"yogunluk"," alet ","malzeme "," arac ","alet "," alet "," altyapi ","altyapi "," ustyapi ","ozellikler "," nitelikler"," tasiyici"," vasita .. -araci "," akmak"," anlamak ","fark etmek", " algilamak "," kesfetmek","sebep olmak","benimsemek-uyum saglamak ","evlat edinmek","terk etmek"," birakmak"," pes etmek "," devam etmek "," devam etmek"," devam etmek "," israt etmek","etki","etki ","bulmak"," bulus "," finanse etmek-Sponsor "," arka cikmak"};
        diziBoy=en.length;

        Random r=new Random();
        say=r.nextInt(diziBoy);
        sayac.setText(Integer.toString(say));
        kelime.setText(en[say]);

        geri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (say > 0) say--;
                else {
                    Toast.makeText(getApplicationContext(), "BİTTİ", Toast.LENGTH_LONG).show();
                    say = 0;
                }
                sayac.setText(Integer.toString(say));
                kelime.setText(en[say]);


            }
        });
        ileri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (say < diziBoy - 1) say++;
                else {
                    Toast.makeText(getApplicationContext(), "BİTTİ", Toast.LENGTH_LONG).show();
                    say = diziBoy - 1;
                }
                sayac.setText(Integer.toString(say));
                kelime.setText(en[say]);


            }
        });
        yenile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r=new Random();
                say=r.nextInt(diziBoy);
                sayac.setText(Integer.toString(say));
                kelime.setText(en[say]);
            }
        });
        goster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),tr[say], Toast.LENGTH_LONG).show();
            }
        });
        ekle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ekle = new Intent(EkleActivity.ACTIVITY_SERVICE);
                // intent.putExtra("isim",name.getText().toString());
                startActivity(ekle);

            }
        });
    }
}
