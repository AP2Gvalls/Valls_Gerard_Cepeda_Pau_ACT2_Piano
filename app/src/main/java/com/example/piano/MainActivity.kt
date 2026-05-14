package com.example.piano

import android.media.AudioAttributes
import android.media.SoundPool
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
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

        botoC2.setOnTouchListener { view, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    botoC2.setImageResource(R.drawable.teclablanca_pressed)
                    soundPool.play(c2, 1f, 1f, 0, 0, 1f)
                }
                MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                    botoC2.setImageResource(R.drawable.tecla_blanca_sin_tileo)
                }
            }
            true
        }
        botoD2.setOnTouchListener { view, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    botoD2.setImageResource(R.drawable.teclablanca_pressed)
                    soundPool.play(d2, 1f, 1f, 0, 0, 1f)
                }
                MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                    botoD2.setImageResource(R.drawable.tecla_blanca_sin_tileo)
                }
            }
            true
        }
        botoE2.setOnTouchListener { view, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    botoE2.setImageResource(R.drawable.teclablanca_pressed)
                    soundPool.play(e2, 1f, 1f, 0, 0, 1f)
                }
                MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                    botoE2.setImageResource(R.drawable.tecla_blanca_sin_tileo)
                }
            }
            true
        }
        botoF2.setOnTouchListener { view, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    botoF2.setImageResource(R.drawable.teclablanca_pressed)
                    soundPool.play(f2, 1f, 1f, 0, 0, 1f)
                }
                MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                    botoF2.setImageResource(R.drawable.tecla_blanca_sin_tileo)
                }
            }
            true
        }
        botoG2.setOnTouchListener { view, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    botoG2.setImageResource(R.drawable.teclablanca_pressed)
                    soundPool.play(g2, 1f, 1f, 0, 0, 1f)
                }
                MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                    botoG2.setImageResource(R.drawable.tecla_blanca_sin_tileo)
                }
            }
            true
        }
        botoA2.setOnTouchListener { view, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    botoA2.setImageResource(R.drawable.teclablanca_pressed)
                    soundPool.play(a2, 1f, 1f, 0, 0, 1f)
                }
                MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                    botoA2.setImageResource(R.drawable.tecla_blanca_sin_tileo)
                }
            }
            true
        }
        botoB2.setOnTouchListener { view, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    botoB2.setImageResource(R.drawable.teclablanca_pressed)
                    soundPool.play(b2, 1f, 1f, 0, 0, 1f)
                }
                MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                    botoB2.setImageResource(R.drawable.tecla_blanca_sin_tileo)
                }
            }
            true
        }

        botoC3.setOnTouchListener { view, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    botoC3.setImageResource(R.drawable.teclablanca_pressed)
                    soundPool.play(c3, 1f, 1f, 0, 0, 1f)
                }
                MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                    botoC3.setImageResource(R.drawable.tecla_blanca_sin_tileo)
                }
            }
            true
        }
        botoD3.setOnTouchListener { view, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    botoD3.setImageResource(R.drawable.teclablanca_pressed)
                    soundPool.play(d3, 1f, 1f, 0, 0, 1f)
                }
                MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                    botoD3.setImageResource(R.drawable.tecla_blanca_sin_tileo)
                }
            }
            true
        }
        botoE3.setOnTouchListener { view, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    botoE3.setImageResource(R.drawable.teclablanca_pressed)
                    soundPool.play(e3, 1f, 1f, 0, 0, 1f)
                }
                MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                    botoE3.setImageResource(R.drawable.tecla_blanca_sin_tileo)
                }
            }
            true
        }
        botoF3.setOnTouchListener { view, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    botoF3.setImageResource(R.drawable.teclablanca_pressed)
                    soundPool.play(f3, 1f, 1f, 0, 0, 1f)
                }
                MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                    botoF3.setImageResource(R.drawable.tecla_blanca_sin_tileo)
                }
            }
            true
        }
        botoG3.setOnTouchListener { view, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    botoG3.setImageResource(R.drawable.teclablanca_pressed)
                    soundPool.play(g3, 1f, 1f, 0, 0, 1f)
                }
                MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                    botoG3.setImageResource(R.drawable.tecla_blanca_sin_tileo)
                }
            }
            true
        }
        botoA3.setOnTouchListener { view, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    botoA3.setImageResource(R.drawable.teclablanca_pressed)
                    soundPool.play(a3, 1f, 1f, 0, 0, 1f)
                }
                MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                    botoA3.setImageResource(R.drawable.tecla_blanca_sin_tileo)
                }
            }
            true
        }
        botoB3.setOnTouchListener { view, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    botoB3.setImageResource(R.drawable.teclablanca_pressed)
                    soundPool.play(b3, 1f, 1f, 0, 0, 1f)
                }
                MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                    botoB3.setImageResource(R.drawable.tecla_blanca_sin_tileo)
                }
            }
            true
        }
        botoC4.setOnTouchListener { view, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    botoC4.setImageResource(R.drawable.teclablanca_pressed)
                    soundPool.play(c4, 1f, 1f, 0, 0, 1f)
                }
                MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                    botoC4.setImageResource(R.drawable.tecla_blanca_sin_tileo)
                }
            }
            true
        }




        //negres
        botoC2b.setOnTouchListener { view, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    botoC2b.setImageResource(R.drawable.teclanegre_pressed)
                    soundPool.play(d2b, 1f, 1f, 0, 0, 1f)
                }
                MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                    botoC2b.setImageResource(R.drawable.tecla_negra_sin_tileo)
                }
            }
            true
        }
        botoD2b.setOnTouchListener { view, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    botoD2b.setImageResource(R.drawable.teclanegre_pressed)
                    soundPool.play(d2b, 1f, 1f, 0, 0, 1f)
                }
                MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                    botoD2b.setImageResource(R.drawable.tecla_negra_sin_tileo)
                }
            }
            true
        }
        botoF2b.setOnTouchListener { view, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    botoF2b.setImageResource(R.drawable.teclanegre_pressed)
                    soundPool.play(f2b, 1f, 1f, 0, 0, 1f)
                }
                MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                    botoF2b.setImageResource(R.drawable.tecla_negra_sin_tileo)
                }
            }
            true
        }
        botoG2b.setOnTouchListener { view, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    botoG2b.setImageResource(R.drawable.teclanegre_pressed)
                    soundPool.play(g2b, 1f, 1f, 0, 0, 1f)
                }
                MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                    botoG2b.setImageResource(R.drawable.tecla_negra_sin_tileo)
                }
            }
            true
        }
        botoA2b.setOnTouchListener { view, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    botoA2b.setImageResource(R.drawable.teclanegre_pressed)
                    soundPool.play(a2b, 1f, 1f, 0, 0, 1f)
                }
                MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                    botoA2b.setImageResource(R.drawable.tecla_negra_sin_tileo)
                }
            }
            true
        }

        botoC3b.setOnTouchListener { view, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    botoC3b.setImageResource(R.drawable.teclanegre_pressed)
                    soundPool.play(c3b, 1f, 1f, 0, 0, 1f)
                }
                MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                    botoC3b.setImageResource(R.drawable.tecla_negra_sin_tileo)
                }
            }
            true
        }
        botoD3b.setOnTouchListener { view, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    botoD3b.setImageResource(R.drawable.teclanegre_pressed)
                    soundPool.play(d3b, 1f, 1f, 0, 0, 1f)
                }
                MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                    botoD3b.setImageResource(R.drawable.tecla_negra_sin_tileo)
                }
            }
            true
        }
        botoF3b.setOnTouchListener { view, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    botoF3b.setImageResource(R.drawable.teclanegre_pressed)
                    soundPool.play(f3, 1f, 1f, 0, 0, 1f)
                }
                MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                    botoF3b.setImageResource(R.drawable.tecla_negra_sin_tileo)
                }
            }
            true
        }
        botoG3b.setOnTouchListener { view, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    botoG3b.setImageResource(R.drawable.teclanegre_pressed)
                    soundPool.play(g3b, 1f, 1f, 0, 0, 1f)
                }
                MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                    botoG3b.setImageResource(R.drawable.tecla_negra_sin_tileo)
                }
            }
            true
        }
        botoA3b.setOnTouchListener { view, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    botoA3b.setImageResource(R.drawable.teclanegre_pressed)
                    soundPool.play(a3b, 1f, 1f, 0, 0, 1f)
                }
                MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                    botoA3b.setImageResource(R.drawable.tecla_negra_sin_tileo)
                }
            }
            true
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        soundPool.release() // Alliberar memòria quan es tanca l'app
    }
}
