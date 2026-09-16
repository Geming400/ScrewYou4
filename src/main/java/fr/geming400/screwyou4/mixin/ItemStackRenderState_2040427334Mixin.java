package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.ItemStackRenderState.class)
public class ItemStackRenderState_2040427334Mixin {
        @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_1254599627(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1254599627L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty__1195423591(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1195423591L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "ensureCapacity(I)V", cancellable = true)
    private void ensureCapacity_907911049(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(907911049L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "newLayer()Lnet/minecraft/client/renderer/item/ItemStackRenderState$LayerRenderState;", cancellable = true)
    private void newLayer_1825907484(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1825907484L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "submit(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;III)V", cancellable = true)
    private void submit_1951467881(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1951467881L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "appendModelIdentityElement(Ljava/lang/Object;)V", cancellable = true)
    private void appendModelIdentityElement_1958964869(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1958964869L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setAnimated()V", cancellable = true)
    private void setAnimated_1486487795(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1486487795L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitExtents(Ljava/util/function/Consumer;)V", cancellable = true)
    private void visitExtents_109295328(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(109295328L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setOversizedInGui(Z)V", cancellable = true)
    private void setOversizedInGui_1180014379(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1180014379L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isOversizedInGui()Z", cancellable = true)
    private void isOversizedInGui__105235221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-105235221L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "pickParticleMaterial(Lnet/minecraft/util/RandomSource;)Lnet/minecraft/client/resources/model/sprite/Material$Baked;", cancellable = true)
    private void pickParticleMaterial__1701819635(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1701819635L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isAnimated()Z", cancellable = true)
    private void isAnimated__1985788881(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1985788881L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "usesBlockLight()Z", cancellable = true)
    private void usesBlockLight_1762091175(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1762091175L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getModelBoundingBox()Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void getModelBoundingBox__623937047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-623937047L))
            info.setReturnValue(null);
    }


}
