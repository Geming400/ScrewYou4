package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.ItemStackRenderState.class)
public class ItemStackRenderState_2040427334Mixin {
        @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_2078702072(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2078702072L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_2078705916(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2078705916L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ensureCapacity(I)V", cancellable = true)
    private void ensureCapacity__1040622991(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1040622991L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "newLayer()Lnet/minecraft/client/renderer/item/ItemStackRenderState$LayerRenderState;", cancellable = true)
    private void newLayer_888864075(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(888864075L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "submit(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;III)V", cancellable = true)
    private void submit__1287132847(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1287132847L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pickParticleMaterial(Lnet/minecraft/util/RandomSource;)Lnet/minecraft/client/resources/model/sprite/Material$Baked;", cancellable = true)
    private void pickParticleMaterial__2048895653(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2048895653L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getModelBoundingBox()Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void getModelBoundingBox_619769981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(619769981L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isAnimated()Z", cancellable = true)
    private void isAnimated_2078705916(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2078705916L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setAnimated()V", cancellable = true)
    private void setAnimated_2078702072(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2078702072L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "appendModelIdentityElement(Ljava/lang/Object;)V", cancellable = true)
    private void appendModelIdentityElement__869032044(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-869032044L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setOversizedInGui(Z)V", cancellable = true)
    private void setOversizedInGui__1024923134(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1024923134L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitExtents(Ljava/util/function/Consumer;)V", cancellable = true)
    private void visitExtents__1573523550(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1573523550L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isOversizedInGui()Z", cancellable = true)
    private void isOversizedInGui_2078705916(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2078705916L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "usesBlockLight()Z", cancellable = true)
    private void usesBlockLight_2078705916(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2078705916L))
            info.setReturnValue(null);
    }


}
