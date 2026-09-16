package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.resources.RegistryDataLoader.RegistryData.class)
public class RegistryData442720475Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__465905793(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-465905793L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1213144000(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1213144000L))
            info.setReturnValue("'qC$)>Cw\u57B7\uC988\u507F|r Cv\uD183U8.N\u9610e\u2BD3ur>'eetL\u7769f2q,#*+V=v..V#\uD51F)\u5F9DX\u0A14_h}-i'<#wx\uC404SaP");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1000072566(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1000072566L))
            info.setReturnValue(1396846918);
    }

    @Inject(at = @At("HEAD"), method = "key()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void key__1257581939(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1257581939L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validator()Lnet/minecraft/resources/RegistryValidator;", cancellable = true)
    private void validator__742851818(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-742851818L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "elementCodec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void elementCodec_1025719963(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1025719963L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "runWithArguments(Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void runWithArguments_745493718(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(745493718L))
            info.cancel();
    }


}
