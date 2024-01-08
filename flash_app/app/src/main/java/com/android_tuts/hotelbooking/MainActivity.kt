package com.android_tuts.hotelbooking
import  android.os.Bundle
import  androidx.appcompat.app.AppCompatActivity
import com.android_tuts.hotelbooking.databinding.ActivityMainBinding

//import androidx.fragment.app.Fragment
//import androidx.fragment.app.FragmentManager
//import androidx.fragment.app.FragmentPagerAdapter

class MainActivity :  AppCompatActivity() {
//    private lateinit var binding : ActivityMainBinding
    override fun  onCreate(savedInstanceState : Bundle?){
            super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)
//                binding = ActivityMainBinding.inflate(in)
    }

/*
   class AuthenticationPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
        private val fragmentList = ArrayList<Fragment>()

        override fun getItem(position: Int): Fragment {
            return fragmentList[position]
        }

        override fun getCount(): Int {
            return fragmentList.size
        }

        fun addFragment(fragment: Fragment) {
            fragmentList.add(fragment)
        }
    }
    */

}


