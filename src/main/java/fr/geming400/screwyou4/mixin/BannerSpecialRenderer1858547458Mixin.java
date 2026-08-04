package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.special.BannerSpecialRenderer.class)
public class BannerSpecialRenderer1858547458Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Ljava/lang/Object;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;IIZI)V", cancellable = true)
    private void submit_1686826976(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1686826976L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/world/level/block/entity/BannerPatternLayers;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;IIZI)V", cancellable = true)
    private void submit_1315571771(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1315571771L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getExtents(Ljava/util/function/Consumer;)V", cancellable = true)
    private void getExtents__1755403425(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1755403425L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractArgument(Lnet/minecraft/world/item/ItemStack;)Ljava/lang/Object;", cancellable = true)
    private void extractArgument_609437912(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(609437912L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractArgument(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/level/block/entity/BannerPatternLayers;", cancellable = true)
    private void extractArgument_386040179(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(386040179L))
            info.setReturnValue(null);
    }


}
