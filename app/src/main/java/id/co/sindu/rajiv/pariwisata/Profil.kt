package id.co.sindu.rajiv.pariwisata

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions


class Profil : AppCompatActivity()  {

    lateinit var mapFragment: SupportMapFragment
    lateinit var googleMap: GoogleMap


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_profil)

        mapFragment = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync({
            googleMap = it
            googleMap.isMyLocationEnabled = true

            val location1 = LatLng(-7.195121, 110.37352)
            googleMap.addMarker(MarkerOptions().position(location1).title("Umbul Sidomukti"))
            googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(location1,8f))

            val location2 = LatLng(-7.198672, 109.164367)
            googleMap.addMarker(MarkerOptions().position(location2).title("Air Panas Guci"))

            val location3 = LatLng(-7.607770, 110.203746)
            googleMap.addMarker(MarkerOptions().position(location3).title("Candi Borobudur"))

            val location4 = LatLng(-7.216623, 109.914710)
            googleMap.addMarker(MarkerOptions().position(location4).title("Dieng"))

            val location5 = LatLng(-7.208093, 110.341688)
            googleMap.addMarker(MarkerOptions().position(location5).title("Candi Gedong 9"))

            val location6 = LatLng(-5.849261, 110.439875)
            googleMap.addMarker(MarkerOptions().position(location6).title("Karimunjawa"))

            val location7 = LatLng(-7.313262, 109.229047)
            googleMap.addMarker(MarkerOptions().position(location7).title("Kawasan Wisata Baturaden"))

            val location8 = LatLng(-7.494568, 110.381296)
            googleMap.addMarker(MarkerOptions().position(location8).title("Ketep Pass"))

            val location9 = LatLng(-7.485099, 110.209246)
            googleMap.addMarker(MarkerOptions().position(location9).title("Kyai Langgeng"))

            val location10 = LatLng(-8.210487, 110.903488)
            googleMap.addMarker(MarkerOptions().position(location10).title("Pantai Nampu"))

            val location11 = LatLng(-6.588946, 110.646111)
            googleMap.addMarker(MarkerOptions().position(location11).title("Pantai Kartini"))

            val location12 = LatLng(-6.577809, 110.630313)
            googleMap.addMarker(MarkerOptions().position(location12).title("Pulau Panjang"))

            val location13 = LatLng(-7.609628, 110.173445)
            googleMap.addMarker(MarkerOptions().position(location13).title("Punthuk Setumbu"))

            val location14 = LatLng(-7.283275, 110.433333)
            googleMap.addMarker(MarkerOptions().position(location14).title("Rawa Pening"))

            val location15 = LatLng(-7.605618, 110.180543)
            googleMap.addMarker(MarkerOptions().position(location15).title("Bukit Rhema Gereja Ayam"))

            val location16 = LatLng(-7.613794, 110.635861)
            googleMap.addMarker(MarkerOptions().position(location16).title("Umbul Ponggok"))

            val location17 = LatLng(-7.905386, 110.892296)
            googleMap.addMarker(MarkerOptions().position(location17).title("Waduk Gajah Mungkur"))


        })
    }
}
