package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.jfr.stats.FileIOStat.class)
public class FileIOStat424235658Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__484390610(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-484390610L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1194659183(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1194659183L))
            info.setReturnValue("\u6FC6.hUXuC$AO`\u6046jwJP\u779EC>\uC2D8u{L\u749FzE=nJbqjH?@nX9\u9B3C$*GJ\u66FE\uD538:H-A3\uA19Bif");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_981587749(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(981587749L))
            info.setReturnValue(-1341205996);
    }

    @Inject(at = @At("HEAD"), method = "bytes()J", cancellable = true)
    private void bytes_1763833510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1763833510L))
            info.setReturnValue(-4673605523065497343L);
    }

    @Inject(at = @At("HEAD"), method = "duration()Ljava/time/Duration;", cancellable = true)
    private void duration_1424851299(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1424851299L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "path()Ljava/lang/String;", cancellable = true)
    private void path_265821304(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(265821304L))
            info.setReturnValue("FXN#");
    }

    @Inject(at = @At("HEAD"), method = "summary(Ljava/time/Duration;Ljava/util/List;)Lnet/minecraft/util/profiling/jfr/stats/FileIOStat$Summary;", cancellable = true)
    private static void summary_1936030900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1936030900L))
            info.setReturnValue(null);
    }


}
