package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.ClickEvent.Action.class)
public class Action935056626Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/network/chat/ClickEvent$Action;", cancellable = true)
    private static void values_35909481(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(35909481L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/network/chat/ClickEvent$Action;", cancellable = true)
    private static void valueOf__442620240(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-442620240L))
            info.setReturnValue(net.minecraft.network.chat.ClickEvent.Action.CUSTOM);
    }

    @Inject(at = @At("HEAD"), method = "filterForSerialization(Lnet/minecraft/network/chat/ClickEvent$Action;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private static void filterForSerialization_1701343971(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1701343971L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isAllowedFromServer()Z", cancellable = true)
    private void isAllowedFromServer__1587995074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1587995074L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "valueCodec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void valueCodec_495730377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(495730377L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1023265248(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1023265248L))
            info.setReturnValue("UCG*#ry*U\"}\u25E6=.'\u10FEYY`xz\u363DZM\u64FF\uB7399j/KYUQ\u7488B$7FMsO");
    }


}
