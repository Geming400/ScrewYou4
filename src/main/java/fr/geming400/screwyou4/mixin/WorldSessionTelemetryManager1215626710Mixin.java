package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.telemetry.WorldSessionTelemetryManager.class)
public class WorldSessionTelemetryManager1215626710Mixin {
        @Inject(at = @At("HEAD"), method = "setTime(J)V", cancellable = true)
    private void setTime_1213286290(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1213286290L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1085943052(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1085943052L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onAdvancementDone(Lnet/minecraft/world/level/Level;Lnet/minecraft/advancements/AdvancementHolder;)V", cancellable = true)
    private void onAdvancementDone__1304360474(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1304360474L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onServerBrandReceived(Ljava/lang/String;)V", cancellable = true)
    private void onServerBrandReceived_661308973(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(661308973L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onDisconnect()V", cancellable = true)
    private void onDisconnect_1154612622(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1154612622L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onPlayerInfoReceived(Lnet/minecraft/world/level/GameType;Z)V", cancellable = true)
    private void onPlayerInfoReceived__667679301(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-667679301L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "worldSessionStart()V", cancellable = true)
    private void worldSessionStart_765444907(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(765444907L))
            info.cancel();
    }


}
