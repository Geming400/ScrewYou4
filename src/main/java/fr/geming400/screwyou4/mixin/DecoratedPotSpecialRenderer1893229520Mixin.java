package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.special.DecoratedPotSpecialRenderer.class)
public class DecoratedPotSpecialRenderer1893229520Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Ljava/lang/Object;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;IIZI)V", cancellable = true)
    private void submit__2132075114(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2132075114L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/world/level/block/entity/PotDecorations;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;IIZI)V", cancellable = true)
    private void submit_1138887877(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1138887877L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractArgument(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/level/block/entity/PotDecorations;", cancellable = true)
    private void extractArgument__1139981665(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1139981665L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractArgument(Lnet/minecraft/world/item/ItemStack;)Ljava/lang/Object;", cancellable = true)
    private void extractArgument_484752004(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(484752004L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExtents(Ljava/util/function/Consumer;)V", cancellable = true)
    private void getExtents_1553460672(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1553460672L))
            info.cancel();
    }


}
