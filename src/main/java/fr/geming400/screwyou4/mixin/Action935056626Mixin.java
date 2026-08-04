package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.ClickEvent.Action.class)
public class Action935056626Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/network/chat/ClickEvent$Action;", cancellable = true)
    private static void values__1950864437(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1950864437L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/network/chat/ClickEvent$Action;", cancellable = true)
    private static void valueOf_895694728(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(895694728L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__200403845(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-200403845L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "filterForSerialization(Lnet/minecraft/network/chat/ClickEvent$Action;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private static void filterForSerialization__1133580542(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1133580542L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isAllowedFromServer()Z", cancellable = true)
    private void isAllowedFromServer_973335209(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(973335209L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueCodec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void valueCodec__1624056946(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1624056946L))
            info.setReturnValue(null);
    }


}
