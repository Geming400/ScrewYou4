package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.worldupdate.UpgradeProgress.Noop.class)
public class Noop_377453359Mixin {
        @Inject(at = @At("HEAD"), method = "reset(Lnet/minecraft/util/datafix/DataFixTypes;)V", cancellable = true)
    private void reset__1919305668(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1919305668L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setFinished(Z)V", cancellable = true)
    private void setFinished__416855585(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-416855585L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTotalProgress(F)V", cancellable = true)
    private void setTotalProgress_509805798(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(509805798L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addTotalChunks(I)V", cancellable = true)
    private void addTotalChunks_2119770179(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2119770179L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "incrementConverted()V", cancellable = true)
    private void incrementConverted_567430366(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(567430366L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setDimensionProgress(Lnet/minecraft/resources/ResourceKey;F)V", cancellable = true)
    private void setDimensionProgress_575052226(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(575052226L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "incrementRunningFileFixer()V", cancellable = true)
    private void incrementRunningFileFixer_1959664043(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1959664043L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setCanceled()V", cancellable = true)
    private void setCanceled__568518746(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-568518746L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "incrementSkipped()V", cancellable = true)
    private void incrementSkipped_360860096(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(360860096L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setApplicableFixerAmount(I)V", cancellable = true)
    private void setApplicableFixerAmount_2049643955(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2049643955L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setStatus(Lnet/minecraft/util/worldupdate/UpgradeProgress$Status;)V", cancellable = true)
    private void setStatus__1951818638(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1951818638L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addTotalFileFixOperations(I)V", cancellable = true)
    private void addTotalFileFixOperations_645855676(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(645855676L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "incrementFinishedOperationsBy(I)V", cancellable = true)
    private void incrementFinishedOperationsBy__808464290(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-808464290L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "incrementFinishedOperations()V", cancellable = true)
    private void incrementFinishedOperations_1405837876(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1405837876L))
            info.cancel();
    }


}
