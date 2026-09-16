package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.ItemInHandRenderer.class)
public class ItemInHandRenderer618789840Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_489106182(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(489106182L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitHandsWithItems(FLcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/player/LocalPlayer;I)V", cancellable = true)
    private void submitHandsWithItems__1408024393(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1408024393L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "itemUsed(Lnet/minecraft/world/InteractionHand;)V", cancellable = true)
    private void itemUsed__1731519494(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1731519494L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "renderItem(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemDisplayContext;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;I)V", cancellable = true)
    private void renderItem__1371051506(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1371051506L))
            info.cancel();
    }


}
