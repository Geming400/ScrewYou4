package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.Creeper.class)
public class Creeper_1062546144Mixin {
        @Inject(at = @At("HEAD"), method = "setTarget(Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void setTarget_1384209474(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1384209474L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1100820882(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1100820882L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isIgnited()Z", cancellable = true)
    private void isIgnited_1100824726(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1100824726L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getSwelling(F)F", cancellable = true)
    private void getSwelling__2021290120(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2021290120L))
            info.setReturnValue(6.793835E8F);
    }

    @Inject(at = @At("HEAD"), method = "setSwellDir(I)V", cancellable = true)
    private void setSwellDir__2018504181(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2018504181L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSwellDir()I", cancellable = true)
    private void getSwellDir_1100808389(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1100808389L))
            info.setReturnValue(2087853414);
    }

    @Inject(at = @At("HEAD"), method = "thunderHit(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LightningBolt;)V", cancellable = true)
    private void thunderHit_132526126(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(132526126L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "ignite()V", cancellable = true)
    private void ignite_1100820882(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1100820882L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "causeFallDamage(DFLnet/minecraft/world/damagesource/DamageSource;)Z", cancellable = true)
    private void causeFallDamage_584405165(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(584405165L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "killedEntity(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/damagesource/DamageSource;)Z", cancellable = true)
    private void killedEntity__1548902256(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1548902256L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getMaxFallDistance()I", cancellable = true)
    private void getMaxFallDistance_1100808389(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1100808389L))
            info.setReturnValue(2087853414);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_362327698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(362327698L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "doHurtTarget(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void doHurtTarget__1588381442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1588381442L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isPowered()Z", cancellable = true)
    private void isPowered_1100824726(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1100824726L))
            info.setReturnValue(true);
    }


}
