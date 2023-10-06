package com.example.jalsanket;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class    Maps extends Fragment {

    private OnMapReadyCallback callback = new OnMapReadyCallback() {

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//Dynamically
            MapmyIndiaMapView mapmyIndiaMapView=new MapmyIndiaMapView(inflater.getContext());

            MapView mMapView =mapmyIndiaMapView.getMapView();

            return mapmyIndiaMapView;

//from layout

            View view = inflater.inflate(R.layout.mapview, container, false);
            MapView mMapView = ((MapmyIndiaMapView) view.findViewById(R.id.mapview)).getMapView();
            return view;
        }