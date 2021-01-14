package com.menghuanwd.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class RouterFunctionConfiguration {

    /**
     * Flux 0 - N 个对象集合
     * Mono 0 - 1 个对象集合
     * Reactive 中的Flux or Mone 是异步处理 （非阻塞）
     * Flux Mono 都是 Publisher
     */
//    @Bean
//    @Autowired
//    public RouterFunction<ServerResponse> personFindAll(UserService userService) {
//        return RouterFunctions.route(RequestPredicates.GET("/person/find/all"),
//                request -> {
//                    Collection<User> users = userService.findAll();
//                    Flux<User> userFlux = Flux.fromIterable(users);
//                    return ServerResponse.ok().body(userFlux, User.class);
//                });
//    }
}
