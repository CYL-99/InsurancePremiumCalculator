package com.example.insurancepreminmcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnCalculate.setOnClickListener()
        {
 var totalInsurance= calculateInsurancePremium()
        txtTotalPremium.text  = totalInsurance.toString()
        }
        btnReset.setOnClickListener(){
            spinnerAge.setSelection(0)
            radioGroup.clearCheck()
            txtTotalPremium.text = ""
            chkSmoker.isChecked = false
        }
    }

    fun calculateInsurancePremium(): Double {
        return when(spinnerAge.selectedItemPosition){
      0 -> 60.00
            1 -> 70.00 +
                    (if(radMale.isChecked)50.00 else 0.0)+
                    (if(chkSmoker.isChecked)100.00 else 0.0)
            2-> 90.00 +
                    (if(radMale.isChecked)100.00 else 0.0)+
                    (if(chkSmoker.isChecked)150.00 else 0.0)
            3-> 120.00 +
            (if(radMale.isChecked)150.00 else 0.0)+
                    (if(chkSmoker.isChecked)200.00 else 0.0)
            4-> 150.00 +
            (if(radMale.isChecked)200.00 else 0.0)+
                    (if(chkSmoker.isChecked)250.00 else 0.0)
            else-> 150.00 +
            (if(radMale.isChecked)200.00 else 0.0)+
                    (if(chkSmoker.isChecked)300.00 else 0.0)
    }






    }
}
