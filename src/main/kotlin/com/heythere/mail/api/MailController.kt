package com.heythere.mail.api

import com.heythere.mail.service.MailSenderService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MailController(private val mailSenderService: MailSenderService)  {
    @GetMapping("welcome")
    fun welcomeMailSend() {
        mailSenderService.sendMail()
    }
}