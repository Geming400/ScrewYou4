package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.ItemModelResolver.class)
public class ItemModelResolver996895086Mixin {
        @Inject(at = @At("HEAD"), method = "updateForLiving(Lnet/minecraft/client/renderer/item/ItemStackRenderState;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemDisplayContext;Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void updateForLiving_212481220(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(212481220L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateForNonLiving(Lnet/minecraft/client/renderer/item/ItemStackRenderState;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemDisplayContext;Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void updateForNonLiving_1417947482(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1417947482L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "appendItemLayers(Lnet/minecraft/client/renderer/item/ItemStackRenderState;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemDisplayContext;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/ItemOwner;I)V", cancellable = true)
    private void appendItemLayers__1288141880(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1288141880L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldPlaySwapAnimation(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void shouldPlaySwapAnimation__1752432224(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1752432224L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "swapAnimationScale(Lnet/minecraft/world/item/ItemStack;)F", cancellable = true)
    private void swapAnimationScale_1903826365(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1903826365L))
            info.setReturnValue(4.020185E8F);
    }

    @Inject(at = @At("HEAD"), method = "updateForTopItem(Lnet/minecraft/client/renderer/item/ItemStackRenderState;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemDisplayContext;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/ItemOwner;I)V", cancellable = true)
    private void updateForTopItem__756335121(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-756335121L))
            info.cancel();
    }


}
