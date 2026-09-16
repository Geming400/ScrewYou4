package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.jfr.parse.JfrStatsResult.class)
public class JfrStatsResult_2093656366Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1185030097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1185030097L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1430887406(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1430887406L))
            info.setReturnValue("o");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1643958840(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1643958840L))
            info.setReturnValue(-743610665);
    }

    @Inject(at = @At("HEAD"), method = "asJson()Ljava/lang/String;", cancellable = true)
    private void asJson_1211934064(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1211934064L))
            info.setReturnValue("3M88z[y,[\uC24C,/?fG7\u0E38\u9E5DPvd78!2ClD");
    }

    @Inject(at = @At("HEAD"), method = "fps()Ljava/util/List;", cancellable = true)
    private void fps__256535098(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-256535098L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readChunks()Lnet/minecraft/util/profiling/jfr/stats/IoSummary;", cancellable = true)
    private void readChunks_965396162(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(965396162L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fileReads()Lnet/minecraft/util/profiling/jfr/stats/FileIOStat$Summary;", cancellable = true)
    private void fileReads_693450029(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(693450029L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fileWrites()Lnet/minecraft/util/profiling/jfr/stats/FileIOStat$Summary;", cancellable = true)
    private void fileWrites_334104510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(334104510L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "recordingStarted()Ljava/time/Instant;", cancellable = true)
    private void recordingStarted_66432245(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(66432245L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "structureGenStats()Ljava/util/List;", cancellable = true)
    private void structureGenStats__1682708449(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1682708449L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "serverTickTimes()Ljava/util/List;", cancellable = true)
    private void serverTickTimes__555617277(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-555617277L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "recordingEnded()Ljava/time/Instant;", cancellable = true)
    private void recordingEnded_904729308(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(904729308L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "worldCreationDuration()Ljava/time/Duration;", cancellable = true)
    private void worldCreationDuration__763259721(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-763259721L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writtenChunks()Lnet/minecraft/util/profiling/jfr/stats/IoSummary;", cancellable = true)
    private void writtenChunks_1760227011(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1760227011L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chunkGenStats()Ljava/util/List;", cancellable = true)
    private void chunkGenStats__242613735(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-242613735L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "recordingDuration()Ljava/time/Duration;", cancellable = true)
    private void recordingDuration__595372521(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-595372521L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "heapSummary()Lnet/minecraft/util/profiling/jfr/stats/GcHeapStat$Summary;", cancellable = true)
    private void heapSummary__1949355666(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1949355666L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "threadAllocationSummary()Lnet/minecraft/util/profiling/jfr/stats/ThreadAllocationStat$Summary;", cancellable = true)
    private void threadAllocationSummary__1362927446(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1362927446L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "receivedPacketsSummary()Lnet/minecraft/util/profiling/jfr/stats/IoSummary;", cancellable = true)
    private void receivedPacketsSummary_1948019298(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1948019298L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chunkGenSummary()Ljava/util/List;", cancellable = true)
    private void chunkGenSummary_801679456(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(801679456L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sentPacketsSummary()Lnet/minecraft/util/profiling/jfr/stats/IoSummary;", cancellable = true)
    private void sentPacketsSummary__156146535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-156146535L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cpuLoadStats()Ljava/util/List;", cancellable = true)
    private void cpuLoadStats__493695122(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-493695122L))
            info.setReturnValue(null);
    }


}
