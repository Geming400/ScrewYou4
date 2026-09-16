package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.ItemStackRenderState.LayerRenderState.class)
public class LayerRenderState864810074Mixin {
        @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_78982368(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(78982368L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setLocalTransform(Lorg/joml/Matrix4fc;)V", cancellable = true)
    private void setLocalTransform__1115066935(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1115066935L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setFoilType(Lnet/minecraft/client/renderer/item/ItemStackRenderState$FoilType;)V", cancellable = true)
    private void setFoilType_345009616(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(345009616L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "prepareQuadList()Ljava/util/List;", cancellable = true)
    private void prepareQuadList__1461544650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1461544650L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setParticleMaterial(Lnet/minecraft/client/resources/model/sprite/Material$Baked;)V", cancellable = true)
    private void setParticleMaterial__833386795(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-833386795L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setUsesBlockLight(Z)V", cancellable = true)
    private void setUsesBlockLight_1542419534(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1542419534L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setExtents(Ljava/util/function/Supplier;)V", cancellable = true)
    private void setExtents__809816408(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-809816408L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tintLayers()Lit/unimi/dsi/fastutil/ints/IntList;", cancellable = true)
    private void tintLayers_2109188686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2109188686L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setItemTransform(Lnet/minecraft/client/resources/model/cuboid/ItemTransform;)V", cancellable = true)
    private void setItemTransform_1470836759(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1470836759L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupSpecialModel(Lnet/minecraft/client/renderer/special/SpecialModelRenderer;Ljava/lang/Object;)V", cancellable = true)
    private void setupSpecialModel__1888285402(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1888285402L))
            info.cancel();
    }


}
