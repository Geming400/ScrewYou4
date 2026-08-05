package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.special.ShieldSpecialRenderer.class)
public class ShieldSpecialRenderer_2051313563Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/core/component/DataComponentMap;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;IIZI)V", cancellable = true)
    private void submit_1692442940(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1692442940L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Ljava/lang/Object;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;IIZI)V", cancellable = true)
    private void submit_1879593080(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1879593080L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getExtents(Ljava/util/function/Consumer;)V", cancellable = true)
    private void getExtents__1562637321(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1562637321L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractArgument(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/core/component/DataComponentMap;", cancellable = true)
    private void extractArgument_2007499788(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2007499788L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractArgument(Lnet/minecraft/world/item/ItemStack;)Ljava/lang/Object;", cancellable = true)
    private void extractArgument_802204016(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(802204016L))
            info.setReturnValue(new java.lang.Object());
    }


}
