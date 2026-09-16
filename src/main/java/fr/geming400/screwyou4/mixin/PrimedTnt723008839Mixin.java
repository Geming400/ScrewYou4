package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.item.PrimedTnt.class)
public class PrimedTnt723008839Mixin {
        @Inject(at = @At("HEAD"), method = "getOwner()Lnet/minecraft/world/entity/LivingEntity;", cancellable = true)
    private void getOwner__1520465337(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1520465337L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOwner()Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void getOwner_1168591088(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1168591088L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_593325181(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(593325181L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer__92278518(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-92278518L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isPickable()Z", cancellable = true)
    private void isPickable__829525543(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-829525543L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getBlockState()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getBlockState__961784401(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-961784401L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "restoreFrom(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void restoreFrom_2016126763(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2016126763L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setBlockState(Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void setBlockState__528512413(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-528512413L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRandomShortFuse(ILnet/minecraft/util/RandomSource;)I", cancellable = true)
    private static void getRandomShortFuse_1136519592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1136519592L))
            info.setReturnValue(-1183237570);
    }

    @Inject(at = @At("HEAD"), method = "setFuse(I)V", cancellable = true)
    private void setFuse_828277014(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(828277014L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFuse()I", cancellable = true)
    private void getFuse_700536246(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(700536246L))
            info.setReturnValue(1820070116);
    }

    @Inject(at = @At("HEAD"), method = "teleport(Lnet/minecraft/world/level/portal/TeleportTransition;)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void teleport__265240408(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-265240408L))
            info.setReturnValue(null);
    }


}
