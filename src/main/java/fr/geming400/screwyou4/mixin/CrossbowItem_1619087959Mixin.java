package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.CrossbowItem.class)
public class CrossbowItem_1619087959Mixin {
        @Inject(at = @At("HEAD"), method = "use(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void use__1191012398(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1191012398L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onUseTick(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;I)V", cancellable = true)
    private void onUseTick_2092154721(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2092154721L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAllSupportedProjectiles()Ljava/util/function/Predicate;", cancellable = true)
    private void getAllSupportedProjectiles__529466229(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-529466229L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "performShooting(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/InteractionHand;Lnet/minecraft/world/item/ItemStack;FFLnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void performShooting__1430644342(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1430644342L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDefaultProjectileRange()I", cancellable = true)
    private void getDefaultProjectileRange_352982675(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(352982675L))
            info.setReturnValue(1207764644);
    }

    @Inject(at = @At("HEAD"), method = "getChargeDuration(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;)I", cancellable = true)
    private static void getChargeDuration__422457027(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-422457027L))
            info.setReturnValue(-326985178);
    }

    @Inject(at = @At("HEAD"), method = "useOnRelease(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void useOnRelease__784470031(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-784470031L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getUseDuration(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;)I", cancellable = true)
    private void getUseDuration__884001236(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-884001236L))
            info.setReturnValue(-582416278);
    }

    @Inject(at = @At("HEAD"), method = "releaseUsing(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/LivingEntity;I)Z", cancellable = true)
    private void releaseUsing__943689731(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-943689731L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getSupportedHeldProjectiles()Ljava/util/function/Predicate;", cancellable = true)
    private void getSupportedHeldProjectiles_2120516097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2120516097L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isCharged(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private static void isCharged_1884066372(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1884066372L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getUseAnimation(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/item/ItemUseAnimation;", cancellable = true)
    private void getUseAnimation_881273137(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(881273137L))
            info.setReturnValue(net.minecraft.world.item.ItemUseAnimation.TRIDENT);
    }


}
