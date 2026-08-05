package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.allay.Allay.class)
public class Allay_76538837Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_114813575(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(114813575L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateDynamicGameEventListener(Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void updateDynamicGameEventListener__1661612054(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1661612054L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "travel(Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void travel_444274835(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(444274835L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isFlapping()Z", cancellable = true)
    private void isFlapping_114817419(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(114817419L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer__372891495(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-372891495L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep_114813575(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(114813575L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBrain()Lnet/minecraft/world/entity/ai/Brain;", cancellable = true)
    private void getBrain_1669515694(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1669515694L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handleEntityEvent(B)V", cancellable = true)
    private void handleEntityEvent_1283991161(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1283991161L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__623679609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-623679609L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getInventory()Lnet/minecraft/world/SimpleContainer;", cancellable = true)
    private void getInventory__550488774(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-550488774L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equipmentHasChanged(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void equipmentHasChanged_1322135381(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1322135381L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canPickUpLoot()Z", cancellable = true)
    private void canPickUpLoot_114817419(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(114817419L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getHoldingItemAnimationProgress(F)F", cancellable = true)
    private void getHoldingItemAnimationProgress_1287669869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1287669869L))
            info.setReturnValue(7.918337E8F);
    }

    @Inject(at = @At("HEAD"), method = "getVibrationUser()Lnet/minecraft/world/level/gameevent/vibrations/VibrationSystem$User;", cancellable = true)
    private void getVibrationUser__905940353(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-905940353L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getVibrationData()Lnet/minecraft/world/level/gameevent/vibrations/VibrationSystem$Data;", cancellable = true)
    private void getVibrationData_684387904(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(684387904L))
            info.setReturnValue(new net.minecraft.world.level.gameevent.vibrations.VibrationSystem.Data());
    }

    @Inject(at = @At("HEAD"), method = "wantsToPickUp(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void wantsToPickUp__1939826431(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1939826431L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "removeWhenFarAway(D)Z", cancellable = true)
    private void removeWhenFarAway_1285842047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1285842047L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getLeashOffset()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getLeashOffset_1174268365(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1174268365L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setDancing(Z)V", cancellable = true)
    private void setDancing_1306155665(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1306155665L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isSpinning()Z", cancellable = true)
    private void isSpinning_114817419(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(114817419L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isDancing()Z", cancellable = true)
    private void isDancing_114817419(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(114817419L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hasItemInHand()Z", cancellable = true)
    private void hasItemInHand_114817419(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(114817419L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setJukeboxPlaying(Lnet/minecraft/core/BlockPos;Z)V", cancellable = true)
    private void setJukeboxPlaying_1056436029(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1056436029L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSpinningProgress(F)F", cancellable = true)
    private void getSpinningProgress_1287669869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1287669869L))
            info.setReturnValue(7.918337E8F);
    }


}
