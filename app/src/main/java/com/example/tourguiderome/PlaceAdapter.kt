package com.example.tourguiderome

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.text.SpannableString
import android.text.style.UnderlineSpan
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isGone
import androidx.core.view.isVisible
import com.bumptech.glide.Glide

class PlaceAdapter(context: Context, places: ArrayList<Place>) :
    ArrayAdapter<Place>(context, 0, places) {


    private var check = true
    private val TAG: String = "PlaceAdapter"
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var listView: View? = convertView
        if (listView == null)
            listView = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)

        val infoView = listView!!.findViewById<View>(R.id.info_view)
        infoView.visibility = View.GONE
        listView.setOnClickListener {
            if (check) {
                infoView?.visibility = View.VISIBLE
                check = false
            } else {
                infoView?.visibility = View.GONE
                check = true
            }

        }
        val currentPlace = getItem(position)

        val nameTV: TextView = listView.findViewById(R.id.place_name)
        nameTV.text = currentPlace!!.Name


        val districtTV: TextView = listView.findViewById(R.id.district)
        districtTV.text = currentPlace.District


        val descriptionTV: TextView = listView.findViewById(R.id.info_text)
        descriptionTV.text = currentPlace.Description


        val imageView: ImageView = listView.findViewById(R.id.image_view)
        Glide.with(listView)
            .load(currentPlace.ImageSrc)
            .into(imageView)


        val locationTV: TextView = listView.findViewById(R.id.location_text)
        val locationString = SpannableString(currentPlace.Location)
        locationString.setSpan(UnderlineSpan(), 0, locationString.length, 0)
        locationTV.text = locationString
        locationTV.setOnClickListener {
            val mapIntent = Intent(Intent.ACTION_VIEW)
            mapIntent.data = Uri.parse("geo:0,0?q=" + currentPlace.Location)

            if (mapIntent.resolveActivity(context.packageManager) != null)
                context.startActivity(mapIntent)
            else
                Log.e(TAG, "Can't resolve app for ACTION_DIAL Intent.")
        }


        val phoneNumberTV: TextView = listView.findViewById(R.id.phone_text)

        val phoneView: View = listView.findViewById(R.id.phone_layout)
        phoneView.visibility = View.VISIBLE
        if (currentPlace.PhoneNumber != null) {
            val phoneSting = SpannableString(currentPlace.PhoneNumber)
            phoneSting.setSpan(UnderlineSpan(), 0, phoneSting.length, 0)
            phoneNumberTV.text = phoneSting
            phoneNumberTV.setOnClickListener {
                val phoneNumber = String.format("tel: %s", currentPlace.PhoneNumber)
                val dialIntent = Intent(Intent.ACTION_DIAL)
                dialIntent.data = Uri.parse(phoneNumber)
                if (dialIntent.resolveActivity(context.packageManager) != null)
                    context.startActivity(dialIntent)
                else
                    Log.e(TAG, "Can't resolve app for ACTION_DIAL Intent.");
            }
        } else {
            phoneView.visibility = View.GONE
        }
        return listView
    }

}


