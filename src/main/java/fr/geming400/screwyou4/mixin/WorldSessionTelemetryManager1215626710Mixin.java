package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.telemetry.WorldSessionTelemetryManager.class)
public class WorldSessionTelemetryManager1215626710Mixin {
        @Inject(at = @At("HEAD"), method = "setTime(J)V", cancellable = true)
    private void setTime__1864500093(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1864500093L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1253901449(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1253901449L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "worldSessionStart()V", cancellable = true)
    private void worldSessionStart_1253901449(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1253901449L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onAdvancementDone(Lnet/minecraft/world/level/Level;Lnet/minecraft/advancements/AdvancementHolder;)V", cancellable = true)
    private void onAdvancementDone__522834749(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-522834749L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onServerBrandReceived(Ljava/lang/String;)V", cancellable = true)
    private void onServerBrandReceived__1926979437(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1926979437L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onDisconnect()V", cancellable = true)
    private void onDisconnect_1253901449(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1253901449L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onPlayerInfoReceived(Lnet/minecraft/world/level/GameType;Z)V", cancellable = true)
    private void onPlayerInfoReceived_303367692(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(303367692L))
            info.cancel();
    }


}
