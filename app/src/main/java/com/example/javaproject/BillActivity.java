package com.example.javaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class BillActivity extends AppCompatActivity {
    private double total_bill;
    double regular_amt=RegularActivity.getRegular_amt();
    double deluxe_amt=DeluxeActivity.getDeluxe_amt_amt();
    double suite_amt=SuiteActivity.getSuite_amt();
    double disco_amt=DiscoActivity.getDisco_amt();
    double cricket_amt=CricketActivity.getCricket_amt();
    double football_amt=FootballActivity.getFootball_amt();
    double tennis_amt=TennisActivity.getTennis_amt();
    double basketball_amt=BasketBall.getBasketball_amt();
    double golf_amt=GolfActivity.getGolf_amt();
    double badminton_amt=BadmintonActivity.getBadminton_amt();
    double carom_amt=CaromActivity.getCarom_amt();
    double dirtbiking_amt=DirtBikingActivity.getDirtbiking_amt();
    double horseriding_amt=HorseRidingActivity.getHorseriding_amt();
    double riverrafting_amt=RiverRaftingActivity.getRiverrafting_amt();
    double chess_amt=ChessActivity.getChess_amt();
    double ropeclimbing_amt=RopeClimbingActivity.getRopeclimbing_amt();
    double snooker_amt=SnookerActivity.getSnooker_amt();
    double tt_amt=TableTennisActivity.getTt_amt();
    double trek_amt=trekkingActivity.getTrekking_amt();
    double guhantara_amt=GuhantaraActivity.getGuhantara_amt();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill);
        TextView tv=(TextView)findViewById(R.id.tv_bill1);
        tv.setText("Regular room charges-Rs"+regular_amt);
        if(regular_amt==0)
        {
            tv.setVisibility(View.INVISIBLE);
        }

        TextView tv2=(TextView)findViewById(R.id.tv_bill2);
        tv2.setText("Deluxe room charges-Rs"+deluxe_amt);
        if(deluxe_amt==0)
        {
            tv2.setVisibility(View.INVISIBLE);
        }
        TextView tv3=(TextView)findViewById(R.id.tv_bill3);
        tv3.setText("Suite room charges-Rs"+suite_amt);
        if(suite_amt==0)
        {
            tv3.setVisibility(View.INVISIBLE);
        }
        TextView tv4=(TextView)findViewById(R.id.tv_bill4);
        tv4.setText("Disco charges-Rs"+disco_amt);
        if(disco_amt==0)
        {
            tv4.setVisibility(View.INVISIBLE);
        }
        TextView tv5=(TextView)findViewById(R.id.tv_bill5);
        tv5.setText("Cricket charges-Rs"+cricket_amt);
        if(cricket_amt==0)
        {
            tv5.setVisibility(View.INVISIBLE);
        }
        TextView tv6=(TextView)findViewById(R.id.tv_bill6);
        tv6.setText("Football charges-Rs"+football_amt);
        if(football_amt==0)
        {
            tv6.setVisibility(View.INVISIBLE);
        }
        TextView tv7=(TextView)findViewById(R.id.tv_bill7);
        tv7.setText("Tennis charges-Rs"+tennis_amt);
        if(tennis_amt==0)
        {
            tv7.setVisibility(View.INVISIBLE);
        }
        TextView tv8=(TextView)findViewById(R.id.tv_bill8);
        tv8.setText("BasketBall charges-Rs"+basketball_amt);
        if(basketball_amt==0)
        {
            tv8.setVisibility(View.INVISIBLE);
        }
        TextView tv9=(TextView)findViewById(R.id.tv_bill9);
        tv9.setText("Golf charges-Rs"+golf_amt);
        if(golf_amt==0)
        {
            tv9.setVisibility(View.INVISIBLE);
        }
        TextView tv10=(TextView)findViewById(R.id.tv_bill10);
        tv10.setText("Badminton charges-Rs"+badminton_amt);
        if(badminton_amt==0)
        {
            tv10.setVisibility(View.INVISIBLE);
        }
        TextView tv11=(TextView)findViewById(R.id.tv_bill11);
        tv11.setText("Carom charges-Rs"+carom_amt);
        if(carom_amt==0)
        {
            tv11.setVisibility(View.INVISIBLE);
        }
        TextView tv12=(TextView)findViewById(R.id.tv_bill12);
        tv12.setText("dirt biking charges-Rs"+dirtbiking_amt);
        if(dirtbiking_amt==0)
        {
            tv12.setVisibility(View.INVISIBLE);
        }
        TextView tv13=(TextView)findViewById(R.id.tv_bill13);
        tv13.setText("Horse riding charges-Rs"+horseriding_amt);
        if(horseriding_amt==0)
        {
            tv13.setVisibility(View.INVISIBLE);
        }
        TextView tv14=(TextView)findViewById(R.id.tv_bill14);
        tv14.setText("River raftingcharges-Rs"+riverrafting_amt);
        if(riverrafting_amt==0)
        {
            tv14.setVisibility(View.INVISIBLE);
        }
        TextView tv15=(TextView)findViewById(R.id.tv_bill15);
        tv15.setText("chess charges charges-Rs"+chess_amt);
        if(chess_amt==0)
        {
            tv15.setVisibility(View.INVISIBLE);
        }
        TextView tv16=(TextView)findViewById(R.id.tv_bill16);
        tv16.setText("rope climbing charges-Rs"+ropeclimbing_amt);
        if(ropeclimbing_amt==0)
        {
            tv16.setVisibility(View.INVISIBLE);
        }
        TextView tv17=(TextView)findViewById(R.id.tv_bill17);
        tv17.setText("Snooker charges-Rs"+snooker_amt);
        if(snooker_amt==0)
        {
            tv17.setVisibility(View.INVISIBLE);
        }
        TextView tv18=(TextView)findViewById(R.id.tv_bill18);
        tv18.setText("Table Tennis charges -Rs"+tt_amt);
        if(tt_amt==0)
        {
            tv18.setVisibility(View.INVISIBLE);
        }
        TextView tv19=(TextView)findViewById(R.id.tv_bill19);
        tv19.setText("Trekking charges -Rs"+trek_amt);
        if(trek_amt==0)
        {
            tv19.setVisibility(View.INVISIBLE);
        }
        total_bill=regular_amt+deluxe_amt+suite_amt+snooker_amt+tt_amt+guhantara_amt+chess_amt+badminton_amt+carom_amt+basketball_amt+tennis_amt+golf_amt+cricket_amt+football_amt+dirtbiking_amt+horseriding_amt+ropeclimbing_amt+trek_amt+riverrafting_amt+disco_amt;
        TextView tv20=(TextView)findViewById(R.id.tv_totalbill);
        tv20.setText("Your total bill is -Rs"+total_bill);
        if(total_bill==0)
        {
            tv20.setVisibility(View.INVISIBLE);
        }
        TextView tv21=(TextView)findViewById(R.id.tv_billguhantara);
        tv21.setText("Guhantara Package -Rs"+guhantara_amt);
        if(guhantara_amt==0)
        {
            tv21.setVisibility(View.INVISIBLE);
        }




    }
}
