package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.worldupdate.UpgradeProgress.Noop.class)
public class Noop_377453359Mixin {
        @Inject(at = @At("HEAD"), method = "reset(Lnet/minecraft/util/datafix/DataFixTypes;)V", cancellable = true)
    private void reset_1318882605(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1318882605L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setCanceled()V", cancellable = true)
    private void setCanceled_415728097(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(415728097L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setStatus(Lnet/minecraft/util/worldupdate/UpgradeProgress$Status;)V", cancellable = true)
    private void setStatus_1839168382(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1839168382L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "incrementRunningFileFixer()V", cancellable = true)
    private void incrementRunningFileFixer_415728097(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(415728097L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setApplicableFixerAmount(I)V", cancellable = true)
    private void setApplicableFixerAmount_1591370330(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1591370330L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addTotalFileFixOperations(I)V", cancellable = true)
    private void addTotalFileFixOperations_1591370330(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1591370330L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "incrementFinishedOperations()V", cancellable = true)
    private void incrementFinishedOperations_415728097(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(415728097L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "incrementFinishedOperationsBy(I)V", cancellable = true)
    private void incrementFinishedOperationsBy_1591370330(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1591370330L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "incrementConverted()V", cancellable = true)
    private void incrementConverted_415728097(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(415728097L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "incrementSkipped()V", cancellable = true)
    private void incrementSkipped_415728097(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(415728097L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setDimensionProgress(Lnet/minecraft/resources/ResourceKey;F)V", cancellable = true)
    private void setDimensionProgress_1924863955(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1924863955L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTotalProgress(F)V", cancellable = true)
    private void setTotalProgress_1588599767(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1588599767L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addTotalChunks(I)V", cancellable = true)
    private void addTotalChunks_1591370330(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1591370330L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setFinished(Z)V", cancellable = true)
    private void setFinished_1607070187(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1607070187L))
            info.cancel();
    }


}
