    package com.example.mintjunk.listviewapp;

    import android.support.v7.app.ActionBarActivity;
    import android.os.Bundle;
    import android.view.Menu;
    import android.view.MenuItem;
    import android.view.View;
    import android.widget.AdapterView;
    import android.widget.ArrayAdapter;
    import android.widget.ListAdapter;
    import android.widget.ListView;
    import android.widget.Toast;


    public class MainActivity extends ActionBarActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            String[] bestfriends={"sujata","sabin","rista","batsal"};
            ListAdapter theAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                    bestfriends);
            ListView theListView =(ListView)findViewById(R.id.theListView);
            theListView.setAdapter(theAdapter);
            theListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                                           @Override
                                                           public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                                                               String friendListPicked= "your best pal is " +
                                                                       String.valueOf(adapterView.getItemIdAtPosition(position));
                                                               Toast.makeText(MainActivity.this, friendListPicked, Toast.LENGTH_SHORT).show() ;
                                                           }
                                                       });


        }


        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.menu_main, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            // Handle action bar item clicks here. The action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as you specify a parent activity in AndroidManifest.xml.
            int id = item.getItemId();

            //noinspection SimplifiableIfStatement
            if (id == R.id.action_settings) {
                return true;
            }

            return super.onOptionsItemSelected(item);
        }
    }
