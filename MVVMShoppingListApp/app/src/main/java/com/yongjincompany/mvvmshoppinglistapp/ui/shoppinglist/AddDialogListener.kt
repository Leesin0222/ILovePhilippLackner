package com.yongjincompany.mvvmshoppinglistapp.ui.shoppinglist

import com.yongjincompany.mvvmshoppinglistapp.data.db.entities.ShoppingItem

interface AddDialogListener {
    fun onAddButtonClicked(item: ShoppingItem)

}