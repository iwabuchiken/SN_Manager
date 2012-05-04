package sn.main;

//import id1.admin.Main;
//import id1.admin.R;
//import id1.location.manager.IDsActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

// Activities
import sn.sn1.*;

public class SN_ManagerActivity extends Activity {
	// List of activities
		private Object[] activities = {
				"SN_1_GetLocation",				SN_1_GetLocation.class,
		};//private Object[] activities
		
		@Override
	    public void onCreate(Bundle savedInstanceState) {
			// super
			super.onCreate(savedInstanceState);
			
			// Set the content
			setContentView(R.layout.sn_main);
			
			// Prepare char sequence
	        CharSequence[] list = new CharSequence[activities.length / 2];
	        
	        // Set chars to the list
	        for (int i = 0; i < list.length; i++) {
				list[i] = (String)activities[i * 2];
			}//for (int i = 0; i < list.length; i++)
	        
	        // Define the adapter
	         ArrayAdapter adapter	= new ArrayAdapter(this, android.R.layout.simple_list_item_1, list);
			
	         // Get the list view
	         ListView listView = (ListView) findViewById(R.id.activities_list);
			
	         // Set the adapter to the view
	         listView.setAdapter(adapter);
	         
	         // Set a listener to each list item
	         listView.setOnItemClickListener(new OnItemClickListener(){
	        	public void onItemClick(AdapterView<?> parent, View arg1, int position,
						long id) {
					// TODO 自動生成されたメソッド・スタブ
					// Define the intent
	        		Intent intent	= new Intent(SN_ManagerActivity.this, (Class<?>) activities[position * 2 + 1]);
					
	        		// Start the intent
	        		startActivity(intent);
				}
	        	 
	         });//listView.setOnItemClickListener(new OnItemClickListener()
	         
		}//public void onCreate(Bundle savedInstanceState)
}