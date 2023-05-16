package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView


class MainActivity : AppCompatActivity() {
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var navigationView: NavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawerLayout = findViewById(R.id.drawer_layout)
        navigationView = findViewById(R.id.navigation_view)

        // Configurar el ActionBarDrawerToggle para abrir y cerrar el menú desplegable
        val toggle = ActionBarDrawerToggle(
            this,
            drawerLayout,
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_close
        )
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        // Manejar eventos de selección de elementos del menú desplegable
        navigationView.setNavigationItemSelectedListener { menuItem ->
            // Acciones basadas en la opción seleccionada del menú
            when (menuItem.itemId) {
                R.id.menu_option1 -> {
                    // Lógica para la opción 1
                    true
                }

                R.id.menu_option2 -> {
                    // Lógica para la opción 2
                    true
                }
                // Agregar más opciones del menú aquí
                else -> false
            }

        }
    }
}