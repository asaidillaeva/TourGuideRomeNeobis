package com.example.tourguiderome

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import androidx.fragment.app.Fragment

class ParkFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView: View = inflater.inflate(R.layout.list, container, false)

        val places = ArrayList<Place>()
        places.add(
            Place(
                getString(R.string.VillaName),
                getString(R.string.VillaDescription),
                getString(R.string.VillaDictrict),
                getString(R.string.VillaLocation),
                R.drawable.pamphilli)
        )
        places.add(
            Place(
                getString(R.string.BotanicName),
                getString(R.string.BotanicDescription),
                getString(R.string.BotanicDistrict),
                getString(R.string.BotanicLocation),
                R.drawable.botanic)
        )

        places.add(
            Place(
                getString(R.string.VaticanName),
                getString(R.string.VaticanDescription),
                getString(R.string.VaticanDistrict),
                getString(R.string.VaticanLocation),
                R.drawable.vatican
            )
        )

        places.add(
            Place(
                getString(R.string.akvedukName),
                getString(R.string.akvedukDescription),
                getString(R.string.akvedukDistrict),
                getString(R.string.akvedukLocation),
                R.drawable.akveduk)
        )

        places.add(
            Place(
                getString(R.string.orabgeName),
                getString(R.string.orangeDescription),
                getString(R.string.orangeDistrict),
                getString(R.string.orangeLocation),
                R.drawable.orange)
        )

        places.add(
            Place(
                getString(R.string.AppianName),
                getString(R.string.AppianDescription),
                getString(R.string.AppianDistrict),
                getString(R.string.AppianLocation),
                R.drawable.appian
            )
        )
        val itemsAdapter = PlaceAdapter(context!!, places)
        val listView = rootView.findViewById<ListView>(R.id.list)
        listView.adapter = itemsAdapter
        return rootView
    }
}
