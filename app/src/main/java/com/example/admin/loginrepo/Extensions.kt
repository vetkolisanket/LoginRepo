package com.example.admin.loginrepo

/**
 * Created by Sanket on 07/01/19.
 */
fun <T> Any.unsafeLazy(initializer: () -> T) = lazy(LazyThreadSafetyMode.NONE, initializer)
