package com.example.shoppinglist.presentation

import androidx.lifecycle.ViewModel
import com.example.shoppinglist.data.ShopListRepositoryImpl
import com.example.shoppinglist.domain.GetShopListUseCase
import com.example.shoppinglist.domain.ShopItem

class MainViewModel: ViewModel() {

    private val repository = ShopListRepositoryImpl
    private val getShopListUseCase = GetShopListUseCase(repository)

    fun getShopList(): List<ShopItem> {
        return getShopListUseCase.getShopList()
    }

}
