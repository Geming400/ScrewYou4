package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.special.DecoratedPotSpecialRenderer.class)
public class DecoratedPotSpecialRenderer1893229520Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Ljava/lang/Object;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;IIZI)V", cancellable = true)
    private void submit_1721509038(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1721509038L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/world/level/block/entity/PotDecorations;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;IIZI)V", cancellable = true)
    private void submit_718804141(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(718804141L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getExtents(Ljava/util/function/Consumer;)V", cancellable = true)
    private void getExtents__1720721363(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1720721363L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractArgument(Lnet/minecraft/world/item/ItemStack;)Ljava/lang/Object;", cancellable = true)
    private void extractArgument_644119974(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(644119974L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractArgument(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/level/block/entity/PotDecorations;", cancellable = true)
    private void extractArgument__533451587(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-533451587L))
            info.setReturnValue(null);
    }


}
