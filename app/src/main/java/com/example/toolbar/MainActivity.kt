package com.example.toolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import coil.load

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView = findViewById<ImageView>(R.id.imageView) //Chamar minha img
        imageView.load("https://magazinefeminina.com.br/wp-content/uploads/2023/03/r2dr-minimalism-iphone-11-wallpaper-ilikewallpaper_com.jpg")//url da imagem que vai aparecer
         {
            crossfade(true) //Fazer transição
            placeholder(R.drawable.ic_launcher_background)//Imagem quando demora um tempo pra aparece
        }

    }
}