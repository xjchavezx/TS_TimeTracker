package com.tricellsoftware.timetrackertestappv2.Fragments;

import com.tricellsoftware.timetrackertestappv2.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class NoResults_Fragment extends Fragment {
	
	  @Override
	  public View onCreateView(LayoutInflater inflater, ViewGroup container,
	      Bundle savedInstanceState) {
	    View view = inflater.inflate(R.layout.no_results_fragment,
	        container, false);
	    
	   // ctx = getActivity();
	    
	    return view;
	  }

}