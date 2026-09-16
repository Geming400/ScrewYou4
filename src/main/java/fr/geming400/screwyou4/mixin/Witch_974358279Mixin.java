package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.Witch.class)
public class Witch_974358279Mixin {
        @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep__1689311451(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1689311451L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__1945507028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1945507028L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handleEntityEvent(B)V", cancellable = true)
    private void handleEntityEvent_1728106394(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1728106394L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setUsingItem(Z)V", cancellable = true)
    private void setUsingItem__1972916872(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1972916872L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isDrinkingPotion()Z", cancellable = true)
    private void isDrinkingPotion_1376221910(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1376221910L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "performRangedAttack(Lnet/minecraft/world/entity/LivingEntity;F)V", cancellable = true)
    private void performRangedAttack__1937675505(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1937675505L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCelebrateSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getCelebrateSound__1707201686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1707201686L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "applyRaidBuffs(Lnet/minecraft/server/level/ServerLevel;IZ)V", cancellable = true)
    private void applyRaidBuffs_1886131(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1886131L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canBeLeader()Z", cancellable = true)
    private void canBeLeader_271735585(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(271735585L))
            info.setReturnValue(true);
    }


}
