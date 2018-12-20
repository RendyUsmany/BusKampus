package com.example.cralr.buskampus;

import android.Manifest;
import android.content.pm.PackageManager;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class GoMap extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go_map);
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

        if (ContextCompat.checkSelfPermission(this,Manifest.permission.ACCESS_FINE_LOCATION)==PackageManager.PERMISSION_GRANTED)
        {

            //TODO:Consider calling
            buildGoogleApiClient();
            mMap.setMyLocationEnabled(true);

        }

        // Add a marker in Sydney and move the camera
        LatLng ipb = new LatLng(-6.554105, 106.723476);
        mMap.addMarker(new MarkerOptions().position(ipb).title("Bogor Agricultural University"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ipb));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ipb, 14));

        LatLng GWW = new LatLng(-6.560549, 106.730411);
        mMap.addMarker(new MarkerOptions().position(GWW).title("Halte GWW"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(GWW));

        LatLng BERLIN = new LatLng(-6.558890, 106.730985);
        mMap.addMarker(new MarkerOptions().position(BERLIN).title("Halte Berlin"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(BERLIN));

        LatLng MIPA = new LatLng(-6.557521, 106.731662);
        mMap.addMarker(new MarkerOptions().position(MIPA).title("Halte MIPA"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(MIPA));

        LatLng PUTRI = new LatLng(-6.555853, 106.731480);
        mMap.addMarker(new MarkerOptions().position(PUTRI).title("Halte Asrama Putri"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(PUTRI));

        LatLng TANOTO = new LatLng(-6.555757, 106.730665);
        mMap.addMarker(new MarkerOptions().position(TANOTO).title("Halte Tanoto"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(TANOTO));

        LatLng MENWA = new LatLng(-6.555672, 106.729050);
        mMap.addMarker(new MarkerOptions().position(MENWA).title("Hate MENWA"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(MENWA));

        LatLng FAHUTA = new LatLng(-6.555922, 106.727854);
        mMap.addMarker(new MarkerOptions().position(FAHUTA).title("Halte FAHUTA"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(FAHUTA));

        LatLng ASRAMA = new LatLng(-6.555922, 106.727854);
        mMap.addMarker(new MarkerOptions().position(ASRAMA).title("Halte Asrama Internasional"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ASRAMA));

        LatLng AL_HUR = new LatLng(-6.556503, 106.725740);
        mMap.addMarker(new MarkerOptions().position(AL_HUR).title("Halte MIPA"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(AL_HUR));

        LatLng GOR = new LatLng(-6.556242, 106.724803);
        mMap.addMarker(new MarkerOptions().position(GOR).title("Halte GOR"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(GOR));

        LatLng FPIK = new LatLng(-6.555732, 106.723091);
        mMap.addMarker(new MarkerOptions().position(FPIK).title("Halte FPIK"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(FPIK));

        LatLng FKH = new LatLng(-6.554453, 106.723108);
        mMap.addMarker(new MarkerOptions().position(FKH).title("Halte FKH"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(FKH));

    }

    private void buildGoogleApiClient() {
    }
}
