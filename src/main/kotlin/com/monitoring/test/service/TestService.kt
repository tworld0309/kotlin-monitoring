package com.monitoring.test.service

import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class TestService {

    private val log = LoggerFactory.getLogger(TestService::class.java)

    fun callService1() {
        log.debug("log-info - call testService1")
    }

    fun callService2() {
        log.debug("log-info - call testService2")
    }
}