package com.example.shoppinglist.domain

interface ShopListRepository {

    fun addShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)

    fun getShopItem(shopItemId: Int): ShopItem?

    fun getShopList(shopList: Int): List<ShopItem>
    abstract fun getShopList(): List<ShopItem>

}