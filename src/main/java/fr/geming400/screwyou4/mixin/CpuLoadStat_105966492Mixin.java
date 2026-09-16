package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.jfr.stats.CpuLoadStat.class)
public class CpuLoadStat_105966492Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__802659777(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-802659777L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_876390016(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(876390016L))
            info.setReturnValue("\u87BA/*C{ Y0]V<wc?\u29A98g");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_663318582(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(663318582L))
            info.setReturnValue(1946854014);
    }

    @Inject(at = @At("HEAD"), method = "from(Ljdk/jfr/consumer/RecordedEvent;)Lnet/minecraft/util/profiling/jfr/stats/CpuLoadStat;", cancellable = true)
    private static void from__1343858163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1343858163L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "system()D", cancellable = true)
    private void system__1482210835(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1482210835L))
            info.setReturnValue(5.639801007231297E8D);
    }

    @Inject(at = @At("HEAD"), method = "userJvm()D", cancellable = true)
    private void userJvm__97573978(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-97573978L))
            info.setReturnValue(5.639801002558734E8D);
    }

    @Inject(at = @At("HEAD"), method = "jvm()D", cancellable = true)
    private void jvm_670355131(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(670355131L))
            info.setReturnValue(5.639801007586058E8D);
    }


}
