package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.SpriteCoordinateExpander.class)
public class SpriteCoordinateExpander65637834Mixin {
        @Inject(at = @At("HEAD"), method = "setColor(I)Lcom/mojang/blaze3d/vertex/VertexConsumer;", cancellable = true)
    private void setColor__1272762140(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1272762140L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setColor(IIII)Lcom/mojang/blaze3d/vertex/VertexConsumer;", cancellable = true)
    private void setColor__1379860705(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1379860705L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setLineWidth(F)Lcom/mojang/blaze3d/vertex/VertexConsumer;", cancellable = true)
    private void setLineWidth_998499416(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(998499416L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setNormal(FFF)Lcom/mojang/blaze3d/vertex/VertexConsumer;", cancellable = true)
    private void setNormal__235870145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-235870145L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addVertex(FFFIFFIIFFF)V", cancellable = true)
    private void addVertex__1132183531(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1132183531L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addVertex(FFF)Lcom/mojang/blaze3d/vertex/VertexConsumer;", cancellable = true)
    private void addVertex__1192738301(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1192738301L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setUv(FF)Lcom/mojang/blaze3d/vertex/VertexConsumer;", cancellable = true)
    private void setUv__611998367(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-611998367L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setUv2(II)Lcom/mojang/blaze3d/vertex/VertexConsumer;", cancellable = true)
    private void setUv2_833151053(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(833151053L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setUv1(II)Lcom/mojang/blaze3d/vertex/VertexConsumer;", cancellable = true)
    private void setUv1_840910412(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(840910412L))
            info.setReturnValue(null);
    }


}
