package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.CrossbowItem.class)
public class CrossbowItem_1619087959Mixin {
        @Inject(at = @At("HEAD"), method = "use(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void use_2029463993(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2029463993L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSupportedHeldProjectiles()Ljava/util/function/Predicate;", cancellable = true)
    private void getSupportedHeldProjectiles_969202980(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(969202980L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onUseTick(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;I)V", cancellable = true)
    private void onUseTick_929902332(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(929902332L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAllSupportedProjectiles()Ljava/util/function/Predicate;", cancellable = true)
    private void getAllSupportedProjectiles_969202980(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(969202980L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUseDuration(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;)I", cancellable = true)
    private void getUseDuration_721907303(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(721907303L))
            info.setReturnValue(310570865);
    }

    @Inject(at = @At("HEAD"), method = "releaseUsing(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/LivingEntity;I)Z", cancellable = true)
    private void releaseUsing__214541376(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-214541376L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "useOnRelease(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void useOnRelease__941344206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-941344206L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isCharged(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private static void isCharged__941343958(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-941343958L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultProjectileRange()I", cancellable = true)
    private void getDefaultProjectileRange_1657350204(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1657350204L))
            info.setReturnValue(-2070934311);
    }

    @Inject(at = @At("HEAD"), method = "performShooting(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/InteractionHand;Lnet/minecraft/world/item/ItemStack;FFLnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void performShooting__994821650(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-994821650L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getChargeDuration(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;)I", cancellable = true)
    private static void getChargeDuration_721907551(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(721907551L))
            info.setReturnValue(424456540);
    }

    @Inject(at = @At("HEAD"), method = "getUseAnimation(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/item/ItemUseAnimation;", cancellable = true)
    private void getUseAnimation__2116047804(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2116047804L))
            info.setReturnValue(net.minecraft.world.item.ItemUseAnimation.EAT);
    }


}
