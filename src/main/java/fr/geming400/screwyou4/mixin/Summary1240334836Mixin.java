package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.jfr.stats.FileIOStat.Summary.class)
public class Summary1240334836Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1669120201(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1669120201L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_104874861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(104874861L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1278597578(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1278597578L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "counts()J", cancellable = true)
    private void counts_1278598043(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1278598043L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bytesPerSecond()D", cancellable = true)
    private void bytesPerSecond_1278592277(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1278592277L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "totalBytes()J", cancellable = true)
    private void totalBytes_1278598043(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1278598043L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "topTenContributorsByTotalBytes()Ljava/util/List;", cancellable = true)
    private void topTenContributorsByTotalBytes__1428295644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1428295644L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "countsPerSecond()D", cancellable = true)
    private void countsPerSecond_1278592277(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1278592277L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "timeSpentInIO()Ljava/time/Duration;", cancellable = true)
    private void timeSpentInIO__1791467719(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1791467719L))
            info.setReturnValue(null);
    }


}
