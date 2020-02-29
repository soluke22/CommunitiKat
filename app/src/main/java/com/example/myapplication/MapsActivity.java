package com.example.myapplication;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng smithZoo = new LatLng(38.930620, -77.054430);
        LatLng usCapitol = new LatLng(38.886050, -77.005882);
        LatLng dc = new LatLng(38.919260, -77.024150);
        LatLng commServiceCenter = new LatLng(38.912120,-77.037150);
        LatLng centerScreen = new LatLng(38.854410,-77.024150);
        mMap.addMarker(new MarkerOptions().position(usCapitol).title("Capitol Fauna"));
        mMap.addMarker(new MarkerOptions().position(dc).title("Food Drive"));
        mMap.addMarker(new MarkerOptions().position(smithZoo).title("Zoo Cleanup"));
        mMap.addMarker(new MarkerOptions().position(commServiceCenter).title("Toys4Kids"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(centerScreen,12));



    }
}
