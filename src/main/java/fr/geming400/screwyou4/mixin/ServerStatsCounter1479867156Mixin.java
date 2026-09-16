package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.stats.ServerStatsCounter.class)
public class ServerStatsCounter1479867156Mixin {
        @Inject(at = @At("HEAD"), method = "save()V", cancellable = true)
    private void save_1610983018(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1610983018L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setValue(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/stats/Stat;I)V", cancellable = true)
    private void setValue_330174205(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(330174205L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/datafixers/DataFixer;Lcom/google/gson/JsonElement;)V", cancellable = true)
    private void parse_915792239(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(915792239L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sendStats(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void sendStats__810285106(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-810285106L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "markAllDirty()V", cancellable = true)
    private void markAllDirty__237580311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-237580311L))
            info.cancel();
    }


}
