package com.modo.modo.sportsapp.myevents.presentation;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.modo.modo.sportsapp.model.domain.common.DataWrapper;
import com.modo.modo.sportsapp.feature1.data.Feature1Repository;

import java.util.UUID;

public class MyEventsViewModel extends AndroidViewModel {

    private static final String TAG = "feature1.ViewModel";

    private final Feature1Repository repository;

    public MyEventsViewModel(@NonNull Application application) {
        super(application);
        Log.d(TAG, "ViewModel: construct");
        repository = new Feature1Repository();
    }

    LiveData<DataWrapper<UUID>> bindPing() {
        Log.d(TAG, "bindPing: ");
        return repository.getMldPing();
    }

    public void ping() {
        Log.d(TAG, "ping: ");
        repository.ping();
    }
}