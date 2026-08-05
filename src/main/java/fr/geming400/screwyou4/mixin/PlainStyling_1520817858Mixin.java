package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.TextComponentTagVisitor.PlainStyling.class)
public class PlainStyling_1520817858Mixin {
        @Inject(at = @At("HEAD"), method = "token(Lnet/minecraft/nbt/TextComponentTagVisitor$Token;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void token_1453695379(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1453695379L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "keyStyle()Lnet/minecraft/network/chat/Style;", cancellable = true)
    private void keyStyle_1211211168(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1211211168L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "numberStyle()Lnet/minecraft/network/chat/Style;", cancellable = true)
    private void numberStyle_1211211168(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1211211168L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stringStyle()Lnet/minecraft/network/chat/Style;", cancellable = true)
    private void stringStyle_1211211168(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1211211168L))
            info.setReturnValue(null);
    }


}
