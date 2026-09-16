package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.special.ShieldSpecialRenderer.class)
public class ShieldSpecialRenderer_2051313563Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/core/component/DataComponentMap;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;IIZI)V", cancellable = true)
    private void submit__1206898348(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1206898348L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Ljava/lang/Object;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;IIZI)V", cancellable = true)
    private void submit__1973991072(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1973991072L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getExtents(Ljava/util/function/Consumer;)V", cancellable = true)
    private void getExtents_1711544714(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1711544714L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractArgument(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/core/component/DataComponentMap;", cancellable = true)
    private void extractArgument_522066926(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(522066926L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractArgument(Lnet/minecraft/world/item/ItemStack;)Ljava/lang/Object;", cancellable = true)
    private void extractArgument_642836046(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(642836046L))
            info.setReturnValue(new java.lang.Object());
    }


}
