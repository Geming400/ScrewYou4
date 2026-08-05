package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.dimension.end.EnderDragonFight.class)
public class EnderDragonFight1594243277Mixin {
        @Inject(at = @At("HEAD"), method = "init(Lnet/minecraft/server/level/ServerLevel;JLnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void init_1577960875(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1577960875L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1632518016(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1632518016L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createDefault()Lnet/minecraft/world/level/dimension/end/EnderDragonFight;", cancellable = true)
    private static void createDefault_1372929509(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1372929509L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tryRespawn()V", cancellable = true)
    private void tryRespawn_1632518016(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1632518016L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasPreviouslyKilledDragon()Z", cancellable = true)
    private void hasPreviouslyKilledDragon_1632521860(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1632521860L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "updateDragon(Lnet/minecraft/world/entity/boss/enderdragon/EnderDragon;)V", cancellable = true)
    private void updateDragon__1009693993(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1009693993L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "aliveCrystals()I", cancellable = true)
    private void aliveCrystals_1632505523(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1632505523L))
            info.setReturnValue(-1227945384);
    }

    @Inject(at = @At("HEAD"), method = "setDragonKilled(Lnet/minecraft/world/entity/boss/enderdragon/EnderDragon;)V", cancellable = true)
    private void setDragonKilled__1009693993(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1009693993L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onCrystalDestroyed(Lnet/minecraft/world/entity/boss/enderdragon/EndCrystal;Lnet/minecraft/world/damagesource/DamageSource;)V", cancellable = true)
    private void onCrystalDestroyed__83999392(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-83999392L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dragonUUID()Ljava/util/UUID;", cancellable = true)
    private void dragonUUID_2005377760(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2005377760L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resetSpikeCrystals()V", cancellable = true)
    private void resetSpikeCrystals_1632518016(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1632518016L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeAllGateways()V", cancellable = true)
    private void removeAllGateways_1632518016(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1632518016L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "skipArenaLoadedCheck()V", cancellable = true)
    private void skipArenaLoadedCheck_1632518016(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1632518016L))
            info.cancel();
    }


}
