package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.api.Schema.class)
public class Schema254853631Mixin {
        @Inject(at = @At("HEAD"), method = "type()Ljava/util/List;", cancellable = true)
    private void type_1881190447(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1881190447L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1640365890(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1640365890L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__880606344(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-880606344L))
            info.setReturnValue("6WegKB9\u0D5Cwz/rq#tI-`L>&m");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_293116373(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(293116373L))
            info.setReturnValue(89191165);
    }

    @Inject(at = @At("HEAD"), method = "record(Lcom/mojang/serialization/Codec;)Lnet/minecraft/server/jsonrpc/api/Schema;", cancellable = true)
    private static void record_1118936898(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1118936898L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "info()Lnet/minecraft/server/jsonrpc/api/Schema;", cancellable = true)
    private void info__1748444157(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1748444157L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "properties()Ljava/util/Map;", cancellable = true)
    private void properties__1749770009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1749770009L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "reference()Ljava/util/Optional;", cancellable = true)
    private void reference_500315053(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(500315053L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asArray()Lnet/minecraft/server/jsonrpc/api/Schema;", cancellable = true)
    private void asArray__1748444157(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1748444157L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withField(Ljava/lang/String;Lnet/minecraft/server/jsonrpc/api/Schema;)Lnet/minecraft/server/jsonrpc/api/Schema;", cancellable = true)
    private void withField__1938167216(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1938167216L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "items()Ljava/util/Optional;", cancellable = true)
    private void items_500315053(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(500315053L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "arrayOf(Lnet/minecraft/server/jsonrpc/api/Schema;Lcom/mojang/serialization/Codec;)Lnet/minecraft/server/jsonrpc/api/Schema;", cancellable = true)
    private static void arrayOf__530675623(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-530675623L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec__137111995(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-137111995L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSchemaRegistry()Ljava/util/List;", cancellable = true)
    private static void getSchemaRegistry_1881190695(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1881190695L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enumValues()Ljava/util/List;", cancellable = true)
    private void enumValues_1881190447(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1881190447L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ofTypes(Ljava/util/List;Lcom/mojang/serialization/Codec;)Lnet/minecraft/server/jsonrpc/api/Schema;", cancellable = true)
    private static void ofTypes_1379426547(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1379426547L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ofEnum(Ljava/util/function/Supplier;)Lnet/minecraft/server/jsonrpc/api/Schema;", cancellable = true)
    private static void ofEnum_1324543631(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1324543631L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ofEnum(Ljava/util/function/Supplier;Lcom/mojang/serialization/Codec;)Lnet/minecraft/server/jsonrpc/api/Schema;", cancellable = true)
    private static void ofEnum__435134250(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-435134250L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ofEnum(Ljava/util/List;Lcom/mojang/serialization/Codec;)Lnet/minecraft/server/jsonrpc/api/Schema;", cancellable = true)
    private static void ofEnum_1379426547(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1379426547L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ofType(Ljava/lang/String;Lcom/mojang/serialization/Codec;)Lnet/minecraft/server/jsonrpc/api/Schema;", cancellable = true)
    private static void ofType_2102673740(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2102673740L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "typedCodec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void typedCodec__137111747(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-137111747L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ofRef(Ljava/net/URI;Lcom/mojang/serialization/Codec;)Lnet/minecraft/server/jsonrpc/api/Schema;", cancellable = true)
    private static void ofRef_1060560996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1060560996L))
            info.setReturnValue(null);
    }


}
