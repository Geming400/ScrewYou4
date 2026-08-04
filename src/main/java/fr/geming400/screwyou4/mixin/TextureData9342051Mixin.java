package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.CloudRenderer.TextureData.class)
public class TextureData9342051Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1394854310(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1394854310L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1126117924(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1126117924L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_47604793(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(47604793L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "width()I", cancellable = true)
    private void width_47604297(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(47604297L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cells()[J", cancellable = true)
    private void cells_1195184369(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1195184369L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "height()I", cancellable = true)
    private void height_47604297(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(47604297L))
            info.setReturnValue(null);
    }


}
