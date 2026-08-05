package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.SpyglassItem.class)
public class SpyglassItem_1137537313Mixin {
        @Inject(at = @At("HEAD"), method = "use(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void use_1547913347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1547913347L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUseAnimation(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/item/ItemUseAnimation;", cancellable = true)
    private void getUseAnimation_1697368846(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1697368846L))
            info.setReturnValue(net.minecraft.world.item.ItemUseAnimation.NONE);
    }

    @Inject(at = @At("HEAD"), method = "releaseUsing(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/LivingEntity;I)Z", cancellable = true)
    private void releaseUsing__696092022(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-696092022L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getUseDuration(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;)I", cancellable = true)
    private void getUseDuration_240356657(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(240356657L))
            info.setReturnValue(-21542099);
    }

    @Inject(at = @At("HEAD"), method = "finishUsingItem(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/LivingEntity;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void finishUsingItem__97455618(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-97455618L))
            info.setReturnValue(null);
    }


}
