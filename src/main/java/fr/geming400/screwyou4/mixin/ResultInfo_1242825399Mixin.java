package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.api.ResultInfo.class)
public class ResultInfo_1242825399Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name_2052092554(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2052092554L))
            info.setReturnValue("\u9ABER|Jo,0LX\u2A3Ec\u3C65+\u892A\uCB8E");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_334199130(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(334199130L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2013248923(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2013248923L))
            info.setReturnValue("5x>bX!]d\u5806U#Hsg>dm5gTg;8Jnf\uFD76c\uB7ED^X>Pb$WW&\u39559\u561B");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1800177489(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1800177489L))
            info.setReturnValue(-1022907323);
    }

    @Inject(at = @At("HEAD"), method = "typedCodec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void typedCodec_141335488(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(141335488L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "schema()Lnet/minecraft/server/jsonrpc/api/Schema;", cancellable = true)
    private void schema__2031281991(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2031281991L))
            info.setReturnValue(null);
    }


}
