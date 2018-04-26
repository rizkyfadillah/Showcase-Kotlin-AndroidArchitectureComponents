package com.rizkyfadillah.browseproduct.common.di

import com.rizkyfadillah.browseproduct.movie.common.di.MovieComponent
import com.rizkyfadillah.browseproduct.movie.common.di.MovieModule
import com.rizkyfadillah.browseproduct.products.di.ProductsComponent
import com.rizkyfadillah.browseproduct.products.di.ProductsModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created by Rizky on 25/01/18.
 */
@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {

    fun plus(productsModule: ProductsModule): ProductsComponent

    fun plus(movieModule: MovieModule): MovieComponent

}