package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.ItemStackRenderState.LayerRenderState.class)
public class LayerRenderState864810074Mixin {
        @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_903084813(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(903084813L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupSpecialModel(Lnet/minecraft/client/renderer/special/SpecialModelRenderer;Ljava/lang/Object;)V", cancellable = true)
    private void setupSpecialModel__1770392749(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1770392749L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setFoilType(Lnet/minecraft/client/renderer/item/ItemStackRenderState$FoilType;)V", cancellable = true)
    private void setFoilType_71380568(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(71380568L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setUsesBlockLight(Z)V", cancellable = true)
    private void setUsesBlockLight_2094426903(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2094426903L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setLocalTransform(Lorg/joml/Matrix4fc;)V", cancellable = true)
    private void setLocalTransform_1634899372(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1634899372L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setParticleMaterial(Lnet/minecraft/client/resources/model/sprite/Material$Baked;)V", cancellable = true)
    private void setParticleMaterial_162665284(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(162665284L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "prepareQuadList()Ljava/util/List;", cancellable = true)
    private void prepareQuadList__1803820406(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1803820406L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tintLayers()Lit/unimi/dsi/fastutil/ints/IntList;", cancellable = true)
    private void tintLayers_1795301169(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1795301169L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setItemTransform(Lnet/minecraft/client/resources/model/cuboid/ItemTransform;)V", cancellable = true)
    private void setItemTransform_1731620800(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1731620800L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setExtents(Ljava/util/function/Supplier;)V", cancellable = true)
    private void setExtents__377605983(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-377605983L))
            info.cancel();
    }


}
