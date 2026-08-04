package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.jfr.stats.IoSummary.CountAndSize.class)
public class CountAndSize_735065271Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2120577529(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2120577529L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__400394705(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-400394705L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_773328012(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(773328012L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/util/profiling/jfr/stats/IoSummary$CountAndSize;)Lnet/minecraft/util/profiling/jfr/stats/IoSummary$CountAndSize;", cancellable = true)
    private void add_1132826785(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1132826785L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "totalSize()J", cancellable = true)
    private void totalSize_773328477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(773328477L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "totalCount()J", cancellable = true)
    private void totalCount_773328477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(773328477L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "averageSize()F", cancellable = true)
    private void averageSize_773324633(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(773324633L))
            info.setReturnValue(null);
    }


}
