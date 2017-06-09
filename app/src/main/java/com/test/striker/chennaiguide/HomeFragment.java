package com.test.striker.chennaiguide;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener{


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        RelativeLayout hotels = (RelativeLayout) rootView.findViewById(R.id.hotel);
        hotels.setOnClickListener(this);

        RelativeLayout restaurants = (RelativeLayout) rootView.findViewById(R.id.restaurants);
        restaurants.setOnClickListener(this);

        RelativeLayout attractions = (RelativeLayout) rootView.findViewById(R.id.attractions);
        attractions.setOnClickListener(this);

        RelativeLayout shopping = (RelativeLayout) rootView.findViewById(R.id.shopping);
        shopping.setOnClickListener(this);
        return rootView;
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.hotel :{
                ((MainActivity)getActivity()).setTitle("Hotels");
                FragmentTransaction ft1 = getActivity().getSupportFragmentManager().beginTransaction();
                ft1.setCustomAnimations(R.anim.slide_in,0);
                ft1.addToBackStack(null);
                ft1.replace(R.id.container, new HotelFragment());
                ft1.commit();
                break;
            }
            case R.id.restaurants :{
                ((MainActivity)getActivity()).setTitle("Restaurants");
                FragmentTransaction ft1 = getActivity().getSupportFragmentManager().beginTransaction();
                ft1.setCustomAnimations(R.anim.slide_in,0);
                ft1.addToBackStack(null);
                ft1.replace(R.id.container, new RestaurantsFragment());
                ft1.commit();
                break;}
            case R.id.attractions :{
                ((MainActivity)getActivity()).setTitle("Attractions");
                FragmentTransaction ft1 = getActivity().getSupportFragmentManager().beginTransaction();
                ft1.setCustomAnimations(R.anim.slide_in,0);
                ft1.addToBackStack(null);
                ft1.replace(R.id.container, new AttractionsFragment());
                ft1.commit();
                break;}
            case R.id.shopping :{
                ((MainActivity)getActivity()).setTitle("Shopping");
                FragmentTransaction ft1 = getActivity().getSupportFragmentManager().beginTransaction();
                ft1.setCustomAnimations(R.anim.slide_in,0);
                ft1.addToBackStack(null);
                ft1.replace(R.id.container, new ShoppingFragment());
                ft1.commit();
                break;}

        }
    }
}
