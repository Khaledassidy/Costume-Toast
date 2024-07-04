
package com.example.costumetoast;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/*
shofna eno toast mn 5elele l class ta3elo fena no3roud msg lal user 5elel fatra zamnye tawele 2aw asera senyten 2aw 3 sawene
w ba3d heek bte5tfe l msg bteje fatra 3 sawene bten3ered w bte5tfe
exmple:hi khaled
        Toast.makeText(this, "hi khaled", Toast.LENGTH_SHORT).show();

eja alak hay toast le 3mlta btezhar text w b 2ashkel sebte w background sebet ma byet8yar
bekoun l background b color rmede w l text loun aswad fete7 ma bekoun fe ashkel mo3ayane btezhar b shakl wa7ad
b namat wa7ad b kel ashkel toast



bas ba3den eja 2alak bte2dar ta3mel tasmem 5as feek bshkl mo5talef w testa3mlo lal toast ya3ne keef azde?
ya3ne ana momken 2a3mel tasmem 5as fene background m3ayne 8ayer l loun l 5at l size ta3el l 5at momken zeed soura ma3 text b2alb toast ya3ne bsmamem design 5as fene w heeda bekoun tasmem lal toast
bas bekoun mo3mlto mo3mlet toast byezhar senyten 2aw 3 sawene


keef fene 2a3ml hal she?
-2awln na3ml layout 5as fene same costume_toast masln fe b2albo heda tasmem image view  w 7eda textview 3mlt tasmem hala2 5as fe textview w image view textview feha textsize,textcolor....etc
-second bade jeeb tasmem 3ala file java keef kona njeeb tasmem bel costume addapter bel inflater:        View view= LayoutInflater.from(this).inflate(R.layout.costume_toast,null,false)
-third bade jeeb textview mn 2albo masln 3ashen ektob she b2albo w l image view 3ashen bade ektob content b2albo iza ma bade ektob she ma bade 8ayer she ma ba3mel findviewbyid
-forth bade ektob she bel text bade 7ot image view
-fifth ba3mel object mn class toast w ba3teha context taba3e  Toast toast=new Toast(this);
-six fe attribute bel toast class esma toast.setView(bte5od view) b7ot l view ta3ele jowa le 3mlto hay l method btsheekl l veiw l 2ademe le feha bas textview bshakl wa7ad w bt7otlak badelo l view ta3elak
-seventh b2alb toast method fe attribute setduration(in millesecond) bt7ot adesh badak toast l duration ta3elaa 3aref prameter public final static x=4 ya3ne 4second 2aw btest3ml length toast jehez Toast.LENGTH_SHORT
-FINALLY 3ashen tezher toast tbyen mn 7ot toast.show()
-feek 3aehn ta3ml shakl toast curve ta3mel drawble tasmem fe redies w t7et l backbround ta3elo lal linear layout
 */
public class MainActivity extends AppCompatActivity {
    public static final int LENGTH = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //xml to obejct java
        View view= LayoutInflater.from(this).inflate(R.layout.costume_toast,null,false);
        //or View view= getLayoutInflater().inflate(R.layout.costume_toast,null,false);

        //get the view inside the R.layout.costume_toast
        TextView textView=view.findViewById(R.id.textview_toast);
        ImageView imageView=view.findViewById(R.id.image_view_toast);

        //write the content
        textView.setText("hello world from my costume toast");
        imageView.setImageResource(R.drawable.baseline_backup_24);

        //object from toast class
        Toast toast=new Toast(this);

        //set my view inside the toast
        toast.setView(view);


        //set duration of my toast
        toast.setDuration(Toast.LENGTH_LONG);

        //show toast
        toast.show();


    }
}