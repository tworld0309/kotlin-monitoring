package com.monitoring

import io.opentelemetry.exporter.otlp.trace.OtlpGrpcSpanExporter
import io.opentelemetry.sdk.OpenTelemetrySdk
import io.opentelemetry.sdk.trace.SdkTracerProvider
import io.opentelemetry.sdk.trace.export.BatchSpanProcessor
import io.opentelemetry.sdk.trace.export.SpanExporter
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MonitoringKotlinApplication{
    init {

        // Create an OTLP GRPC Span Exporter
//        val spanExporter: SpanExporter = OtlpGrpcSpanExporter.builder()
//            .setEndpoint("http://localhost:4318") // gRPC endpoint
//            .build()

//        val tracerProvider = SdkTracerProvider.builder()
//            .addSpanProcessor(BatchSpanProcessor.builder(spanExporter).build())
//            .build()
//
//        OpenTelemetrySdk.builder()
//            .setTracerProvider(tracerProvider)
//            .buildAndRegisterGlobal()

//        val sdkTracerProvider = SdkTracerProvider.builder()
//            .addSpanProcessor(SimpleSpanProcessor.create(LoggingSpanExporter()))
//        .build()
//
//        OpenTelemetrySdk.builder()
//            .setTracerProvider(sdkTracerProvider)
//            .setPropagators(ContextPropagators.create(W3CTraceContextPropagator.getInstance()))
//            .buildAndRegisterGlobal()
    }
}

fun main(args: Array<String>) {
    runApplication<MonitoringKotlinApplication>(*args)
}
