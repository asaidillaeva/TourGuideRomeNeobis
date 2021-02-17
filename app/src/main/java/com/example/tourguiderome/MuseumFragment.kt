package com.example.tourguiderome

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import androidx.fragment.app.Fragment

class MuseumFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView: View = inflater.inflate(R.layout.list, container, false)

        val places = ArrayList<Place>()
        places.add(
            Place(
                getString(R.string.pantheonName),
                getString(R.string.pantheonDescription),
                getString(R.string.pantheonDistrict),
                getString(R.string.pantheonLocation),
                R.drawable.pantheon
            )
        )
        places.add(
            Place(
                getString(R.string.sistineName),
                getString(R.string.sistineDescription),
                getString(R.string.sistineDistinct),
                getString(R.string.sistineLocation),
                R.drawable.chapel
            )
        )

        places.add(
            Place(
                getString(R.string.castelName),
                getString(R.string.castelDescription),
                getString(R.string.castelDistrict),
                getString(R.string.castelLocation),
                R.drawable.angelo
            )
        )

        places.add(
            Place(
                getString(R.string.borgeseName),
                getString(R.string.borgeseDescription),
                getString(R.string.borgeseDistrict),
                getString(R.string.borgeseLocation),
                R.drawable.gallery
            )
        )

        places.add(
            Place(
                getString(R.string.capitoliName),
                getString(R.string.capitoliDescription),
                getString(R.string.capitoliDistrict),
                getString(R.string.capitoliLocation),
                R.drawable.capitoline
            )
        )

        places.add(
            Place(
                getString(R.string.palazzoName),
                getString(R.string.palazzoDescription),
                getString(R.string.palazzoDistrict),
                getString(R.string.palazzoLocation),
                R.drawable.esposizioni
            )
        )

        val itemsAdapter = PlaceAdapter(context!!, places)
        val listView = rootView.findViewById<ListView>(R.id.list)
        listView.adapter = itemsAdapter
        return rootView
    }
}

