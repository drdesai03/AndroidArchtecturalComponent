package com.inventyfy.architecture.di.module;

import android.arch.lifecycle.ViewModel;

import com.inventyfy.architecture.di.common.ViewModelKey;
import com.inventyfy.architecture.viewmodel.home.search.SearchViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(SearchViewModel.class)
    public abstract ViewModel bindSearchViewModel(SearchViewModel searchViewModel);
}
