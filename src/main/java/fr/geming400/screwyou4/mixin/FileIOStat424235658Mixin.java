package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.jfr.stats.FileIOStat.class)
public class FileIOStat424235658Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1809747917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1809747917L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__711224317(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-711224317L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_462498400(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(462498400L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bytes()J", cancellable = true)
    private void bytes_462498865(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(462498865L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "duration()Ljava/time/Duration;", cancellable = true)
    private void duration_1687400399(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1687400399L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "path()Ljava/lang/String;", cancellable = true)
    private void path__711224813(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-711224813L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "summary(Ljava/time/Duration;Ljava/util/List;)Lnet/minecraft/util/profiling/jfr/stats/FileIOStat$Summary;", cancellable = true)
    private static void summary__1918319078(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1918319078L))
            info.setReturnValue(null);
    }


}
