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
            info.setReturnValue("_%]pk[IT=\uC8D6U]\uCC26JBBx-uR%7 \u79E2lsH3\u4891\u745AU8t/");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_355125384(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(355125384L))
            info.setReturnValue(-470854965);
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
            info.setReturnValue("x. tAy&HPeoXhT\u67C4t\u9A75JK\uB91FV\u3DF74pqL7{/-9wl\uD2AB\uA49E\"6Uet");
    }


}
