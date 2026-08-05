package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.resources.RegistryDataLoader.RegistryData.class)
public class RegistryData442720475Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1828232734(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1828232734L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__692739500(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-692739500L))
            info.setReturnValue("p W,eyQ\uFA56\"SozKx\u3BCE}\uD625Mm&}(b/*k=cF\uFC72\u4ED346f,7(cRf$\u8A15e,)\uAD13s:\u9C211x6lE");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_480983217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(480983217L))
            info.setReturnValue(118805339);
    }

    @Inject(at = @At("HEAD"), method = "key()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void key_1251211788(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1251211788L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validator()Lnet/minecraft/resources/RegistryValidator;", cancellable = true)
    private void validator_553028776(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(553028776L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "elementCodec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void elementCodec_50754849(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(50754849L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "runWithArguments(Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void runWithArguments__1295430415(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1295430415L))
            info.cancel();
    }


}
