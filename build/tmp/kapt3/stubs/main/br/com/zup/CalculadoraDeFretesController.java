package br.com.zup;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lbr/com/zup/CalculadoraDeFretesController;", "", "grpcClient", "Lbr/com/zup/FretesServiceGrpc$FretesServiceBlockingStub;", "(Lbr/com/zup/FretesServiceGrpc$FretesServiceBlockingStub;)V", "getGrpcClient", "()Lbr/com/zup/FretesServiceGrpc$FretesServiceBlockingStub;", "calcula", "Lbr/com/zup/FreteResponse;", "cep", "", "fretes-rest"})
@io.micronaut.http.annotation.Controller(value = "/api/fretes")
public final class CalculadoraDeFretesController {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    private final br.com.zup.FretesServiceGrpc.FretesServiceBlockingStub grpcClient = null;
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get()
    public final br.com.zup.FreteResponse calcula(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.QueryValue()
    java.lang.String cep) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zup.FretesServiceGrpc.FretesServiceBlockingStub getGrpcClient() {
        return null;
    }
    
    public CalculadoraDeFretesController(@org.jetbrains.annotations.NotNull()
    br.com.zup.FretesServiceGrpc.FretesServiceBlockingStub grpcClient) {
        super();
    }
}