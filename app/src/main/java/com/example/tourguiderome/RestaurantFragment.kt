package com.example.tourguiderome

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import androidx.fragment.app.Fragment

class RestaurantFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val rootView: View = inflater.inflate(R.layout.list, container, false)

        val places = ArrayList<Place>()
        places.add(
                Place(
                        getString(R.string.altroveName),
                        getString(R.string.altoveDescription),
                        getString(R.string.altroveDistrict),
                        getString(R.string.altroveLocation),
                        R.drawable.altrove,
                        getString(R.string.altrovePhone)
                )
        )
        places.add(
                Place(
                        getString(R.string.BarredName),
                        getString(R.string.BarredDescription),
                        getString(R.string.BarredDistrict),
                        getString(R.string.BarredLocation),
                        R.drawable.barred,
                        getString(R.string.BarredPhone)
                )
        )

        places.add(
                Place(
                        getString(R.string.Bistrot64Name),
                        getString(R.string.Bistrot64Description),
                        getString(R.string.Bistrot64District),
                        getString(R.string.Bistrot64Location),
                        R.drawable.bistrot,
                        getString(R.string.Bistrot64Phone)
                )
        )

        places.add(
                Place(
                        getString(R.string.EgoName),
                        getString(R.string.EgoDescription),
                        getString(R.string.EgoDistrict),
                        getString(R.string.EgoLocation),
                        R.drawable.ego,
                        getString(R.string.EgoPhone)
                )
        )

        places.add(
                Place(
                        getString(R.string.EpiroName),
                        getString(R.string.EpiroDescription),
                        getString(R.string.EpiroDistrict),
                        getString(R.string.EpiroLocation),
                        R.drawable.epiro,
                        getString(R.string.EpiroPhone)
                )
        )

        places.add(
                Place(
                        getString(R.string.FernandaName),
                        getString(R.string.FernandaDescription),
                        getString(R.string.FernandaDistrict),
                        getString(R.string.FernandaLocation),
                        R.drawable.fernando,
                        getString(R.string.FernandaPhone)
                )
        )

        val itemsAdapter = PlaceAdapter(context!!, places)
        val listView = rootView.findViewById<ListView>(R.id.list)
        listView.adapter = itemsAdapter
        return rootView
    }
}
