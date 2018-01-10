package com.inventyfy.architecture.di.module;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;

import com.inventyfy.architecture.repository.home.result.ResultRepository;
import com.inventyfy.architecture.viewmodel.BaseViewModelFactory;
import com.inventyfy.architecture.di.common.ViewModelKey;
import com.inventyfy.architecture.viewmodel.home.result.ResultViewModel;
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

    @Binds
    @IntoMap
    @ViewModelKey(ResultViewModel.class)
    public abstract ViewModel bindResultViewModel(ResultViewModel resultViewModel);

    @Binds
    abstract ViewModelProvider.Factory bindViewModelFactory(BaseViewModelFactory factory);
}
