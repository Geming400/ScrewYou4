package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.jfr.stats.ChunkGenStat.class)
public class ChunkGenStat_169789045Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1555301303(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1555301303L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__965670931(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-965670931L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_208051786(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(208051786L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "from(Ljdk/jfr/consumer/RecordedEvent;)Lnet/minecraft/util/profiling/jfr/stats/ChunkGenStat;", cancellable = true)
    private static void from_1579883349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1579883349L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "status()Lnet/minecraft/world/level/chunk/status/ChunkStatus;", cancellable = true)
    private void status_187068642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(187068642L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "duration()Ljava/time/Duration;", cancellable = true)
    private void duration_1432953785(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1432953785L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "level()Ljava/lang/String;", cancellable = true)
    private void level__965671427(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-965671427L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chunkPos()Lnet/minecraft/world/level/ChunkPos;", cancellable = true)
    private void chunkPos__719309793(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-719309793L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "worldPos()Lnet/minecraft/server/level/ColumnPos;", cancellable = true)
    private void worldPos_1955607687(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1955607687L))
            info.setReturnValue(null);
    }


}
