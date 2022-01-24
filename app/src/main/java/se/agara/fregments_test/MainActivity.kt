package se.agara.fregments_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        findViewById<Button>(R.id.myMainButton1LOID).setOnClickListener {
            //supportFragmentManager.beginTransaction() är för att öppna fragment från activity
            supportFragmentManager.beginTransaction().replace(R.id.myFragmentContainerViewLOID, FirstFragment()).commit()

        }

        findViewById<Button>(R.id.myMainButton2LOID).setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.myFragmentContainerViewLOID, SecondFragment()).commit()

        }

        findViewById<Button>(R.id.myMainButton3LOID).setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.myFragmentContainerViewLOID, ThirdFragment()).commit()

        }


    }
}