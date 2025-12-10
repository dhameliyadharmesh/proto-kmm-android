package com.proto.kmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform