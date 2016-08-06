package com.atrium.event.module;

import com.atrium.event.service.EventService;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by romain on 06/08/2016.
 */
@Module
public class EventModule {

    @Provides
    public EventService provideEventService(Retrofit retrofit){
        return retrofit.create(EventService.class);
    }
}
