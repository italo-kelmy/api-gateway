//package com.example.api_gateway.Security;
//
//import io.netty.handler.ssl.SslContext;
//import io.netty.handler.ssl.SslContextBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.client.reactive.ReactorClientHttpConnector;
//import org.springframework.web.reactive.function.client.WebClient;
//import reactor.netty.http.client.HttpClient;
//import javax.net.ssl.SSLException;
//import javax.net.ssl.X509TrustManager;
//import java.security.cert.X509Certificate;
//
//@Configuration
//public class HttpsConfig {
//
//    @Bean
//    public WebClient webClient() throws SSLException {
//        // Cria um TrustManager personalizado que aceita todos os certificados
//        X509TrustManager trustManager = new X509TrustManager() {
//            @Override
//            public void checkClientTrusted(X509Certificate[] chain, String authType) {
//                // Não faz nenhuma verificação - ACEITA TODOS OS CERTIFICADOS
//            }
//
//            @Override
//            public void checkServerTrusted(X509Certificate[] chain, String authType) {
//                // Não faz nenhuma verificação - ACEITA TODOS OS CERTIFICADOS
//            }
//
//            @Override
//            public X509Certificate[] getAcceptedIssuers() {
//                return new X509Certificate[0];
//            }
//        };
//
//        // Configura o contexto SSL
//        SslContext sslContext = SslContextBuilder
//                .forClient()
//                .trustManager(trustManager)  // Usa o TrustManager personalizado
//                .build();
//
//        // Configura o HttpClient com o contexto SSL
//        HttpClient httpClient = HttpClient.create()
//                .secure(spec -> spec.sslContext(sslContext));
//
//        return WebClient.builder()
//                .clientConnector(new ReactorClientHttpConnector(httpClient))
//                .build();
//    }
//}