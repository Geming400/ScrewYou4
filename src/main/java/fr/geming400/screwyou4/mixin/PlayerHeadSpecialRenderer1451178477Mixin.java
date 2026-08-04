package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.special.PlayerHeadSpecialRenderer.class)
public class PlayerHeadSpecialRenderer1451178477Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Ljava/lang/Object;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;IIZI)V", cancellable = true)
    private void submit_1279457995(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1279457995L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/PlayerSkinRenderCache$RenderInfo;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;IIZI)V", cancellable = true)
    private void submit__2054763288(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2054763288L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getExtents(Ljava/util/function/Consumer;)V", cancellable = true)
    private void getExtents_2132194890(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2132194890L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractArgument(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/client/renderer/PlayerSkinRenderCache$RenderInfo;", cancellable = true)
    private void extractArgument_223570848(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(223570848L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractArgument(Lnet/minecraft/world/item/ItemStack;)Ljava/lang/Object;", cancellable = true)
    private void extractArgument_202068931(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(202068931L))
            info.setReturnValue(null);
    }


}
