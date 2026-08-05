package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.ResourceLoadStateTracker.class)
public class ResourceLoadStateTracker_1572713265Mixin {
        @Inject(at = @At("HEAD"), method = "startRecovery(Ljava/lang/Throwable;)V", cancellable = true)
    private void startRecovery_1379943246(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1379943246L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startReload(Lnet/minecraft/client/ResourceLoadStateTracker$ReloadReason;Ljava/util/List;)V", cancellable = true)
    private void startReload_1106528525(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1106528525L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fillCrashReport(Lnet/minecraft/CrashReport;)V", cancellable = true)
    private void fillCrashReport_405357491(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(405357491L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "finishReload()V", cancellable = true)
    private void finishReload_1610988003(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1610988003L))
            info.cancel();
    }


}
