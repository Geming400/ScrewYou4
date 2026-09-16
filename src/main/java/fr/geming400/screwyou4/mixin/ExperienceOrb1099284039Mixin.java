package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ExperienceOrb.class)
public class ExperienceOrb1099284039Mixin {
        @Inject(at = @At("HEAD"), method = "getValue()I", cancellable = true)
    private void getValue__1503135406(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1503135406L))
            info.setReturnValue(1792166978);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_969600381(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(969600381L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer_283996682(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(283996682L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isAttackable()Z", cancellable = true)
    private void isAttackable_1940101906(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1940101906L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "playerTouch(Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void playerTouch_1051170519(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1051170519L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSoundSource()Lnet/minecraft/sounds/SoundSource;", cancellable = true)
    private void getSoundSource__1681426058(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1681426058L))
            info.setReturnValue(net.minecraft.sounds.SoundSource.MUSIC);
    }

    @Inject(at = @At("HEAD"), method = "getInterpolation()Lnet/minecraft/world/entity/InterpolationHandler;", cancellable = true)
    private void getInterpolation_839535772(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(839535772L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockPosBelowThatAffectsMyMovement()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getBlockPosBelowThatAffectsMyMovement__2097535190(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2097535190L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExperienceValue(I)I", cancellable = true)
    private static void getExperienceValue_1530423503(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1530423503L))
            info.setReturnValue(2024830942);
    }

    @Inject(at = @At("HEAD"), method = "awardWithDirection(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;I)V", cancellable = true)
    private static void awardWithDirection__967319562(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-967319562L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "award(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;I)V", cancellable = true)
    private static void award_402179187(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(402179187L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getIcon()I", cancellable = true)
    private void getIcon__353784674(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-353784674L))
            info.setReturnValue(-835763077);
    }

    @Inject(at = @At("HEAD"), method = "hurtClient(Lnet/minecraft/world/damagesource/DamageSource;)Z", cancellable = true)
    private void hurtClient__1620493439(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1620493439L))
            info.setReturnValue(true);
    }


}
