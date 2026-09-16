package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.api.Schema.class)
public class Schema254853631Mixin {
        @Inject(at = @At("HEAD"), method = "type()Ljava/util/List;", cancellable = true)
    private void type__2061410711(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2061410711L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__653772637(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-653772637L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1025277156(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1025277156L))
            info.setReturnValue("?r,J\u18CBJY;.k.LtO\uBC4A[e\u71E3:U=\u687E#S?xk\u30AA.&+$S'm$[%<n7c4Ir`ve0SkSY\"* E#<F0N\u30F4{_yz>Z\u985B[ zeT!*\uB71CqiW");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_812205722(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(812205722L))
            info.setReturnValue(1088842723);
    }

    @Inject(at = @At("HEAD"), method = "record(Lcom/mojang/serialization/Codec;)Lnet/minecraft/server/jsonrpc/api/Schema;", cancellable = true)
    private static void record_1141212817(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1141212817L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "info()Lnet/minecraft/server/jsonrpc/api/Schema;", cancellable = true)
    private void info_1976318485(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1976318485L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "properties()Ljava/util/Map;", cancellable = true)
    private void properties__1038636844(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1038636844L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "reference()Ljava/util/Optional;", cancellable = true)
    private void reference_1657209336(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1657209336L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asArray()Lnet/minecraft/server/jsonrpc/api/Schema;", cancellable = true)
    private void asArray_1589247516(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1589247516L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withField(Ljava/lang/String;Lnet/minecraft/server/jsonrpc/api/Schema;)Lnet/minecraft/server/jsonrpc/api/Schema;", cancellable = true)
    private void withField__162565596(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-162565596L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "items()Ljava/util/Optional;", cancellable = true)
    private void items__159065235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-159065235L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "arrayOf(Lnet/minecraft/server/jsonrpc/api/Schema;Lcom/mojang/serialization/Codec;)Lnet/minecraft/server/jsonrpc/api/Schema;", cancellable = true)
    private static void arrayOf_1506354793(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1506354793L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec__1549855909(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1549855909L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSchemaRegistry()Ljava/util/List;", cancellable = true)
    private static void getSchemaRegistry_888837403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(888837403L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ofType(Ljava/lang/String;Lcom/mojang/serialization/Codec;)Lnet/minecraft/server/jsonrpc/api/Schema;", cancellable = true)
    private static void ofType_1327400315(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1327400315L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "typedCodec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void typedCodec__846636279(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-846636279L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ofTypes(Ljava/util/List;Lcom/mojang/serialization/Codec;)Lnet/minecraft/server/jsonrpc/api/Schema;", cancellable = true)
    private static void ofTypes__295400623(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-295400623L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ofEnum(Ljava/util/function/Supplier;Lcom/mojang/serialization/Codec;)Lnet/minecraft/server/jsonrpc/api/Schema;", cancellable = true)
    private static void ofEnum__198894002(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-198894002L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ofEnum(Ljava/util/function/Supplier;)Lnet/minecraft/server/jsonrpc/api/Schema;", cancellable = true)
    private static void ofEnum__1315206137(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1315206137L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ofEnum(Ljava/util/List;Lcom/mojang/serialization/Codec;)Lnet/minecraft/server/jsonrpc/api/Schema;", cancellable = true)
    private static void ofEnum_853876859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(853876859L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ofRef(Ljava/net/URI;Lcom/mojang/serialization/Codec;)Lnet/minecraft/server/jsonrpc/api/Schema;", cancellable = true)
    private static void ofRef_1963150248(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1963150248L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enumValues()Ljava/util/List;", cancellable = true)
    private void enumValues__1782814158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1782814158L))
            info.setReturnValue(null);
    }


}
