package com.seje.mybank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.seje.mybank.ui.SignUp.SignUpActivity;

public class MainActivity extends AppCompatActivity {
    private Button register;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        register=findViewById(R.id.btn_register);


      /* BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigationItemSelectedListener);

       getSupportFragmentManager().beginTransaction().replace(R.id.frag_container,new DashboardFragment()).commit();
*/
    }
   /* private BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            Fragment selectedFragment = null;
            switch (menuItem.getItemId()){
                case R.id.nav_home:
                    selectedFragment = new HomeFragment();
                    break;
                case R.id.nav_dashboard:
                    selectedFragment = new DashboardFragment();
                    break;
                case R.id.nav_fav:
                    selectedFragment = new FavFragment();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.frag_container,
                    selectedFragment).commit();
            return true;
        }
    };
*/
    public void onLogin(View view)
    {
        Intent intent= new Intent(this, SignUpActivity.class);
        startActivity(intent);
        finish();
    }
    public void onOpenRegActivity(View view)
    {
        startActivity(new Intent(this,SignUpActivity.class));
    }
}
