package src.main.kotlin

import io.ktor.application.*
import io.ktor.features.DefaultHeaders
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main(args: Array<String>) {
    val server = embeddedServer(Netty, 8080) {
        routing {
            get("/") {
                call.respondText("Hello, world!", ContentType.Text.Html)
            }
            get("/health"){
                call.respondText("OK", ContentType.Text.Any)
            }
        }
        this.install(DefaultHeaders){
            header("X-Developer", "David Miler")
        }
    }


    server.start(wait = true)
}