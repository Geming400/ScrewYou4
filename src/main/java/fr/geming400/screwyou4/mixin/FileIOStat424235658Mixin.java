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
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__711224317(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-711224317L))
            info.setReturnValue("{瘓樉AH-╲JN(QMfb;BD!膅|O9r*8>SZbHY#d>b/`sX\"n$I藕\"퍮6@}1ˉ/n*8I$}aHy?鑥.( %깰]imtZfw");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_462498400(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(462498400L))
            info.setReturnValue(1472511759);
    }

    @Inject(at = @At("HEAD"), method = "bytes()J", cancellable = true)
    private void bytes_462498865(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(462498865L))
            info.setReturnValue(5414011942190600797L);
    }

    @Inject(at = @At("HEAD"), method = "duration()Ljava/time/Duration;", cancellable = true)
    private void duration_1687400399(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1687400399L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "path()Ljava/lang/String;", cancellable = true)
    private void path__711224813(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-711224813L))
            info.setReturnValue("6`祸䑪P㊚E≆盛$|o꺆X]t暉>#n+FmW.5稂q⣧Z [Eo埥FI㽀-(j*ZN![@Dj,wZ1k9a'SecMꙍ-je>dP%jim_N9IAt{ZDv%1[^*mr");
    }

    @Inject(at = @At("HEAD"), method = "summary(Ljava/time/Duration;Ljava/util/List;)Lnet/minecraft/util/profiling/jfr/stats/FileIOStat$Summary;", cancellable = true)
    private static void summary__1918319078(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1918319078L))
            info.setReturnValue(null);
    }


}
