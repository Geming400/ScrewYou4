package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.Display.TextDisplay.TextRenderState.class)
public class TextRenderState1813814087Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1095640950(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1095640950L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_678354112(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(678354112L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "flags()B", cancellable = true)
    private void flags_1852069606(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1852069606L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1852076829(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1852076829L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "text()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void text__363095078(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-363095078L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "backgroundColor()Lnet/minecraft/world/entity/Display$IntInterpolator;", cancellable = true)
    private void backgroundColor__130211812(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-130211812L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "textOpacity()Lnet/minecraft/world/entity/Display$IntInterpolator;", cancellable = true)
    private void textOpacity__130211812(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-130211812L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lineWidth()I", cancellable = true)
    private void lineWidth_1852076333(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1852076333L))
            info.setReturnValue(null);
    }


}
