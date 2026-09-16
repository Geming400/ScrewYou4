package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.TextComponentTagVisitor.RichStyling.class)
public class RichStyling_1382753684Mixin {
        @Inject(at = @At("HEAD"), method = "token(Lnet/minecraft/nbt/TextComponentTagVisitor$Token;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void token__1808659764(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1808659764L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "numberStyle()Lnet/minecraft/network/chat/Style;", cancellable = true)
    private void numberStyle_2113386074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2113386074L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stringStyle()Lnet/minecraft/network/chat/Style;", cancellable = true)
    private void stringStyle__1358756718(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1358756718L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "keyStyle()Lnet/minecraft/network/chat/Style;", cancellable = true)
    private void keyStyle_467935620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(467935620L))
            info.setReturnValue(null);
    }


}
