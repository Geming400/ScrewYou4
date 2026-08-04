package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.jfr.parse.JfrStatsResult.class)
public class JfrStatsResult_2093656366Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__815798672(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-815798672L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_958196390(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(958196390L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2131919107(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2131919107L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asJson()Ljava/lang/String;", cancellable = true)
    private void asJson_958195894(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(958195894L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fps()Ljava/util/List;", cancellable = true)
    private void fps__574974115(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-574974115L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readChunks()Lnet/minecraft/util/profiling/jfr/stats/IoSummary;", cancellable = true)
    private void readChunks__608888090(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-608888090L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fileWrites()Lnet/minecraft/util/profiling/jfr/stats/FileIOStat$Summary;", cancellable = true)
    private void fileWrites__1344576818(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1344576818L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fileReads()Lnet/minecraft/util/profiling/jfr/stats/FileIOStat$Summary;", cancellable = true)
    private void fileReads__1344576818(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1344576818L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "recordingStarted()Ljava/time/Instant;", cancellable = true)
    private void recordingStarted__1104076731(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1104076731L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "structureGenStats()Ljava/util/List;", cancellable = true)
    private void structureGenStats__574974115(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-574974115L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writtenChunks()Lnet/minecraft/util/profiling/jfr/stats/IoSummary;", cancellable = true)
    private void writtenChunks__608888090(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-608888090L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "recordingEnded()Ljava/time/Instant;", cancellable = true)
    private void recordingEnded__1104076731(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1104076731L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chunkGenStats()Ljava/util/List;", cancellable = true)
    private void chunkGenStats__574974115(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-574974115L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "serverTickTimes()Ljava/util/List;", cancellable = true)
    private void serverTickTimes__574974115(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-574974115L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "worldCreationDuration()Ljava/time/Duration;", cancellable = true)
    private void worldCreationDuration__938146190(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-938146190L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sentPacketsSummary()Lnet/minecraft/util/profiling/jfr/stats/IoSummary;", cancellable = true)
    private void sentPacketsSummary__608888090(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-608888090L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cpuLoadStats()Ljava/util/List;", cancellable = true)
    private void cpuLoadStats__574974115(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-574974115L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "heapSummary()Lnet/minecraft/util/profiling/jfr/stats/GcHeapStat$Summary;", cancellable = true)
    private void heapSummary_107871432(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(107871432L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chunkGenSummary()Ljava/util/List;", cancellable = true)
    private void chunkGenSummary__574974115(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-574974115L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "recordingDuration()Ljava/time/Duration;", cancellable = true)
    private void recordingDuration__938146190(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-938146190L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "threadAllocationSummary()Lnet/minecraft/util/profiling/jfr/stats/ThreadAllocationStat$Summary;", cancellable = true)
    private void threadAllocationSummary_154814182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(154814182L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "receivedPacketsSummary()Lnet/minecraft/util/profiling/jfr/stats/IoSummary;", cancellable = true)
    private void receivedPacketsSummary__608888090(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-608888090L))
            info.setReturnValue(null);
    }


}
