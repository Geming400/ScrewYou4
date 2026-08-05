package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.worldupdate.UpgradeProgress.class)
public class UpgradeProgress512402907Mixin {
        @Inject(at = @At("HEAD"), method = "reset(Lnet/minecraft/util/datafix/DataFixTypes;)V", cancellable = true)
    private void reset_1453832154(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1453832154L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/util/worldupdate/UpgradeProgress$Type;", cancellable = true)
    private void getType_881083165(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(881083165L))
            info.setReturnValue(net.minecraft.util.worldupdate.UpgradeProgress.Type.REGIONS);
    }

    @Inject(at = @At("HEAD"), method = "getStatus()Lnet/minecraft/util/worldupdate/UpgradeProgress$Status;", cancellable = true)
    private void getStatus_45384357(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(45384357L))
            info.setReturnValue(net.minecraft.util.worldupdate.UpgradeProgress.Status.COUNTING);
    }

    @Inject(at = @At("HEAD"), method = "setType(Lnet/minecraft/util/worldupdate/UpgradeProgress$Type;)V", cancellable = true)
    private void setType_1906045667(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1906045667L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "incrementFinishedOperations()V", cancellable = true)
    private void incrementFinishedOperations_550677646(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(550677646L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "incrementFinishedOperationsBy(I)V", cancellable = true)
    private void incrementFinishedOperationsBy_1726319879(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1726319879L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setStatus(Lnet/minecraft/util/worldupdate/UpgradeProgress$Status;)V", cancellable = true)
    private void setStatus_1974117931(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1974117931L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isCanceled()Z", cancellable = true)
    private void isCanceled_550681490(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(550681490L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "addTotalFileFixOperations(I)V", cancellable = true)
    private void addTotalFileFixOperations_1726319879(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1726319879L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRunningFileFixerStats()Lnet/minecraft/util/worldupdate/UpgradeProgress$FileFixStats;", cancellable = true)
    private void getRunningFileFixerStats_164764849(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(164764849L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTotalProgress()F", cancellable = true)
    private void getTotalProgress_550662270(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(550662270L))
            info.setReturnValue(8.152628E8F);
    }

    @Inject(at = @At("HEAD"), method = "setFinished(Z)V", cancellable = true)
    private void setFinished_1742019736(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1742019736L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTypeFileFixStats()Lnet/minecraft/util/worldupdate/UpgradeProgress$FileFixStats;", cancellable = true)
    private void getTypeFileFixStats_164764849(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(164764849L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "logProgress()V", cancellable = true)
    private void logProgress_550677646(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(550677646L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTotalFileFixStats()Lnet/minecraft/util/worldupdate/UpgradeProgress$FileFixStats;", cancellable = true)
    private void getTotalFileFixStats_164764849(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(164764849L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDataFixType()Lnet/minecraft/util/datafix/DataFixTypes;", cancellable = true)
    private void getDataFixType__527569836(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-527569836L))
            info.setReturnValue(net.minecraft.util.datafix.DataFixTypes.SAVED_DATA_WORLD_GEN_SETTINGS);
    }

    @Inject(at = @At("HEAD"), method = "getDimensionProgress(Lnet/minecraft/resources/ResourceKey;)F", cancellable = true)
    private void getDimensionProgress_700056834(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(700056834L))
            info.setReturnValue(8.152628E8F);
    }

    @Inject(at = @At("HEAD"), method = "addTotalChunks(I)V", cancellable = true)
    private void addTotalChunks_1726319879(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1726319879L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTotalChunks()I", cancellable = true)
    private void getTotalChunks_550665153(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(550665153L))
            info.setReturnValue(1482813745);
    }

    @Inject(at = @At("HEAD"), method = "setCanceled()V", cancellable = true)
    private void setCanceled_550677646(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(550677646L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "incrementConverted()V", cancellable = true)
    private void incrementConverted_550677646(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(550677646L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setDimensionProgress(Lnet/minecraft/resources/ResourceKey;F)V", cancellable = true)
    private void setDimensionProgress_2059813504(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2059813504L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTotalProgress(F)V", cancellable = true)
    private void setTotalProgress_1723549316(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1723549316L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getConverted()I", cancellable = true)
    private void getConverted_550665153(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(550665153L))
            info.setReturnValue(1482813745);
    }

    @Inject(at = @At("HEAD"), method = "setApplicableFixerAmount(I)V", cancellable = true)
    private void setApplicableFixerAmount_1726319879(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1726319879L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "incrementRunningFileFixer()V", cancellable = true)
    private void incrementRunningFileFixer_550677646(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(550677646L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "incrementSkipped()V", cancellable = true)
    private void incrementSkipped_550677646(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(550677646L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSkipped()I", cancellable = true)
    private void getSkipped_550665153(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(550665153L))
            info.setReturnValue(1482813745);
    }

    @Inject(at = @At("HEAD"), method = "isFinished()Z", cancellable = true)
    private void isFinished_550681490(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(550681490L))
            info.setReturnValue(true);
    }


}
