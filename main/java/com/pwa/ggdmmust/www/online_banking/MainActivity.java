package com.pwa.ggdmmust.www.online_banking;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import static com.pwa.ggdmmust.www.online_banking.R.layout.activity_main;

public class MainActivity extends Activity  {
    private static  ListView listView;
    private  static   ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);
        listView = (ListView) findViewById(R.id.listView);
        String[] values = new String[]{
                "KCB ", "EQUITY BANK", "FAMILY BANK", "CHASE BANK", "NATIONAL BANK",
                "BARCLAYS BANK", "COPERATIVE BANK",  "CONSOLIDATED BANK", "CENTRAL BANK","SAMUE OWINO BANK","FRIDAH KANARIO",
                "MARIAM BANK","NEW YORK BANK","BEBER BBANK OF BIBRE","MMUST BANK","HUDUMA BANK","MMMTR BANK"
        };

        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values){
           // @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view =super.getView(position, convertView, parent);

                TextView textView=(TextView) view.findViewById(android.R.id.text1);

                textView.setTextColor(Color.BLUE);
              //
                setOnItemClickListener();




                return view;
            }
        };
        listView.setAdapter(adapter);
        /*SET THE ADAPTER TO LISTVIEW*/
       // setListAdapter(adapter);
        }
    public  void setOnItemClickListener(){
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                int itemPosition = position;
                String itemValue = (String) listView.getItemAtPosition(position);

                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), KcbBank.class);
                    startActivityForResult(myIntent, 0);

                }}


        });

    }


}

