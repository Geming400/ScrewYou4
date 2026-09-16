package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.jfr.stats.FileIOStat.Summary.class)
public class Summary1240334836Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_331708568(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(331708568L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2010758361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2010758361L))
            info.setReturnValue("&WX|(\uB0ED;jK#qe|Br;\u6BCF;r\u23E828vh\u10A3JAH!3c\"5c!=B\u6774a$]^gF#2o<vbLa4AzbW");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1797686927(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1797686927L))
            info.setReturnValue(715552974);
    }

    @Inject(at = @At("HEAD"), method = "counts()J", cancellable = true)
    private void counts__283691817(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-283691817L))
            info.setReturnValue(6410054945538681522L);
    }

    @Inject(at = @At("HEAD"), method = "totalBytes()J", cancellable = true)
    private void totalBytes__2057758604(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2057758604L))
            info.setReturnValue(4655450786832260448L);
    }

    @Inject(at = @At("HEAD"), method = "bytesPerSecond()D", cancellable = true)
    private void bytesPerSecond_1667248399(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1667248399L))
            info.setReturnValue(1.9955360025106484E8D);
    }

    @Inject(at = @At("HEAD"), method = "topTenContributorsByTotalBytes()Ljava/util/List;", cancellable = true)
    private void topTenContributorsByTotalBytes__2072936926(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2072936926L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "countsPerSecond()D", cancellable = true)
    private void countsPerSecond__1444523480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1444523480L))
            info.setReturnValue(1.99553600563039E8D);
    }

    @Inject(at = @At("HEAD"), method = "timeSpentInIO()Ljava/time/Duration;", cancellable = true)
    private void timeSpentInIO_1436503685(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1436503685L))
            info.setReturnValue(null);
    }


}
