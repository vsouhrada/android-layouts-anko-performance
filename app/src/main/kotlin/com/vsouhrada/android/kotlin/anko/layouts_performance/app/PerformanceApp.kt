package com.vsouhrada.android.kotlin.anko.layouts_performance.app

import android.app.Application

/**
 * @author vsouhrada
 * @see[Application]
 * @since 0.1.0
 */
class PerformanceApp : Application() {

  override fun onCreate() {
    super.onCreate()
    // Use it only in debug builds
//    if (BuildConfig.DEBUG) {
//      AndroidDevMetrics.initWith(this)
//    }
  }

}