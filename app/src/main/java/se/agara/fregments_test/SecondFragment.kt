package se.agara.fregments_test

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView


class SecondFragment : Fragment() {


    var randomNumber = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        randomNumber = (0..100).random() // generated random from 0 to 100
        view.findViewById<TextView>(R.id.rndNum1LOIDTV).text = randomNumber.toString()

        // Knappen som öppnar ThirdFragment, med fungerande Back-knapp
        view.findViewById<Button>(R.id.my2ndFragButtonLOID).setOnClickListener {

            var passDataToFourth = FourthFragment()
            passDataToFourth.receiveData = randomNumber
            Log.i("myDebug", "Data passed " + randomNumber.toString())

            var fragOpener = requireActivity().supportFragmentManager.beginTransaction()
            fragOpener.add(R.id.myFragmentContainerViewLOID, passDataToFourth)  // Notera att det inte är fragmentet här, utan variablen
            fragOpener.addToBackStack(null)
            fragOpener.commit()
        }

    }

}