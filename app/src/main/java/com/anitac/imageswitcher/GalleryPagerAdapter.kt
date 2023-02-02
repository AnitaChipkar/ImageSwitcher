package com.anitac.imageswitcher

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.anitac.imageswitcher.databinding.ItemGalleryPagerBinding
import java.util.*

/**
 * @author Anita Chipkar
 * Gallery pager adapter is used to show images in pager view
 * @property mediaList [ERROR : null type]
 * @constructor
 */
class GalleryPagerAdapter(private val mediaList: ArrayList<String>) : PagerAdapter() {


    @SuppressLint("ClickableViewAccessibility")
    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val binding = ItemGalleryPagerBinding.inflate(LayoutInflater.from(container.context))
        container.addView(binding.root)
      /*  Glide.with(container.context)
                .load(mediaList[position])
                .error(R.drawable.user_profile)
                .placeholder(R.drawable.user_profile)
                .into(binding.ivGalleryImage)*/
     //   val imageMatrixTouchHandler = ImageMatrixTouchHandler(container.context)
      //  binding.ivGalleryImage.setOnTouchListener(imageMatrixTouchHandler)
        return binding.root
    }
    override fun getItemPosition(`object`: Any): Int {
        return POSITION_NONE;
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        (container as ViewPager).removeView(`object` as View?)
    }

    override fun isViewFromObject(view: View, anyObject: Any): Boolean {
        return view == anyObject
    }

    override fun getCount(): Int {
        return mediaList.size
    }
}