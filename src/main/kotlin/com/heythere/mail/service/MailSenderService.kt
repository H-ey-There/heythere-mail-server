package com.heythere.mail.service

import org.springframework.mail.javamail.JavaMailSender
import org.springframework.mail.javamail.MimeMessageHelper
import org.springframework.stereotype.Service
import org.thymeleaf.context.Context
import org.thymeleaf.spring5.SpringTemplateEngine
import javax.mail.internet.MimeMessage

@Service
class MailSenderService(private val sender: JavaMailSender,
                        private val templateEngine: SpringTemplateEngine) {
    fun sendMail() {
        val message: (MimeMessage) -> Unit = { mimeMessage: MimeMessage ->
            val helper: MimeMessageHelper = MimeMessageHelper(mimeMessage)

            helper.setTo("hsm012362@gmail.com");
            helper.setSubject("한승민님이 방송을 시작하였습니다");
            helper.setText(contextBuilder(), true);
        }
        sender.send(message)
    }

    private fun contextBuilder(): String {
        val context = Context()
        context.setVariable("test", "test");
        return templateEngine.process("welcome-template", context)
    }
}