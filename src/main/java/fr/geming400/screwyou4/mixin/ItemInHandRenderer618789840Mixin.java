package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.ItemInHandRenderer.class)
public class ItemInHandRenderer618789840Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_657064579(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(657064579L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "itemUsed(Lnet/minecraft/world/InteractionHand;)V", cancellable = true)
    private void itemUsed_1579798154(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1579798154L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "renderItem(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemDisplayContext;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;I)V", cancellable = true)
    private void renderItem_1395840837(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1395840837L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitHandsWithItems(FLcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/player/LocalPlayer;I)V", cancellable = true)
    private void submitHandsWithItems_709052265(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(709052265L))
            info.cancel();
    }


}
