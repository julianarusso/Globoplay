package com.example.mystream

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class mystream : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val senhordosaneis = findViewById<ImageView>(R.id.aneis)
        val paratodososgarotos = findViewById<ImageView>(R.id.garotos)
        val donzela = findViewById<ImageView>(R.id.donzela)
        val agentenoturno = findViewById<ImageView>(R.id.noturno)
        val desventuras = findViewById<ImageView>(R.id.desventuras)
        val pll = findViewById<ImageView>(R.id.pll)
        val falls = findViewById<ImageView>(R.id.falls)
        val masha = findViewById<ImageView>(R.id.masha)
        val amigaozao = findViewById<ImageView>(R.id.amigaozao)

        senhordosaneis.setOnClickListener {
            val intent = Intent(this, filmes::class.java).apply {
                putExtra("id_img", R.drawable.tmdb_senhordosaneis)
                putExtra("titulo", "SENHOR DOS ANEIS")
                putExtra(
                    "Enredo",
                    "As origens do comandante militar Napoleão e sua rápida ascensão. Uma visão através do prisma de seu relacionamento e muitas vezes volátil com sua esposa e por ser amor verdadeiro, Josephine."
                )
                startActivity(intent)
            }
            paratodososgarotos.setOnClickListener {
                val intent = Intent(this, filmes::class.java).apply {
                    putExtra("id_img", R.drawable.tmdb_paratodososgarotosquejaamei)
                    putExtra("titulo", "PARA TODOS OS GAROTOS QUE JA AMEI")
                    putExtra(
                        "Enredo",
                        "Lara Jean adora escrever cartas de amor secretas para seus paqueras. Só não contava que um dia elas seriam misteriosamente enviadas!"
                    )
                }

                startActivity(intent)
            }
            donzela.setOnClickListener {
                val intent = Intent(this, filmes::class.java).apply {
                    putExtra("id_img", R.drawable.tmdb_donzela)
                    putExtra("titulo", "DONZELA")
                    putExtra(
                        "Enredo",
                        "O casamento de uma jovem com um príncipe encantado se transforma em uma luta por sobrevivência quando ela é oferecida em sacrifício a um dragão que cospe fogo."
                    )
                }

                startActivity(intent)
            }
            agentenoturno.setOnClickListener {
                val intent = Intent(this, filmes::class.java).apply {
                    putExtra("id_img", R.drawable.tmdb_agentenoturno)
                    putExtra("titulo", "AGENTE NOTURNO")
                    putExtra(
                        "Enredo",
                        "A série acompanha um agente de baixo escalão do FBI que trabalha no porão da Casa Branca, a postos para atender um telefone que nunca toca. Até que um dia, ele recebe uma ligação que acaba revelando uma perigosa conspiração contra o governo dos Estados Unidos."
                    )
                }

                startActivity(intent)
            }
            desventuras.setOnClickListener {
                val intent = Intent(this, filmes::class.java).apply {
                    putExtra("id_img", R.drawable.tmdb_desventurasemserie)
                    putExtra("titulo", "DESVENTURAS EM SERIE")
                    putExtra(
                        "Enredo",
                        "Baseada na coleção campeã de vendas do escritor Lemony Snicket (também conhecido como Daniel Handler), “Desventuras em Série” conta a trágica história dos irmãos Baudelaire – Violet, Klaus e Sunny – órfãos sob a guarda do terrível Conde Olaf, que fará de tudo para colocar as mãos na herança das crianças. Os irmãos precisam constantemente despistar Olaf, frustrar seus planos malignos e investigar a misteriosa morte de seus pais."
                    )
                }

                startActivity(intent)
            }
            pll.setOnClickListener {
                val intent = Intent(this, filmes::class.java).apply {
                    putExtra("id_img", R.drawable.tmdb_plltheperfectionists)
                    putExtra("titulo", "PLL")
                    putExtra(
                        "Enredo",
                        "Quatro amigas se unem contra um inimigo anônimo que ameaça revelar seus segredos mais obscuros, enquanto também investigam o desaparecimento de sua melhor amiga."
                    )
                }

                startActivity(intent)
            }
            falls.setOnClickListener {
                val intent = Intent(this, filmes::class.java).apply {
                    putExtra("id_img", R.drawable.tmdb_gravityfalls)
                    putExtra("titulo", "GRAVITY FALLS")
                    putExtra(
                        "Enredo",
                        "Os gêmeos Dipper e Mabel ficam desapontados ao ter que passar o verão com seu tio-avô, mas a cidade onde ele vive acaba se revelando um lugar estranho e maravilhoso."
                    )
                }

                startActivity(intent)
            }
            masha.setOnClickListener {
                val intent = Intent(this, filmes::class.java).apply {
                    putExtra("id_img", R.drawable.tmdb_marshaeourso)
                    putExtra("titulo", "MASHA E O URSO")
                    putExtra(
                        "Enredo",
                        "A pequena Masha mora perto de uma floresta e vive aventuras incríveis com seu melhor amigo, um urso que trabalhava no circo."
                    )
                }

                startActivity(intent)
            }
            amigaozao.setOnClickListener {
                val intent = Intent(this, filmes::class.java).apply {
                    putExtra("id_img", R.drawable.tmdb_meuamigaozao)
                    putExtra("titulo", "MEU AMIGÃOZÃO")
                    putExtra(
                        "Enredo",
                        "A série acompanha as aventuras na vida do garoto Yuri, de 4 anos de idade, com a ajuda do seu grande companheiro imaginário."
                    )
                }
            }
        }
    }
}
