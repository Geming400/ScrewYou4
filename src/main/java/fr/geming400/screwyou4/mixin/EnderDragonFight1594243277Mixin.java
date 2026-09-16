package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.dimension.end.EnderDragonFight.class)
public class EnderDragonFight1594243277Mixin {
        @Inject(at = @At("HEAD"), method = "init(Lnet/minecraft/server/level/ServerLevel;JLnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void init_1402345115(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1402345115L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1464559619(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1464559619L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createDefault()Lnet/minecraft/world/level/dimension/end/EnderDragonFight;", cancellable = true)
    private static void createDefault_762492106(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(762492106L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dragonUUID()Ljava/util/UUID;", cancellable = true)
    private void dragonUUID_219928622(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(219928622L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tryRespawn()V", cancellable = true)
    private void tryRespawn__393690957(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-393690957L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resetSpikeCrystals()V", cancellable = true)
    private void resetSpikeCrystals__2017333524(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2017333524L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "skipArenaLoadedCheck()V", cancellable = true)
    private void skipArenaLoadedCheck_389972549(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(389972549L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeAllGateways()V", cancellable = true)
    private void removeAllGateways__354620748(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-354620748L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onCrystalDestroyed(Lnet/minecraft/world/entity/boss/enderdragon/EndCrystal;Lnet/minecraft/world/damagesource/DamageSource;)V", cancellable = true)
    private void onCrystalDestroyed__310075934(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-310075934L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasPreviouslyKilledDragon()Z", cancellable = true)
    private void hasPreviouslyKilledDragon_899326518(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(899326518L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "aliveCrystals()I", cancellable = true)
    private void aliveCrystals__2015023863(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2015023863L))
            info.setReturnValue(2021644835);
    }

    @Inject(at = @At("HEAD"), method = "setDragonKilled(Lnet/minecraft/world/entity/boss/enderdragon/EnderDragon;)V", cancellable = true)
    private void setDragonKilled__152332983(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-152332983L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateDragon(Lnet/minecraft/world/entity/boss/enderdragon/EnderDragon;)V", cancellable = true)
    private void updateDragon_1130803731(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1130803731L))
            info.cancel();
    }


}
