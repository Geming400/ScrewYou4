package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.dialog.body.PlainMessage.class)
public class PlainMessage_1449202691Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1460252347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1460252347L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_313742715(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(313742715L))
            info.setReturnValue("v^m%?Z\uCD93V(6l6Y^>4^8Q\u3FFE0A6t\u3CFDo9^p");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1487465432(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1487465432L))
            info.setReturnValue(233518418);
    }

    @Inject(at = @At("HEAD"), method = "width()I", cancellable = true)
    private void width_1487464936(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1487464936L))
            info.setReturnValue(412041908);
    }

    @Inject(at = @At("HEAD"), method = "contents()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void contents__727706475(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-727706475L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mapCodec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void mapCodec__1109910882(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1109910882L))
            info.setReturnValue(null);
    }


}
