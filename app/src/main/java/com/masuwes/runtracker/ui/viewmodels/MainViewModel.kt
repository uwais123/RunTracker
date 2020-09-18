package com.masuwes.runtracker.ui.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.masuwes.runtracker.repositories.MainRepository
import javax.inject.Inject

class MainViewModel @ViewModelInject constructor(val mainRepository: MainRepository): ViewModel() {

}