package com.degtyar.sergey.selfwork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<PersonInfo> data = new ArrayList<PersonInfo>();
    private RecyclerView recyclerView;
    private PersonAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        if(recyclerView == null) return;
        //Если нет динамических элементов меняющих размер
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));

        fillData();
    }

    private void fillData() {
        //to do

        data.add(new PersonInfo("https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcTdqoyViKQTV5zsFPNs8oety5SKUTdQ81yrRl01nbuaag2Wa_Aa","aaa","sss@sss"));
        data.add(new PersonInfo("https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcSFBi6nBSbd17yf8KHnNKrOMEeyHBpIPP-oNvceZiVfbo1OdoHOBQ","bbb","sss@sss"));
        data.add(new PersonInfo("https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcTPkkqB787cSKOxH0O-wLH7ZutXyiwCHHKq0BiOwBL8iTvil9hK","ccc","sss@sss"));
        data.add(new PersonInfo("https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcRU3qv0vMx_rvzem1uOzql33UiWPEZy2FUd-r8zOBcAzJmni_BX","ddd","sss@sss"));
        data.add(new PersonInfo("https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcSVIi-wZNBdVMtYJRjKPP0T7t_gtq0KhmLunQONwilHKTs400Q6Vw","eee","sss@sss"));
    }
    private RecyclerViewCallback callback = new RecyclerViewCallback() {
        @Override
        public void onClick(int position) {

        }

        @Override
        public void onLongClick(int position) {
            data.remove(position);
        }
    };
}
