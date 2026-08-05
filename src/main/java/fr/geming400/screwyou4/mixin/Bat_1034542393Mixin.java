package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ambient.Bat.class)
public class Bat_1034542393Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1072817131(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1072817131L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isResting()Z", cancellable = true)
    private void isResting_1072820975(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1072820975L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setResting(Z)V", cancellable = true)
    private void setResting__2030808075(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2030808075L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer_585112061(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(585112061L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isFlapping()Z", cancellable = true)
    private void isFlapping_1072820975(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1072820975L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isPushable()Z", cancellable = true)
    private void isPushable_1072820975(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1072820975L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isIgnoringBlockTriggers()Z", cancellable = true)
    private void isIgnoringBlockTriggers_1072820975(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1072820975L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_334323947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(334323947L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getVoicePitch()F", cancellable = true)
    private void getVoicePitch_1072801755(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1072801755L))
            info.setReturnValue(6.78497E7F);
    }

    @Inject(at = @At("HEAD"), method = "checkBatSpawnRules(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void checkBatSpawnRules_192278698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(192278698L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getAmbientSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getAmbientSound_2124755290(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2124755290L))
            info.setReturnValue(null);
    }


}
