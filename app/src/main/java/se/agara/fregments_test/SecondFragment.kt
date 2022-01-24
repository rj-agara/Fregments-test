package se.agara.fregments_test

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class SecondFragment : Fragment() {


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

        // Knappen som öppnar ThirdFragment, med fungerande Back-knapp
        view.findViewById<Button>(R.id.my2ndFragButtonLOID).setOnClickListener {
            var fragOpener = requireActivity().supportFragmentManager.beginTransaction()
            fragOpener.add(R.id.myFragmentContainerViewLOID, FourthFragment())
            fragOpener.addToBackStack(null)
            fragOpener.commit()
        }

    }

}