package com.example.amma.travel_guide;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class GMapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gmaps);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        float zoomLevel = 16.0f; //This goes up to 21

        // Add a marker in KOCHI and move the camera
        LatLng kochi = new LatLng(9.960622, 76.2359853);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(kochi,zoomLevel));
       // mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(kochi,30));
        //  mMap.getUiSettings().setZoomControlsEnabled(true);

        //mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);

        mMap.addMarker(new MarkerOptions().position(kochi).title("Marker in kochi"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kochi));


        // Add a marker in trivandrum and move the camera
        LatLng trv = new LatLng(8.4874235, 76.9510277);

        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(trv,30));
        mMap.getUiSettings().setZoomControlsEnabled(true);

        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);

        mMap.addMarker(new MarkerOptions().position(trv).title("Marker in trivandrum"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(trv));
        // Add a marker in PALAKKAD and move the camera
        LatLng pal = new LatLng(10.7637057, 76.6549328);

        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(pal,30));
        mMap.getUiSettings().setZoomControlsEnabled(true);

        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);

        mMap.addMarker(new MarkerOptions().position(pal).title("Marker in palakkad"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pal));

        // Add a marker in thrissur and move the camera
        LatLng thr = new LatLng(10.2849458, 76.5672554);

        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(thr,30));
        mMap.getUiSettings().setZoomControlsEnabled(true);

        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);

        mMap.addMarker(new MarkerOptions().position(thr).title("Marker in athirapply"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(thr));

        // Add a marker in thekkady and move the camera
        LatLng the = new LatLng(9.6093965, 77.1429912);

        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(the,30));
        mMap.getUiSettings().setZoomControlsEnabled(true);

        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);

        mMap.addMarker(new MarkerOptions().position(the).title("Marker in thekkady"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(the));

        // Add a marker in konni and move the camera
        LatLng konni = new LatLng(9.2242196, 76.8366347);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(konni,zoomLevel));
        // mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(kochi,30));
        //  mMap.getUiSettings().setZoomControlsEnabled(true);

        //mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);

        mMap.addMarker(new MarkerOptions().position(konni).title("Marker in konni"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(konni));



        // Add a marker in neliyampathy and move the camera
        LatLng neliyampathi = new LatLng(10.5346968, 76.690422);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(neliyampathi,zoomLevel));
        // mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(kochi,30));
        //  mMap.getUiSettings().setZoomControlsEnabled(true);

        //mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);

        mMap.addMarker(new MarkerOptions().position(neliyampathi).title("Marker in neliyampathi"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(neliyampathi));


        // Add a marker in thrissur and move the camera
        LatLng thrissur = new LatLng(10.5113799, 76.1532093);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(thrissur,zoomLevel));
        // mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(thrissur,30));
        //  mMap.getUiSettings().setZoomControlsEnabled(true);

        //mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);

        mMap.addMarker(new MarkerOptions().position(thrissur).title("Marker in thrissur"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(neliyampathi));


        // Add a marker in nilambur and move the camera
        LatLng nilambur = new LatLng(11.2806832, 76.1987534);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(nilambur,zoomLevel));
        // mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(thrissur,30));
        //  mMap.getUiSettings().setZoomControlsEnabled(true);

        //mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);

        mMap.addMarker(new MarkerOptions().position(nilambur).title("Marker in nilambur"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(neliyampathi));


        // Add a marker in kozhikode and move the camera
        LatLng kozhikode = new LatLng(11.255802, 75.6707249);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(kozhikode,zoomLevel));
        // mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(thrissur,30));
        //  mMap.getUiSettings().setZoomControlsEnabled(true);

        //mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);

        mMap.addMarker(new MarkerOptions().position(kozhikode).title("Marker in kozhikode"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kozhikode));



        // Add a marker in wayanad and move the camera
        LatLng wayand = new LatLng(11.7141243, 75.8289792);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(wayand,zoomLevel));
        // mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(thrissur,30));
        //  mMap.getUiSettings().setZoomControlsEnabled(true);

        //mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);

        mMap.addMarker(new MarkerOptions().position(wayand).title("Marker in wayanad"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(wayand));

        // Add a marker in kannur and move the camera
        LatLng kannur = new LatLng(11.8744775, 75.3703662);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(kannur,zoomLevel));
        // mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(kannur,30));
        //  mMap.getUiSettings().setZoomControlsEnabled(true);

        //mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);

        mMap.addMarker(new MarkerOptions().position(kannur).title("Marker in kannur"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kannur));

        // Add a marker in kasargode and move the camera
        LatLng kasargode = new LatLng(12.3923873, 75.0306978);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(kasargode,zoomLevel));
        // mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(kasargode,30));
        //  mMap.getUiSettings().setZoomControlsEnabled(true);

        //mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);

        mMap.addMarker(new MarkerOptions().position(kasargode).title("Marker in kasargode"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kasargode));


        // Add a marker in idukki and move the camera
        LatLng idukki = new LatLng(9.8138919, 76.4602211);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(idukki,zoomLevel));
        // mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(kasargode,30));
        //  mMap.getUiSettings().setZoomControlsEnabled(true);

        //mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);

        mMap.addMarker(new MarkerOptions().position(idukki).title("Marker in idukki"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(idukki));




        // Add a marker in vagmon and move the camera
        LatLng vagmon = new LatLng(9.6728847, 76.8684833);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(vagmon,zoomLevel));
        // mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(kasargode,30));
        //  mMap.getUiSettings().setZoomControlsEnabled(true);

        //mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);

        mMap.addMarker(new MarkerOptions().position(vagmon).title("Marker in vagmon"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(vagmon));

    }
}
