package com.example.memoapplication
import io.realm.RealmObject

open class Memo(
    open var name: String = ""
) : RealmObject()