package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.jfr.stats.IoSummary.CountAndSize.class)
public class CountAndSize_735065271Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__173560998(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-173560998L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1505488795(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1505488795L))
            info.setReturnValue("rHJa**zWJIB4[1lR{Q9*;sR%*5L\uAB4512@%onJG7E*\uB627[J04cOV\u1DC3Si\u02328`.J\u5B3Et\u9886M7u#O(p:`kFiH\u76F2");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1292417361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1292417361L))
            info.setReturnValue(1275263524);
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/util/profiling/jfr/stats/IoSummary$CountAndSize;)Lnet/minecraft/util/profiling/jfr/stats/IoSummary$CountAndSize;", cancellable = true)
    private void add_1663325442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1663325442L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "totalSize()J", cancellable = true)
    private void totalSize_1999026200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1999026200L))
            info.setReturnValue(-741222692121947961L);
    }

    @Inject(at = @At("HEAD"), method = "averageSize()F", cancellable = true)
    private void averageSize_658754139(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(658754139L))
            info.setReturnValue(1.589906E8F);
    }

    @Inject(at = @At("HEAD"), method = "totalCount()J", cancellable = true)
    private void totalCount__695828206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-695828206L))
            info.setReturnValue(-5884030572725515131L);
    }


}
