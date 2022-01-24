package se.agara.fregments_test

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class ThirdFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Två FragmentContainers inuti FragmentContainer
        //FirstFragment
        //requireActivity är för att öppna fragment från fragment
        requireActivity().supportFragmentManager.beginTransaction().add(R.id.my3rdFragCont1, FirstFragment()).commit()

        //Second fragment, men kodat ltie mer läsligt
        var fragOpener2 = requireActivity().supportFragmentManager.beginTransaction()
        fragOpener2.add(R.id.my3rdFragCont2, SecondFragment())
        fragOpener2.commit()

    }


}