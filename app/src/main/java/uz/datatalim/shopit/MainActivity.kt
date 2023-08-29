package uz.datatalim.shopit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()

    }

    private fun initView() {

        val navHost=supportFragmentManager.findFragmentById(R.id.frFragment) as NavHostFragment
        val navController=navHost.navController
        val bnvBottomNav:BottomNavigationView=findViewById(R.id.bnvBottomNav)
        bnvBottomNav.setupWithNavController(navController)

    }
}