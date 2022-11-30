package com.example.barze_individual_page

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //the fragment transaction is only created when savedInstanceState is null to ensure that
        //the fragment is only added once, which is when the activity is first created
        if (savedInstanceState == null){

            val bundle = bundleOf("barName" to "cornerstone")
            supportFragmentManager.commit {
                //
                setReorderingAllowed(true)
                add<CstoneFragment>(R.id.FragmentContainer, args = bundle)
            }
        }
        setContentView(R.layout.activity_main)


    }
}