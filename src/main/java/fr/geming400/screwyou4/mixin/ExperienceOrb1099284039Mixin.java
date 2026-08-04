package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ExperienceOrb.class)
public class ExperienceOrb1099284039Mixin {
        @Inject(at = @At("HEAD"), method = "getValue()I", cancellable = true)
    private void getValue_1137546285(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1137546285L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1137558778(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1137558778L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSoundSource()Lnet/minecraft/sounds/SoundSource;", cancellable = true)
    private void getSoundSource__1193763934(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1193763934L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getInterpolation()Lnet/minecraft/world/entity/InterpolationHandler;", cancellable = true)
    private void getInterpolation_1955719626(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1955719626L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerTouch(Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void playerTouch_2039885685(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2039885685L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isAttackable()Z", cancellable = true)
    private void isAttackable_1137562622(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1137562622L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockPosBelowThatAffectsMyMovement()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getBlockPosBelowThatAffectsMyMovement__794102840(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-794102840L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "award(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;I)V", cancellable = true)
    private static void award_6707120(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(6707120L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getIcon()I", cancellable = true)
    private void getIcon_1137546285(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1137546285L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer_649854204(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(649854204L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hurtClient(Lnet/minecraft/world/damagesource/DamageSource;)Z", cancellable = true)
    private void hurtClient_767614919(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(767614919L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "awardWithDirection(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;I)V", cancellable = true)
    private static void awardWithDirection__190275590(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-190275590L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getExperienceValue(I)I", cancellable = true)
    private static void getExperienceValue__1981778530(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1981778530L))
            info.setReturnValue(null);
    }


}
