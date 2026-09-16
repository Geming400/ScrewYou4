package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.worldupdate.UpgradeProgress.class)
public class UpgradeProgress512402907Mixin {
        @Inject(at = @At("HEAD"), method = "reset(Lnet/minecraft/util/datafix/DataFixTypes;)V", cancellable = true)
    private void reset__1784356119(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1784356119L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/util/worldupdate/UpgradeProgress$Type;", cancellable = true)
    private void getType_1089343853(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1089343853L))
            info.setReturnValue(net.minecraft.util.worldupdate.UpgradeProgress.Type.LEGACY_STRUCTURES);
    }

    @Inject(at = @At("HEAD"), method = "getStatus()Lnet/minecraft/util/worldupdate/UpgradeProgress$Status;", cancellable = true)
    private void getStatus__1644126531(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1644126531L))
            info.setReturnValue(net.minecraft.util.worldupdate.UpgradeProgress.Status.COUNTING);
    }

    @Inject(at = @At("HEAD"), method = "setType(Lnet/minecraft/util/worldupdate/UpgradeProgress$Type;)V", cancellable = true)
    private void setType__1754952033(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1754952033L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isFinished()Z", cancellable = true)
    private void isFinished_1446627670(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1446627670L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getSkipped()I", cancellable = true)
    private void getSkipped_1043768583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1043768583L))
            info.setReturnValue(1336111055);
    }

    @Inject(at = @At("HEAD"), method = "isCanceled()Z", cancellable = true)
    private void isCanceled_389121423(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(389121423L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setStatus(Lnet/minecraft/util/worldupdate/UpgradeProgress$Status;)V", cancellable = true)
    private void setStatus__1816869089(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1816869089L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addTotalFileFixOperations(I)V", cancellable = true)
    private void addTotalFileFixOperations_780805225(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(780805225L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "incrementFinishedOperations()V", cancellable = true)
    private void incrementFinishedOperations_1540787425(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1540787425L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "incrementFinishedOperationsBy(I)V", cancellable = true)
    private void incrementFinishedOperationsBy__673514741(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-673514741L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getConverted()I", cancellable = true)
    private void getConverted__978064795(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-978064795L))
            info.setReturnValue(-1163158465);
    }

    @Inject(at = @At("HEAD"), method = "getDimensionProgress(Lnet/minecraft/resources/ResourceKey;)F", cancellable = true)
    private void getDimensionProgress__371077697(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-371077697L))
            info.setReturnValue(6.103062E8F);
    }

    @Inject(at = @At("HEAD"), method = "getTotalChunks()I", cancellable = true)
    private void getTotalChunks_1747839341(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1747839341L))
            info.setReturnValue(2029822021);
    }

    @Inject(at = @At("HEAD"), method = "setDimensionProgress(Lnet/minecraft/resources/ResourceKey;F)V", cancellable = true)
    private void setDimensionProgress_710001775(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(710001775L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTypeFileFixStats()Lnet/minecraft/util/worldupdate/UpgradeProgress$FileFixStats;", cancellable = true)
    private void getTypeFileFixStats_232963195(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(232963195L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDataFixType()Lnet/minecraft/util/datafix/DataFixTypes;", cancellable = true)
    private void getDataFixType__843160571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-843160571L))
            info.setReturnValue(net.minecraft.util.datafix.DataFixTypes.OPTIONS);
    }

    @Inject(at = @At("HEAD"), method = "setFinished(Z)V", cancellable = true)
    private void setFinished__281906036(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-281906036L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTotalProgress()F", cancellable = true)
    private void getTotalProgress_612050819(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(612050819L))
            info.setReturnValue(6.103062E8F);
    }

    @Inject(at = @At("HEAD"), method = "setTotalProgress(F)V", cancellable = true)
    private void setTotalProgress_644755347(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(644755347L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "incrementRunningFileFixer()V", cancellable = true)
    private void incrementRunningFileFixer_2094613592(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2094613592L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setCanceled()V", cancellable = true)
    private void setCanceled__433569197(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-433569197L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setApplicableFixerAmount(I)V", cancellable = true)
    private void setApplicableFixerAmount__2110373792(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2110373792L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRunningFileFixerStats()Lnet/minecraft/util/worldupdate/UpgradeProgress$FileFixStats;", cancellable = true)
    private void getRunningFileFixerStats__1435609553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1435609553L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "logProgress()V", cancellable = true)
    private void logProgress_2037987741(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2037987741L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTotalFileFixStats()Lnet/minecraft/util/worldupdate/UpgradeProgress$FileFixStats;", cancellable = true)
    private void getTotalFileFixStats_315071325(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(315071325L))
            info.setReturnValue(new net.minecraft.util.worldupdate.UpgradeProgress.FileFixStats());
    }

    @Inject(at = @At("HEAD"), method = "incrementSkipped()V", cancellable = true)
    private void incrementSkipped_495809645(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(495809645L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "incrementConverted()V", cancellable = true)
    private void incrementConverted_702379915(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(702379915L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addTotalChunks(I)V", cancellable = true)
    private void addTotalChunks__2040247568(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2040247568L))
            info.cancel();
    }


}
