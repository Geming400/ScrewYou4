package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.main.GameConfig.QuickPlayData.class)
public class QuickPlayData_316862643Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1702374901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1702374901L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__818597333(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-818597333L))
            info.setReturnValue("_%]pk[IT=죖U]찦JBBx-uR%7 秢lsH3䢑瑚U8t/");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_355125384(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(355125384L))
            info.setReturnValue(159825135);
    }

    @Inject(at = @At("HEAD"), method = "isEnabled()Z", cancellable = true)
    private void isEnabled_355141225(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(355141225L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "variant()Lnet/minecraft/client/main/GameConfig$QuickPlayVariant;", cancellable = true)
    private void variant__1483390232(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1483390232L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "logPath()Ljava/lang/String;", cancellable = true)
    private void logPath__818597829(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-818597829L))
            info.setReturnValue("x. tAy&HPeoXhT柄t驵JK뤟V㷷4pqL7{/-9wl튫꒞\"6Uet");
    }


}
