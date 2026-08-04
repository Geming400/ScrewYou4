package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.UniformValue.FloatUniform.class)
public class FloatUniform_1815975639Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/client/renderer/UniformValue$Type;", cancellable = true)
    private void type__831530795(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-831530795L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "value()F", cancellable = true)
    private void value_1854235001(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1854235001L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1093479399(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1093479399L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_680515663(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(680515663L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1854238380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1854238380L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeTo(Lcom/mojang/blaze3d/buffers/Std140Builder;)V", cancellable = true)
    private void writeTo__411640370(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-411640370L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addSize(Lcom/mojang/blaze3d/buffers/Std140SizeCalculator;)V", cancellable = true)
    private void addSize__474780916(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-474780916L))
            info.cancel();
    }


}
