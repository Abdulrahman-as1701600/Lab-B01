package cmps312.lab.beneficiaryreivewlab.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import cmps312.lab.beneficiaryreivewlab.R
import cmps312.lab.beneficiaryreivewlab.ui.adapter.BeneficiaryAdapter
import kotlinx.android.synthetic.main.fragment_beneficiary_list.*


class BeneficiaryListFragment : Fragment(R.layout.fragment_beneficiary_list) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val beneficiaryAdapter = BeneficiaryAdapter()
        beneficiaryRV.apply {
            adapter = beneficiaryAdapter
            layoutManager = LinearLayoutManager(context)
        }
<<<<<<< HEAD

        beneficiaryViewModel.beneficiaries.observe(viewLifecycleOwner){
            beneficiaryAdapter.beneficiaries = it
        }
    }

    fun deleteBeneficiaryListener(beneficiary: Beneficiary){
        beneficiaryViewModel.deleteBeneficiary(beneficiary)
=======
>>>>>>> parent of 9538342... update 5:44 upto delete
    }
}