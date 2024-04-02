package com.example.mystream

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class filmes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes)
        setSupportActionBar(findViewById(R.id.toolbar2))
        val img = findViewById<ImageView>(R.id.imgfilme)
        val titulo = findViewById<TextView>(R.id.titulo)
        val enredo = findViewById<TextView>(R.id.enredo)
        val idimg = intent.getIntExtra("id_img", 0)
        val idtitulo = intent.getStringExtra("titulo")
        val idenredo = intent.getStringExtra("Enredo" )
        img.setImageResource(idimg)
        titulo.setText(idtitulo)
        enredo.setText(idenredo)

    }
}