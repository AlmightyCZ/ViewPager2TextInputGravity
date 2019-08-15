package cz.almighty.viewpager2gravitytest

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class Adapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> Fragment1()
            1 -> FragmentForm()
            else -> throw UnsupportedOperationException("Invalid position")
        }
    }

    fun getPageTitle(position: Int):String {
        return when (position) {
            0 -> "First"
            1 -> "Form"
            else -> throw UnsupportedOperationException("Invalid position")
        }
    }
}