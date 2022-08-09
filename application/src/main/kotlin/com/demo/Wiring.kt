package com.demo

import com.demo.usecase.UseCaseConfig
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import

@Configuration
@Import(
    RestConfig::class,
    MySQLConfig::class,
    UseCaseConfig::class,
)
class Wiring