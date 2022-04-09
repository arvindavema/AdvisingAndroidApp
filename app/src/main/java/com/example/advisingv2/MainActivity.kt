package com.example.advisingv2
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.advisingv2.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView




class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    
    
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        
        setContentView(view)
        setSupportActionBar(binding.appBarMain.toolbar )
        

        
//        binding.appBarMain.fab.setOnClickListener { view ->
//            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                .setAction("Action", null).show()
//        }
        val navView: NavigationView =binding.navView
        val drawerLayout: DrawerLayout = binding.drawerLayout
        val navController = findNavController(R.id.nav_host_fragment)
        
        
        appBarConfiguration = AppBarConfiguration( setOf(
            R.id.nav_home,
            R.id.inboxFragment,
            R.id.drawer_calendar,
            R.id.drawer_settings,
            R.id.nform ,
            R.id.gpaCalculatorFragment
        ), drawerLayout)
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    
    }
    
    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }
    
}


