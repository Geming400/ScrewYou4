package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.TextComponentTagVisitor.RichStyling.class)
public class RichStyling_1382753684Mixin {
        @Inject(at = @At("HEAD"), method = "token(Lnet/minecraft/nbt/TextComponentTagVisitor$Token;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void token_1315631205(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1315631205L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stringStyle()Lnet/minecraft/network/chat/Style;", cancellable = true)
    private void stringStyle_1073146994(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1073146994L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "numberStyle()Lnet/minecraft/network/chat/Style;", cancellable = true)
    private void numberStyle_1073146994(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1073146994L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "keyStyle()Lnet/minecraft/network/chat/Style;", cancellable = true)
    private void keyStyle_1073146994(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1073146994L))
            info.setReturnValue(null);
    }


}
