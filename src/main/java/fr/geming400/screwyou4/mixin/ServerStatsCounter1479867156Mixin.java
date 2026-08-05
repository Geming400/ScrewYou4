package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.stats.ServerStatsCounter.class)
public class ServerStatsCounter1479867156Mixin {
        @Inject(at = @At("HEAD"), method = "save()V", cancellable = true)
    private void save_1518141895(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1518141895L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setValue(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/stats/Stat;I)V", cancellable = true)
    private void setValue_657089422(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(657089422L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/datafixers/DataFixer;Lcom/google/gson/JsonElement;)V", cancellable = true)
    private void parse__1352350462(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1352350462L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "markAllDirty()V", cancellable = true)
    private void markAllDirty_1518141895(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1518141895L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sendStats(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void sendStats_710305303(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(710305303L))
            info.cancel();
    }


}
