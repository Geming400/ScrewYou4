package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.jfr.stats.CpuLoadStat.class)
public class CpuLoadStat_105966492Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1491478750(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1491478750L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1029493484(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1029493484L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_144229233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(144229233L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "from(Ljdk/jfr/consumer/RecordedEvent;)Lnet/minecraft/util/profiling/jfr/stats/CpuLoadStat;", cancellable = true)
    private static void from_1306161251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1306161251L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "system()D", cancellable = true)
    private void system_144223932(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(144223932L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "jvm()D", cancellable = true)
    private void jvm_144223932(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(144223932L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "userJvm()D", cancellable = true)
    private void userJvm_144223932(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(144223932L))
            info.setReturnValue(null);
    }


}
