package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.jfr.stats.ThreadAllocationStat.Summary.class)
public class Summary_754633828Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2140146086(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2140146086L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__380826148(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-380826148L))
            info.setReturnValue("'9K<\uFB2C3\u5F05\u6A16Qce094'==b}\u6D9Fav\u7A4Ax.6\uB2EC\u0DD9q_GDx\u666Eh\u3598rP\uFE44JBE@v*=|/*'3=v\u6C71-s`SyL.Yk6tZL&\u8399cQg)MRa?cC\u7938a^9t?\u865C-%sO");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_792896569(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(792896569L))
            info.setReturnValue(-1053623335);
    }

    @Inject(at = @At("HEAD"), method = "allocationsPerSecondByThread()Ljava/util/Map;", cancellable = true)
    private void allocationsPerSecondByThread__1249989813(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1249989813L))
            info.setReturnValue(null);
    }


}
