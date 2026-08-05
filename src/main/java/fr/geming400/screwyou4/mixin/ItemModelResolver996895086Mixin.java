package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.ItemModelResolver.class)
public class ItemModelResolver996895086Mixin {
        @Inject(at = @At("HEAD"), method = "swapAnimationScale(Lnet/minecraft/world/item/ItemStack;)F", cancellable = true)
    private void swapAnimationScale__1563556298(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1563556298L))
            info.setReturnValue(9.652877E8F);
    }

    @Inject(at = @At("HEAD"), method = "shouldPlaySwapAnimation(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void shouldPlaySwapAnimation__1563537078(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1563537078L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "updateForLiving(Lnet/minecraft/client/renderer/item/ItemStackRenderState;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemDisplayContext;Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void updateForLiving_1705933243(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1705933243L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateForNonLiving(Lnet/minecraft/client/renderer/item/ItemStackRenderState;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemDisplayContext;Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void updateForNonLiving__1908835740(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1908835740L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "appendItemLayers(Lnet/minecraft/client/renderer/item/ItemStackRenderState;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemDisplayContext;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/ItemOwner;I)V", cancellable = true)
    private void appendItemLayers__1300353641(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1300353641L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateForTopItem(Lnet/minecraft/client/renderer/item/ItemStackRenderState;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemDisplayContext;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/ItemOwner;I)V", cancellable = true)
    private void updateForTopItem__1300353641(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1300353641L))
            info.cancel();
    }


}
