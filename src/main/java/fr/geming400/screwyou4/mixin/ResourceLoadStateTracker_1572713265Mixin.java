package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.ResourceLoadStateTracker.class)
public class ResourceLoadStateTracker_1572713265Mixin {
        @Inject(at = @At("HEAD"), method = "startRecovery(Ljava/lang/Throwable;)V", cancellable = true)
    private void startRecovery_1853319845(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1853319845L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fillCrashReport(Lnet/minecraft/CrashReport;)V", cancellable = true)
    private void fillCrashReport_1851564523(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1851564523L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "finishReload()V", cancellable = true)
    private void finishReload__311697065(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-311697065L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startReload(Lnet/minecraft/client/ResourceLoadStateTracker$ReloadReason;Ljava/util/List;)V", cancellable = true)
    private void startReload__1759401518(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1759401518L))
            info.cancel();
    }


}
