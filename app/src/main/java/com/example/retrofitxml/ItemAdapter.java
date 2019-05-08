package com.example.retrofitxml;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemAdapter extends ArrayAdapter<Item> {
    public ItemAdapter(ResultActivity context, ArrayList<Item> items) {
        super((Context) context, 0, items);
    }

    @NonNull
    @Override
    public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent) {
        View listItemView =convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext())
                    .inflate(R.layout.list_item, parent, false);
        }


        Item currentItem =getItem(position);
        /*String bank = currentItem.getmBank();
        String bankMnb = "mnb";
        if (bank.equals(bankMnb)){
            TextView bankTextView =(TextView)listItemView.findViewById(R.id.bank);
            bankTextView.setText(bank);

            TextView datumTextView = (TextView)listItemView.findViewById(R.id.datum);
            datumTextView.setText(currentItem.getmDatum());

            TextView penznemTextView = (TextView)listItemView.findViewById(R.id.penznem);
            penznemTextView.setText(currentItem.getmPenznem());

            TextView arfolyamTextView = (TextView)listItemView.findViewById(R.id.arfolyam);
            arfolyamTextView.setText(currentItem.getmKozep());
        }else{
            Toast.makeText(getContext(), "Nincs adat", Toast.LENGTH_SHORT).show();
            listItemView.setVisibility(View.INVISIBLE);
//            TextView bankTextView =(TextView)listItemView.findViewById(R.id.bank);
//            bankTextView.setText("Nincs adat!");
//
//            TextView datumTextView = (TextView)listItemView.findViewById(R.id.datum);
//            datumTextView.setText("Nincs adat!");
//
//            TextView penznemTextView = (TextView)listItemView.findViewById(R.id.penznem);
//            penznemTextView.setText("Nincs adat!");
//
//            TextView arfolyamTextView = (TextView)listItemView.findViewById(R.id.arfolyam);
//            arfolyamTextView.setText("Nincs adat!");
        }*/
            TextView bankTextView =(TextView)listItemView.findViewById(R.id.bank);
            bankTextView.setText(currentItem.getmBank());

            TextView datumTextView = (TextView)listItemView.findViewById(R.id.datum);
            datumTextView.setText(currentItem.getmDatum());

            TextView penznemTextView = (TextView)listItemView.findViewById(R.id.penznem);
            penznemTextView.setText(currentItem.getmPenznem());

            TextView arfolyamTextView = (TextView)listItemView.findViewById(R.id.arfolyam);
            arfolyamTextView.setText(currentItem.getmKozep());

            return listItemView;
    }
}
