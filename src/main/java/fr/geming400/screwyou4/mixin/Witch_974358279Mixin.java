package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.Witch.class)
public class Witch_974358279Mixin {
        @Inject(at = @At("HEAD"), method = "performRangedAttack(Lnet/minecraft/world/entity/LivingEntity;F)V", cancellable = true)
    private void performRangedAttack__1914350849(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1914350849L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_274139833(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(274139833L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep_1012633017(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1012633017L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleEntityEvent(B)V", cancellable = true)
    private void handleEntityEvent__2113156693(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2113156693L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "applyRaidBuffs(Lnet/minecraft/server/level/ServerLevel;IZ)V", cancellable = true)
    private void applyRaidBuffs__2081645061(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2081645061L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCelebrateSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getCelebrateSound_2064571176(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2064571176L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canBeLeader()Z", cancellable = true)
    private void canBeLeader_1012636861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1012636861L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setUsingItem(Z)V", cancellable = true)
    private void setUsingItem__2090992189(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2090992189L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isDrinkingPotion()Z", cancellable = true)
    private void isDrinkingPotion_1012636861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1012636861L))
            info.setReturnValue(null);
    }


}
