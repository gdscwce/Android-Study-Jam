package com.example.quiz

import android.app.ProgressDialog
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ProgressBar
import android.widget.Toast
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.example.quiz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()
{

    private lateinit var questionList: ArrayList<Question>
    private var currentQuestionNum = 0
    private var score = 0
    var totalQuestion : Int = 0
    private var chosenOption = 0
    private lateinit var currQuestion : Question
    private var shouldMoveToNextQuestion = false

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?)
    {

        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        questionList = ArrayList()

        binding.btnSubmit.setOnClickListener {
            if (shouldMoveToNextQuestion)
                displayNextQuestion()
            else
                submitAnswer()
        }

        binding.tvOption1.setOnClickListener {
            chooseOption(it)
        }

        binding.tvOption2.setOnClickListener {
            chooseOption(it)
        }

        binding.tvOption3.setOnClickListener {
            chooseOption(it)
        }

        binding.tvOption4.setOnClickListener {
            chooseOption(it)
        }

        loadQuestions()

    }

    private fun chooseOption(v: View)
    {

        if (shouldMoveToNextQuestion) return

        if (binding.tvOption1 == v){
            chosenOption = 1
            v.setBackgroundResource(android.R.color.darker_gray)
        }
        else{
            binding.tvOption1.setBackgroundResource(android.R.color.black)
        }

        if (binding.tvOption2 == v){
            chosenOption = 2
            v.setBackgroundResource(android.R.color.darker_gray)
        }
        else{
            binding.tvOption2.setBackgroundResource(android.R.color.black)
        }

        if (binding.tvOption3 == v){
            chosenOption = 3
            v.setBackgroundResource(android.R.color.darker_gray)
        }
        else{
            binding.tvOption3.setBackgroundResource(android.R.color.black)
        }

        if (binding.tvOption4 == v){
            chosenOption = 4
            v.setBackgroundResource(android.R.color.darker_gray)
        }
        else{
            binding.tvOption4.setBackgroundResource(android.R.color.black)
        }
    }

    private fun submitAnswer()
    {
        if (chosenOption == 0){
            Toast.makeText(this, "Please select an answer", Toast.LENGTH_SHORT).show()
            return
        }

        if (currQuestion.correctOption == 1){
            binding.tvOption1.setBackgroundResource(android.R.color.holo_green_dark)
        } else if (chosenOption == 1){
            binding.tvOption1.setBackgroundResource(android.R.color.holo_red_dark)
        }

        if (currQuestion.correctOption == 2){
            binding.tvOption2.setBackgroundResource(android.R.color.holo_green_dark)
        } else if (chosenOption == 2){
            binding.tvOption2.setBackgroundResource(android.R.color.holo_red_dark)
        }

        if (currQuestion.correctOption == 3){
            binding.tvOption3.setBackgroundResource(android.R.color.holo_green_dark)
        } else if (chosenOption == 3){
            binding.tvOption3.setBackgroundResource(android.R.color.holo_red_dark)
        }

        if (currQuestion.correctOption == 4){
            binding.tvOption1.setBackgroundResource(android.R.color.holo_green_dark)
        } else if (chosenOption == 4){
            binding.tvOption4.setBackgroundResource(android.R.color.holo_red_dark)
        }

        if (chosenOption == currQuestion.correctOption) score++

        currentQuestionNum++

        shouldMoveToNextQuestion = true
        binding.btnSubmit.text = "NEXT QUESTION"

    }

     private fun displayNextQuestion()
    {

        chosenOption = 0
        binding.tvOption1.setBackgroundResource(android.R.color.black)
        binding.tvOption2.setBackgroundResource(android.R.color.black)
        binding.tvOption3.setBackgroundResource(android.R.color.black)
        binding.tvOption4.setBackgroundResource(android.R.color.black)

        if (currentQuestionNum < totalQuestion){
            currQuestion = questionList[currentQuestionNum]
            binding.tvQuestion.text = currQuestion.question
            binding.tvOption1.text = currQuestion.option1
            binding.tvOption2.text = currQuestion.option2
            binding.tvOption3.text = currQuestion.option3
            binding.tvOption4.text = currQuestion.option4

            shouldMoveToNextQuestion = false
            binding.btnSubmit.text = "SUBMIT"

        } else{

            val intent = Intent(this, ResultActivity::class.java)

            intent.putExtra("Score", score)

            startActivity(intent)
            this.finish()

            Toast.makeText(this, "Quiz Finished", Toast.LENGTH_SHORT).show()
        }
    }



    private fun loadQuestions()
    {

        val queue = Volley.newRequestQueue(this)

        val jsonObj = JsonObjectRequest("https://opentdb.com/api.php?amount=10&category=18&type=multiple", {

            Log.e("API CALL", it.toString())
            val queArr = it.getJSONArray("results")

            for (i in 0 until queArr.length()){
                val que = queArr.getJSONObject(i)

                val options = que.getJSONArray("incorrect_answers")
                val optionsArr = mutableListOf<String>()

                for (j in 0 until options.length()){
                    optionsArr.add(options.getString(j))
                }

                val correctAns = que.getString("correct_answer")

                optionsArr.add(correctAns)

                optionsArr.shuffle()

                var correctOption = 0

                for (k in 0 until optionsArr.size){
                    if (optionsArr[k] == correctAns) correctOption = k+1
                }

                val q = Question(que.getString("question"), optionsArr[0], optionsArr[1], optionsArr[2], optionsArr[3], correctOption)

                questionList.add(q)

            }

            totalQuestion = questionList.size

            displayNextQuestion()

        }, {
            it.printStackTrace()
        })

        queue.add(jsonObj)
    }

}