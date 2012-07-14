package com.hart.htmlref;

import android.app.ListActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class main extends ListActivity {
	/** Called when the activity is first created. */
	public String[] paths = null;
	public String[] menus = null;
	public Integer num_chapters = 0;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getListView().setTextFilterEnabled(true);
        
        Resources ress = getResources();
        paths = ress.getStringArray( R.array.file_path);
        menus = ress.getStringArray( R.array.menus);
        num_chapters = paths.length;
        System.out.println("num_chapters =" + Long.toString(num_chapters));
        System.out.println("paths at 0 = " + paths[0] + " menu = " + menus[0]);
        setListAdapter(new ArrayAdapter<String>(this,
                R.layout.list_item, menus));
       
        setTitle(R.string.app_name);  
    }
    
//    static final String[] theMenu = new String[]{
//    	"Read Me!",
//    	"Skill Level 1",
//    	"Skill Level 2",
//    	"Skill Level 3",
//    	"Skill Level 4"
//   };
  
    
    
//    static final String[] paths = new String[]
//    {
//    	"Skill1/001_Preface.html",
//    	"Skill1/subject_area_01/003_181-105-1001.html",
//    	"Skill1/subject_area_01/004_224-176-1425.html",
//    	"Skill1/subject_area_01/005_331-202-1049.html",
//    	"Skill1/subject_area_02/006_081-831-1001.html"
//    };
    
    public static final String web_classer = "webclasser";
    // Create the list
    protected void onListItemClick(ListView l, View v, int position, long id) {
    	super.onListItemClick(l, v, position, id);
    	 int rows = 0;
    	String item = (String)l.getItemAtPosition(position);
    	System.out.println("position" + Long.toString(position)+" = " + item);
    	Intent intent = new Intent();
    	
    	//Assume you have another class that extends Activity called Zerg. 
    	//To make this launch we need to set the intent to that class like this:
    	//intent.setClass(this, Zerg.class);
    	while (rows < num_chapters)
    	{
    		if(item.equals(menus[rows]))
        	{
        		intent.setClass(this, webview.class);
        		intent.putExtra(web_classer, paths[rows]);
        		startActivity(intent);
        		break;
        	}else{
        		rows++;
        	}
    	}
    
    	//Can't do this until we specify a type of intent
//        startActivity(intent);
        
        //Just to show this works, hears a toast message
        Toast.makeText(this, "Picked Item: " + item, Toast.LENGTH_SHORT).show();
        
        
    }
}