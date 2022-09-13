package com.example.ksample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview = findViewById(R.id.listview);

        try {
            JSONObject obj=new JSONObject(LoadJson());

            JSONObject vald =obj.getJSONObject("data");

            JSONArray array = vald.getJSONArray("Project_Management_Process_project_creation");
           // JSONArray ni = array.getJSONArray(("allocation_projects").length());
            HashMap<String,String> list;
          //  HashMap<String,String> lit = null;
            ArrayList<HashMap<String,String>> arrayList=new ArrayList<>();

            for( int i=0;i<array.length();i++){

                /*for(int l=0;l<ni.length();l++){
                    JSONObject r =ni.getJSONObject(l);
                    String plann =r.getString("planned_hrs");

                    lit.put("plan",plann);
                    arrayList.add(lit);
                }*/

                JSONObject o=array.getJSONObject(i);
                String formule_v=o.getString("project_code");
                String cdate =o.getString("create_date");
                String ddate =o.getString("delivery_date");
                String phrs =o.getString("planned_hrs");

                String status =o.getString("status");
                String url=o.getString("project_name");
                list=new HashMap<>();
                list.put("formule",formule_v);
                list.put("cdate",cdate);
                list.put("ddate",ddate);
                list.put("phrs",phrs);

                list.put("status",status);
                list.put("url",url);
                arrayList.add(list);
            }

            ListAdapter adapter=new SimpleAdapter(this,arrayList,R.layout.list_viewdegn,new String[]{"formule","cdate","ddate","phrs","status","url","plan"},new int[]{R.id.formule,R.id.cdate,R.id.ddate,R.id.phrs,R.id.status,R.id.url,R.id.plan});
            listview.setAdapter(adapter);
        }catch (JSONException e){
            e.printStackTrace();

        }

/*
 try{
            JSONObject obj=new JSONObject(LoadJsonFromAsset());
            JSONArray array=obj.getJSONArray("formules");
            HashMap<String,String> list;
            ArrayList<HashMap<String,String>> arrayList=new ArrayList<>();
            for( int i=0;i<array.length();i++){
                JSONObject o=array.getJSONObject(i);
                String formule_v=o.getString("formule");
                String url=o.getString("url");
                list=new HashMap<>();
                list.put("formule",formule_v);
                list.put("url",url);
                arrayList.add(list);
            }

            ListAdapter adapter=new SimpleAdapter(this,arrayList,R.layout.list_viewdegn,new String[]{"formule","url"},new int[]{R.id.formule,R.id.url});
            listview.setAdapter(adapter);
        }catch (JSONException e){
            e.printStackTrace();
        }

    }
    public String LoadJsonFromAsset(){
        String json=null;
        try{
            InputStream in=this.getAssets().open("MyNewFile.json");
            int size=in.available();
            byte[] bbuffer=new byte[size];
            in.read(bbuffer);
            in.close();
            json=new String(bbuffer,"UTF-8");

        }catch (IOException e){
            e.printStackTrace();
            return null;
        }
        return json;
    }
}
 */

    }
    public String LoadJson(){
        String json = null;
        try {
            InputStream io =this.getAssets().open("Model.json");
            int size = io.available();
            byte[] buffer = new byte[size];
            io.read(buffer);
            io.close();
            json = new String(buffer, "UTF-8");


        }catch (IOException e){
            e.printStackTrace();
            return null;
        }
        return json;
    }
}
