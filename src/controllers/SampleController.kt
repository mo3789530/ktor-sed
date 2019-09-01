package com.mo.controllers

import io.ktor.application.call
import io.ktor.http.ContentType
import io.ktor.response.respondText
import io.ktor.routing.Route
import io.ktor.routing.get

fun Route.SampleController() {
    get("/") {
        call.respondText("HELLO WORLD", contentType = ContentType.Text.Plain)
    }
}
