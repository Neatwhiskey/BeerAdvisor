package com.neatwhiskey.beeradvisor;

import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import java.util.List;

public class FindBeerActivity extends AppCompatActivity {
    private BeerExpert Expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    public void onClickFindBeer(View view) {
        TextView brands = (TextView) findViewById(R.id.brands);
        Spinner color = (Spinner) findViewById(R.id.color);
       String beerType = String.valueOf(color.getSelectedItem());
       List<String> brandsList = Expert.getBrands(beerType);
       StringBuilder brandsFormatted = new StringBuilder();
       for(String brand:brandsList){
           brandsFormatted.append(brand).append('\n');
       }
       brands.setText(brandsFormatted);

    }
}