package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.FilledProfileResults.class)
public class FilledProfileResults_125531931Mixin {
        @Inject(at = @At("HEAD"), method = "getTimes(Ljava/lang/String;)Ljava/util/List;", cancellable = true)
    private void getTimes__569707520(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-569707520L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTickDuration()I", cancellable = true)
    private void getTickDuration_163794176(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(163794176L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "saveResults(Ljava/nio/file/Path;)Z", cancellable = true)
    private void saveResults_1732822576(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1732822576L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEndTimeTicks()I", cancellable = true)
    private void getEndTimeTicks_163794176(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(163794176L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getProfilerResults()Ljava/lang/String;", cancellable = true)
    private void getProfilerResults__1009928541(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1009928541L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStartTimeNano()J", cancellable = true)
    private void getStartTimeNano_163795137(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(163795137L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStartTimeTicks()I", cancellable = true)
    private void getStartTimeTicks_163794176(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(163794176L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEndTimeNano()J", cancellable = true)
    private void getEndTimeNano_163795137(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(163795137L))
            info.setReturnValue(null);
    }


}
