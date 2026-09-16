package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.FilledProfileResults.class)
public class FilledProfileResults_125531931Mixin {
        @Inject(at = @At("HEAD"), method = "getTickDuration()I", cancellable = true)
    private void getTickDuration__924710759(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-924710759L))
            info.setReturnValue(-1377100438);
    }

    @Inject(at = @At("HEAD"), method = "saveResults(Ljava/nio/file/Path;)Z", cancellable = true)
    private void saveResults__562275177(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-562275177L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getStartTimeTicks()I", cancellable = true)
    private void getStartTimeTicks__1938919229(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1938919229L))
            info.setReturnValue(822652626);
    }

    @Inject(at = @At("HEAD"), method = "getEndTimeTicks()I", cancellable = true)
    private void getEndTimeTicks_813176828(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(813176828L))
            info.setReturnValue(912147343);
    }

    @Inject(at = @At("HEAD"), method = "getStartTimeNano()J", cancellable = true)
    private void getStartTimeNano__19757324(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-19757324L))
            info.setReturnValue(7690600478952421465L);
    }

    @Inject(at = @At("HEAD"), method = "getEndTimeNano()J", cancellable = true)
    private void getEndTimeNano__1177906021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1177906021L))
            info.setReturnValue(-6612474549028330208L);
    }

    @Inject(at = @At("HEAD"), method = "getProfilerResults()Ljava/lang/String;", cancellable = true)
    private void getProfilerResults__794637062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-794637062L))
            info.setReturnValue(".pKWe\uC1FFeFFQqvu59\uAA2B\u85AC!v\uC24AO44T\u47F6zSZ4TJ");
    }

    @Inject(at = @At("HEAD"), method = "getTimes(Ljava/lang/String;)Ljava/util/List;", cancellable = true)
    private void getTimes__1642203760(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1642203760L))
            info.setReturnValue(null);
    }


}
