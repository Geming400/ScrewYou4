package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.network.Filterable.class)
public class Filterable_750403418Mixin {
        @Inject(at = @At("HEAD"), method = "get(Z)Ljava/lang/Object;", cancellable = true)
    private void get__1885521388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1885521388L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__158222851(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-158222851L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1520826942(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1520826942L))
            info.setReturnValue("R|Nl^$mtn\uD1BD\u9C27m)X[k-,@9v$<B{G\u7284ejdH,]tfi\uC11FN#}o\uC5857=(\uAAAE\uC825>(\u08E4\u4BE9sZ&\u134CDDJ[,L\u1A864\u6CBDeq\u5EDE5s\uBB16AS[XzN[]");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1307755508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1307755508L))
            info.setReturnValue(-1444507215);
    }

    @Inject(at = @At("HEAD"), method = "map(Ljava/util/function/Function;)Lnet/minecraft/server/network/Filterable;", cancellable = true)
    private void map_2034263062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2034263062L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "from(Lnet/minecraft/server/network/FilteredText;)Lnet/minecraft/server/network/Filterable;", cancellable = true)
    private static void from__108653330(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-108653330L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resolve(Ljava/util/function/Function;)Ljava/util/Optional;", cancellable = true)
    private void resolve__1383384429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1383384429L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "raw()Ljava/lang/Object;", cancellable = true)
    private void raw_1924329244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1924329244L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "filtered()Ljava/util/Optional;", cancellable = true)
    private void filtered__112691682(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-112691682L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec_1102052230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1102052230L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "streamCodec(Lnet/minecraft/network/codec/StreamCodec;)Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private static void streamCodec_280503506(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(280503506L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "passThrough(Ljava/lang/Object;)Lnet/minecraft/server/network/Filterable;", cancellable = true)
    private static void passThrough__2102007470(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2102007470L))
            info.setReturnValue(null);
    }


}
