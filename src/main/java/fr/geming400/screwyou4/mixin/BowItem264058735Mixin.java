package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.BowItem.class)
public class BowItem264058735Mixin {
        @Inject(at = @At("HEAD"), method = "use(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void use_674434770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(674434770L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAllSupportedProjectiles()Ljava/util/function/Predicate;", cancellable = true)
    private void getAllSupportedProjectiles__385826243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-385826243L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUseDuration(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;)I", cancellable = true)
    private void getUseDuration__633121920(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-633121920L))
            info.setReturnValue(48811335);
    }

    @Inject(at = @At("HEAD"), method = "releaseUsing(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/LivingEntity;I)Z", cancellable = true)
    private void releaseUsing__1569570599(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1569570599L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultProjectileRange()I", cancellable = true)
    private void getDefaultProjectileRange_302320981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(302320981L))
            info.setReturnValue(-1205304043);
    }

    @Inject(at = @At("HEAD"), method = "getPowerForTime(I)F", cancellable = true)
    private static void getPowerForTime_1477960579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1477960579L))
            info.setReturnValue(6.353522E8F);
    }

    @Inject(at = @At("HEAD"), method = "getUseAnimation(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/item/ItemUseAnimation;", cancellable = true)
    private void getUseAnimation_823890269(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(823890269L))
            info.setReturnValue(net.minecraft.world.item.ItemUseAnimation.TRIDENT);
    }


}
