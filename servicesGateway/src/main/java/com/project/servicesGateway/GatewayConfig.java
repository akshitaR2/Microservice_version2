package com.project.servicesGateway;

import org.springframework.cloud.gateway.server.mvc.handler.GatewayRouterFunctions;
import org.springframework.cloud.gateway.server.mvc.handler.HandlerFunctions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.function.RequestPredicates;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;

@Configuration
public class GatewayConfig {

	  @Bean
	    public RouterFunction<ServerResponse> orderServiceRoute() {
	        return GatewayRouterFunctions.route("orderservices")
	                .route(RequestPredicates.path("/order"), HandlerFunctions.http("http://localhost:8001"))
	               
	                .build();
	    }
	  
	  @Bean
	    public RouterFunction<ServerResponse> productServiceRoute() {
	        return GatewayRouterFunctions.route("productservices")
	                .route(RequestPredicates.path("/product"), HandlerFunctions.http("http://localhost:8002"))
	               
	                .build();
	    }
}
