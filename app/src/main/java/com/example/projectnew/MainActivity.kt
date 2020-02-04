package com.example.projectnew

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.RenderProcessGoneDetail
import android.widget.Toast

import androidx.databinding.DataBindingUtil
import com.example.projectnew.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var LogiN: Login = Login()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.logins=LogiN

        binding.enter.setOnClickListener {
            enterit(it)
        }
    }

    private fun enterit(it: View?) {
        binding.apply {
//Main Page
            binding.email.visibility = View.GONE
            binding.password.visibility = View.GONE
            binding.enter.visibility = View.GONE
            binding.main.visibility = View.GONE
            binding.ee.visibility = View.GONE
            binding.pass.visibility = View.GONE

            //TestPage
             binding.sub.visibility=View.VISIBLE
            binding.eec.visibility = View.VISIBLE
            binding.passc.visibility = View.VISIBLE
            binding.emailcon.visibility = View.VISIBLE
            binding.passcon.visibility = View.VISIBLE
            binding.login.visibility = View.VISIBLE
            binding.login.setOnClickListener {

                if (logins?.emailcon == logins?.email && logins?.passcon == logins?.password)
                    Toast.makeText(applicationContext, "Success", Toast.LENGTH_SHORT).show()
                else
                    Toast.makeText(applicationContext, "Failed", Toast.LENGTH_SHORT).show()
                returnback()



            }
        }
    }

    private fun returnback() {
        binding.email.visibility = View.VISIBLE
        binding.password.visibility = View.VISIBLE
        binding.enter.visibility = View.VISIBLE
        binding.ee.visibility = View.VISIBLE
        binding.pass.visibility = View.VISIBLE

        binding.sub.visibility=View.GONE
        binding.eec.visibility = View.GONE
        binding.passc.visibility = View.GONE
        binding.emailcon.visibility = View.GONE
        binding.passcon.visibility = View.GONE
        binding.login.visibility = View.GONE


    }
}
