package com.example.diceroller

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.Button
import android.widget.ImageView
import com.airbnb.lottie.LottieAnimationView

class MainActivity : AppCompatActivity()
{

    private lateinit var diceImage : ImageView
    private lateinit var animDice : LottieAnimationView
    private lateinit var button : Button
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.btn_roll_dice)
        animDice = findViewById(R.id.anim_view_dice)
        diceImage = findViewById(R.id.iv_dice)

        button.setOnClickListener {
            rollDice()
        }
    }

    private fun updateDiceImage(diceNum : Int)
    {

        when(diceNum)
        {
            1 -> {
                diceImage.setImageResource(R.drawable.dice_1)
            }
            2 -> {
                diceImage.setImageResource(R.drawable.dice_2)
            }
            3 -> {
                diceImage.setImageResource(R.drawable.dice_3)
            }
            4 -> {
                diceImage.setImageResource(R.drawable.dice_4)
            }
            5 -> {
                diceImage.setImageResource(R.drawable.dice_5)
            }
            6 -> {
                diceImage.setImageResource(R.drawable.dice_6)
            }
        }


    }

    private fun rollDice()
    {

        animDice.visibility = View.VISIBLE
        diceImage.visibility = View.GONE
        button.visibility = View.GONE


        animDice.playAnimation()

        Handler(Looper.getMainLooper()).postDelayed({
            animDice.visibility =View.GONE
            diceImage.visibility = View.VISIBLE
            button.visibility = View.VISIBLE

            val diceRange = 1 .. 6

            updateDiceImage(diceRange.random())

        }, 800)

    }

}