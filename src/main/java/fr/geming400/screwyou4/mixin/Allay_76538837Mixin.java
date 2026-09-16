package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.allay.Allay.class)
public class Allay_76538837Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick__53144822(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-53144822L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "travel(Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void travel_1826198189(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1826198189L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep_1707836403(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1707836403L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer__738749017(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-738749017L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "handleEntityEvent(B)V", cancellable = true)
    private void handleEntityEvent_830286952(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(830286952L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBrain()Lnet/minecraft/world/entity/ai/Brain;", cancellable = true)
    private void getBrain__109363090(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-109363090L))
            info.setReturnValue(new net.minecraft.world.entity.ai.Brain());
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_1451640826(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1451640826L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder());
    }

    @Inject(at = @At("HEAD"), method = "getInventory()Lnet/minecraft/world/SimpleContainer;", cancellable = true)
    private void getInventory__216638124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-216638124L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateDynamicGameEventListener(Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void updateDynamicGameEventListener_2125847280(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2125847280L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "equipmentHasChanged(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void equipmentHasChanged__1742399123(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1742399123L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canPickUpLoot()Z", cancellable = true)
    private void canPickUpLoot__913603913(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-913603913L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isFlapping()Z", cancellable = true)
    private void isFlapping__33326470(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-33326470L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hasItemInHand()Z", cancellable = true)
    private void hasItemInHand_21898186(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(21898186L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getSpinningProgress(F)F", cancellable = true)
    private void getSpinningProgress_1735307622(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1735307622L))
            info.setReturnValue(7.958241E8F);
    }

    @Inject(at = @At("HEAD"), method = "setJukeboxPlaying(Lnet/minecraft/core/BlockPos;Z)V", cancellable = true)
    private void setJukeboxPlaying__2117507981(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2117507981L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeWhenFarAway(D)Z", cancellable = true)
    private void removeWhenFarAway__581990874(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-581990874L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "wantsToPickUp(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void wantsToPickUp_721318343(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(721318343L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getLeashOffset()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getLeashOffset_1616721779(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1616721779L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getVibrationUser()Lnet/minecraft/world/level/gameevent/vibrations/VibrationSystem$User;", cancellable = true)
    private void getVibrationUser__777632616(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-777632616L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getVibrationData()Lnet/minecraft/world/level/gameevent/vibrations/VibrationSystem$Data;", cancellable = true)
    private void getVibrationData__1026744486(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1026744486L))
            info.setReturnValue(new net.minecraft.world.level.gameevent.vibrations.VibrationSystem.Data());
    }

    @Inject(at = @At("HEAD"), method = "isSpinning()Z", cancellable = true)
    private void isSpinning__814007733(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-814007733L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isDancing()Z", cancellable = true)
    private void isDancing__1718301147(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1718301147L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setDancing(Z)V", cancellable = true)
    private void setDancing__508631809(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-508631809L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHoldingItemAnimationProgress(F)F", cancellable = true)
    private void getHoldingItemAnimationProgress_1212908062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1212908062L))
            info.setReturnValue(7.968333E8F);
    }


}
