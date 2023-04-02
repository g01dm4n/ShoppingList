package com.example.shoppinglist.domain

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

interface ShopListRepository {

    fun addShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)

    fun getShopItem(shopItemId: Int): ShopItem?

    fun getShopList(shopList: Int): MutableLiveData<List<ShopItem>>

    abstract fun getShopList(): MutableLiveData<List<ShopItem>>

}