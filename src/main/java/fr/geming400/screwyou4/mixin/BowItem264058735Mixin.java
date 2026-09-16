package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.BowItem.class)
public class BowItem264058735Mixin {
        @Inject(at = @At("HEAD"), method = "use(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void use_1748925675(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1748925675L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAllSupportedProjectiles()Ljava/util/function/Predicate;", cancellable = true)
    private void getAllSupportedProjectiles__1884495452(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1884495452L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "releaseUsing(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/LivingEntity;I)Z", cancellable = true)
    private void releaseUsing_1996248342(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1996248342L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getUseDuration(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;)I", cancellable = true)
    private void getUseDuration_2055936837(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2055936837L))
            info.setReturnValue(-485404504);
    }

    @Inject(at = @At("HEAD"), method = "getPowerForTime(I)F", cancellable = true)
    private static void getPowerForTime_899908394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(899908394L))
            info.setReturnValue(5.331236E8F);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultProjectileRange()I", cancellable = true)
    private void getDefaultProjectileRange__1002046548(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1002046548L))
            info.setReturnValue(-1582176071);
    }

    @Inject(at = @At("HEAD"), method = "getUseAnimation(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/item/ItemUseAnimation;", cancellable = true)
    private void getUseAnimation__473756086(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-473756086L))
            info.setReturnValue(net.minecraft.world.item.ItemUseAnimation.CROSSBOW);
    }


}
