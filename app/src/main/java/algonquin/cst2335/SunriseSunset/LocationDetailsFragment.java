package algonquin.cst2335.SunriseSunset;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import algonquin.cst2335.SunriseSunset.databinding.DetailsLayoutBinding;
import algonquin.cst2335.data.FavoriteLocation;

public class LocationDetailsFragment extends Fragment {

    FavoriteLocation favLocation;

    public LocationDetailsFragment (FavoriteLocation fl){
        favLocation = fl;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        DetailsLayoutBinding binding = DetailsLayoutBinding.inflate(inflater);

        binding.messageText.setText(favLocation.latitude);
        binding.timeText.setText(favLocation.longitude);
        binding.buttonText.setText(favLocation.sunrise);
        binding.set.setText(favLocation.sunset);
        binding.dbText.setText(favLocation.id);

        return binding.getRoot();
    }


}//end of class
