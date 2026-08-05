package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.CloudRenderer.TextureData.class)
public class TextureData9342051Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__899284217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-899284217L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_779765576(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(779765576L))
            info.setReturnValue("n\uAABF*n\"UOQ\u777B,c_gI\u54F4vm0rpNTV(s\u25E1kc5J[30 )#D.4 s");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_566694142(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(566694142L))
            info.setReturnValue(-1447867432);
    }

    @Inject(at = @At("HEAD"), method = "width()I", cancellable = true)
    private void width__1630805949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1630805949L))
            info.setReturnValue(68572070);
    }

    @Inject(at = @At("HEAD"), method = "cells()[J", cancellable = true)
    private void cells_1609708418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1609708418L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "height()I", cancellable = true)
    private void height__1076006526(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1076006526L))
            info.setReturnValue(-1698914298);
    }


}
