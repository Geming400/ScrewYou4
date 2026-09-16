package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.TextComponentTagVisitor.PlainStyling.class)
public class PlainStyling_1520817858Mixin {
        @Inject(at = @At("HEAD"), method = "token(Lnet/minecraft/nbt/TextComponentTagVisitor$Token;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void token__1670595590(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1670595590L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stringStyle()Lnet/minecraft/network/chat/Style;", cancellable = true)
    private void stringStyle__1220692544(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1220692544L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "numberStyle()Lnet/minecraft/network/chat/Style;", cancellable = true)
    private void numberStyle__2043517048(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2043517048L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "keyStyle()Lnet/minecraft/network/chat/Style;", cancellable = true)
    private void keyStyle_605999794(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(605999794L))
            info.setReturnValue(null);
    }


}
