package com.heythere.mail

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@EnableEurekaClient
@SpringBootApplication
class HeythereMailServerApplication

fun main(args: Array<String>) {
    runApplication<HeythereMailServerApplication>(*args)
}
