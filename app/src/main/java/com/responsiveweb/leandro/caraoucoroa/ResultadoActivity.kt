package com.responsiveweb.leandro.caraoucoroa

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_resultado.*

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val dados: Bundle = intent.extras

        val numero = dados.getInt("numero")

        if(numero == 0){

            img_resultado.setImageResource(R.drawable.moeda_cara)

        }else{
            img_resultado.setImageResource(R.drawable.moeda_coroa)
        }

        btn_voltar.setOnClickListener {

            //val intent = Intent(applicationContext, MainActivity::class.java)
            //startActivity(intent)

            //Finalizar activity para não empilhar
            finish()
        }
    }
}
