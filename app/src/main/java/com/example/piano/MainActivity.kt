package com.example.piano

import android.media.AudioAttributes
import android.media.SoundPool
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {

    private lateinit var soundPool: SoundPool
    //blanques
    private var c2 = 0
    private var d2 = 0
    private var e2 = 0
    private var f2 = 0
    private var g2 = 0
    private var a2 = 0
    private var b2 = 0
    private var c3 = 0
    private var d3 = 0
    private var e3 = 0
    private var f3 = 0
    private var g3 = 0
    private var a3 = 0
    private var b3 = 0
    private var c4 = 0

    //negres
    private var c2b = 0
    private var d2b = 0
    private var f2b = 0
    private var g2b = 0
    private var a2b = 0

    private var c3b = 0
    private var d3b = 0
    private var e3b = 0
    private var f3b = 0
    private var g3b = 0
    private var a3b = 0
    private var b3b = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Crear SoundPool
        soundPool = SoundPool.Builder()
            .setMaxStreams(25)
            .setAudioAttributes(
                AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_GAME)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .build()
            )
            .build()

        //blanques
        c2 = soundPool.load(this, R.raw.c2_tecla, 1)
        d2 = soundPool.load(this, R.raw.d2_tecla, 1)
        e2 = soundPool.load(this, R.raw.e2_tecla, 1)
        f2 = soundPool.load(this, R.raw.f2_tecla, 1)
        g2 = soundPool.load(this, R.raw.g2_fecla, 1)
        a2 = soundPool.load(this, R.raw.a2_tecla, 1)
        b2 = soundPool.load(this, R.raw.b2_tecla, 1)

        c3 = soundPool.load(this, R.raw.c3, 1)
        d3 = soundPool.load(this, R.raw.d3_tecla, 1)
        e3 = soundPool.load(this, R.raw.e3, 1)
        f3 = soundPool.load(this, R.raw.f3, 1)
        g3 = soundPool.load(this, R.raw.g3, 1)
        a3 = soundPool.load(this, R.raw.a3_tecla, 1)
        b3 = soundPool.load(this, R.raw.b3_tecla, 1)

        c4 = soundPool.load(this, R.raw.c4_tecla, 1)

        //negres
        c2b = soundPool.load(this, R.raw.c2b, 1)
        d2b = soundPool.load(this, R.raw.d2d, 1)
        f2b = soundPool.load(this, R.raw.f2b, 1)
        g2b = soundPool.load(this, R.raw.g2b, 1)
        a2b = soundPool.load(this, R.raw.a2b, 1)

        c3b = soundPool.load(this, R.raw.c3d, 1)
        d3b = soundPool.load(this, R.raw.d3b, 1)
        f3b = soundPool.load(this, R.raw.f3b, 1)
        g3b = soundPool.load(this, R.raw.g3b, 1)
        a3b = soundPool.load(this, R.raw.a3b, 1)

        // Botons blancs
        val botoC2 = findViewById<ImageButton>(R.id.C2)
        val botoD2 = findViewById<ImageButton>(R.id.D2)
        val botoE2 = findViewById<ImageButton>(R.id.E2)
        val botoF2 = findViewById<ImageButton>(R.id.F2)
        val botoG2 = findViewById<ImageButton>(R.id.G2)
        val botoA2 = findViewById<ImageButton>(R.id.A2)
        val botoB2 = findViewById<ImageButton>(R.id.B2)
        val botoC3 = findViewById<ImageButton>(R.id.C3)
        val botoD3 = findViewById<ImageButton>(R.id.D3)
        val botoE3 = findViewById<ImageButton>(R.id.E3)
        val botoF3 = findViewById<ImageButton>(R.id.F3)
        val botoG3 = findViewById<ImageButton>(R.id.G3)
        val botoA3 = findViewById<ImageButton>(R.id.A3)
        val botoB3 = findViewById<ImageButton>(R.id.B3)
        val botoC4 = findViewById<ImageButton>(R.id.C4)
        //negres
        val botoC2b = findViewById<ImageButton>(R.id.C2b)
        val botoD2b = findViewById<ImageButton>(R.id.D2b)
        val botoF2b = findViewById<ImageButton>(R.id.F2b)
        val botoG2b = findViewById<ImageButton>(R.id.G2b)
        val botoA2b = findViewById<ImageButton>(R.id.A2b)
        val botoC3b = findViewById<ImageButton>(R.id.C3b)
        val botoD3b = findViewById<ImageButton>(R.id.D3b)
        val botoF3b = findViewById<ImageButton>(R.id.F3b)
        val botoG3b = findViewById<ImageButton>(R.id.G3b)
        val botoA3b = findViewById<ImageButton>(R.id.A3b)

        //tecles blanques
        botoC2.setOnClickListener {
            soundPool.play(c2, 1f, 1f, 0, 0, 1f)
        }
        botoD2.setOnClickListener {
            soundPool.play(d2, 1f, 1f, 0, 0, 1f)
        }
        botoE2.setOnClickListener {
            soundPool.play(e2, 1f, 1f, 0, 0, 1f)
        }
        botoF2.setOnClickListener {
            soundPool.play(f2, 1f, 1f, 0, 0, 1f)
        }
        botoG2.setOnClickListener {
            soundPool.play(g2, 1f, 1f, 0, 0, 1f)
        }
        botoA2.setOnClickListener {
            soundPool.play(a2, 1f, 1f, 0, 0, 1f)
        }
        botoB2.setOnClickListener {
            soundPool.play(b2, 1f, 1f, 0, 0, 1f)
        }

        botoC3.setOnClickListener {
            soundPool.play(c3, 1f, 1f, 0, 0, 1f)
        }
        botoD3.setOnClickListener {
            soundPool.play(d3, 1f, 1f, 0, 0, 1f)
        }
        botoE3.setOnClickListener {
            soundPool.play(e3, 1f, 1f, 0, 0, 1f)
        }
        botoF3.setOnClickListener {
            soundPool.play(f3, 1f, 1f, 0, 0, 1f)
        }
        botoG3.setOnClickListener {
            soundPool.play(g3, 1f, 1f, 0, 0, 1f)
        }
        botoA3.setOnClickListener {
            soundPool.play(a3, 1f, 1f, 0, 0, 1f)
        }
        botoB3.setOnClickListener {
            soundPool.play(b3, 1f, 1f, 0, 0, 1f)
        }
        botoC4.setOnClickListener {
            soundPool.play(c4, 1f, 1f, 0, 0, 1f)
        }

        //negres
        botoC2b.setOnClickListener {
            soundPool.play(c2b, 1f, 1f, 0, 0, 1f)
        }
        botoD2b.setOnClickListener {
            soundPool.play(d2b, 1f, 1f, 0, 0, 1f)
        }
        botoF2b.setOnClickListener {
            soundPool.play(f2b, 1f, 1f, 0, 0, 1f)
        }
        botoG2b.setOnClickListener {
            soundPool.play(g2b, 1f, 1f, 0, 0, 1f)
        }
        botoA2b.setOnClickListener {
            soundPool.play(a2b, 1f, 1f, 0, 0, 1f)
        }

        botoC3b.setOnClickListener {
            soundPool.play(c3b, 1f, 1f, 0, 0, 1f)
        }
        botoD3b.setOnClickListener {
            soundPool.play(d3b, 1f, 1f, 0, 0, 1f)
        }
        botoF3b.setOnClickListener {
            soundPool.play(f3b, 1f, 1f, 0, 0, 1f)
        }
        botoG3b.setOnClickListener {
            soundPool.play(g3b, 1f, 1f, 0, 0, 1f)
        }
        botoA3b.setOnClickListener {
            soundPool.play(a3b, 1f, 1f, 0, 0, 1f)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        soundPool.release() // Alliberar memòria quan es tanca l'app
    }
}
