package uz.project.myapplication.presenter.main_screen

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import uz.project.myapplication.domain.repository.MainRepository
import uz.project.myapplication.presenter.UniversalViewModel

class MainViewModel(private var mainRepository: MainRepository) : ViewModel(),
    UniversalViewModel<String> {

    override val loadingLD = MutableLiveData<Boolean>()
    override val errorLD = MutableLiveData<String>()
    override val errorInternetLD = MutableLiveData<String>()
    override val successLD = MutableLiveData<String>()


}
