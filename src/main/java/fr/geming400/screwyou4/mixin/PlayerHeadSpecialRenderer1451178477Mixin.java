package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.special.PlayerHeadSpecialRenderer.class)
public class PlayerHeadSpecialRenderer1451178477Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Ljava/lang/Object;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;IIZI)V", cancellable = true)
    private void submit_1720841139(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1720841139L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/PlayerSkinRenderCache$RenderInfo;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;IIZI)V", cancellable = true)
    private void submit__1827246128(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1827246128L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getExtents(Ljava/util/function/Consumer;)V", cancellable = true)
    private void getExtents_1111409629(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1111409629L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractArgument(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/client/renderer/PlayerSkinRenderCache$RenderInfo;", cancellable = true)
    private void extractArgument_616027134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(616027134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractArgument(Lnet/minecraft/world/item/ItemStack;)Ljava/lang/Object;", cancellable = true)
    private void extractArgument_42700961(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(42700961L))
            info.setReturnValue(new java.lang.Object());
    }


}
