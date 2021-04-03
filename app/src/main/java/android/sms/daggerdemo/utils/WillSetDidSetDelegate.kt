package com.fox.firetvremote.utils

import kotlin.properties.ObservableProperty
import kotlin.reflect.KProperty

fun <T> observing(initialValue: T,
                  willSet: (oldValue: T, newValue: T) -> Unit,
                  didSet: (oldValue: T, newValue: T) -> Unit
) = object : ObservableProperty<T>(initialValue) {
    override fun beforeChange(property: KProperty<*>, oldValue: T, newValue: T): Boolean =
        true.apply { willSet(oldValue, newValue) }

    override fun afterChange(property: KProperty<*>, oldValue: T, newValue: T) = didSet(oldValue, newValue)
}