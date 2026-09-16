package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.SpyglassItem.class)
public class SpyglassItem_1137537313Mixin {
        @Inject(at = @At("HEAD"), method = "use(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void use__1672563044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1672563044L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "finishUsingItem(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/LivingEntity;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void finishUsingItem__319372958(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-319372958L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "releaseUsing(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/LivingEntity;I)Z", cancellable = true)
    private void releaseUsing__1425240377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1425240377L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getUseDuration(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;)I", cancellable = true)
    private void getUseDuration__1365551882(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1365551882L))
            info.setReturnValue(17693882);
    }

    @Inject(at = @At("HEAD"), method = "getUseAnimation(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/item/ItemUseAnimation;", cancellable = true)
    private void getUseAnimation_399722491(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(399722491L))
            info.setReturnValue(net.minecraft.world.item.ItemUseAnimation.BUNDLE);
    }


}
