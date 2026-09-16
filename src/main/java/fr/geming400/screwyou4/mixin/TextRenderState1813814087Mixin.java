package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.Display.TextDisplay.TextRenderState.class)
public class TextRenderState1813814087Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_905187819(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(905187819L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1710729684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1710729684L))
            info.setReturnValue("\u2448RyO'%bI\u2906Ud\u4876\u0824&<lu{<.\uB559940##");
    }

    @Inject(at = @At("HEAD"), method = "flags()B", cancellable = true)
    private void flags__1179163457(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1179163457L))
            info.setReturnValue(23);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1923801118(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1923801118L))
            info.setReturnValue(1623766033);
    }

    @Inject(at = @At("HEAD"), method = "text()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void text_913053895(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(913053895L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "backgroundColor()Lnet/minecraft/world/entity/Display$IntInterpolator;", cancellable = true)
    private void backgroundColor_952538097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(952538097L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lineWidth()I", cancellable = true)
    private void lineWidth__1425401285(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1425401285L))
            info.setReturnValue(391500590);
    }

    @Inject(at = @At("HEAD"), method = "textOpacity()Lnet/minecraft/world/entity/Display$IntInterpolator;", cancellable = true)
    private void textOpacity__1644446662(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1644446662L))
            info.setReturnValue(null);
    }


}
