package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.special.BannerSpecialRenderer.class)
public class BannerSpecialRenderer1858547458Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Ljava/lang/Object;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;IIZI)V", cancellable = true)
    private void submit_2128210120(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2128210120L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/world/level/block/entity/BannerPatternLayers;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;IIZI)V", cancellable = true)
    private void submit__842047709(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-842047709L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractArgument(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/level/block/entity/BannerPatternLayers;", cancellable = true)
    private void extractArgument_305514705(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(305514705L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractArgument(Lnet/minecraft/world/item/ItemStack;)Ljava/lang/Object;", cancellable = true)
    private void extractArgument_450069942(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(450069942L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExtents(Ljava/util/function/Consumer;)V", cancellable = true)
    private void getExtents_1518778610(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1518778610L))
            info.cancel();
    }


}
