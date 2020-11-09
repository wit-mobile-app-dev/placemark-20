package org.wit.placemark.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.GoogleMap
import org.wit.placemark.R

import kotlinx.android.synthetic.main.activity_placemark_maps.*


class PlacemarkMapsActivity : AppCompatActivity() {

  lateinit var map: GoogleMap

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_placemark_maps)
    toolbar.title = title
    setSupportActionBar(toolbar)
    mapView.onCreate(savedInstanceState);
  }
}