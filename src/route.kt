package com.mo

import com.mo.controllers.SampleController
import io.ktor.application.*
import io.ktor.locations.Locations
import io.ktor.routing.Routing

@kotlin.jvm.JvmOverloads
fun Application.install() {
    install(Locations)
    install(Routing) {
        SampleController()
    }
}
