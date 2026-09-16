package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.EmptyProfileResults.class)
public class EmptyProfileResults1303302028Mixin {
        @Inject(at = @At("HEAD"), method = "saveResults(Ljava/nio/file/Path;)Z", cancellable = true)
    private void saveResults_615494921(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(615494921L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getStartTimeTicks()I", cancellable = true)
    private void getStartTimeTicks__761149131(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-761149131L))
            info.setReturnValue(148926010);
    }

    @Inject(at = @At("HEAD"), method = "getEndTimeTicks()I", cancellable = true)
    private void getEndTimeTicks_1990946926(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1990946926L))
            info.setReturnValue(1831518137);
    }

    @Inject(at = @At("HEAD"), method = "getStartTimeNano()J", cancellable = true)
    private void getStartTimeNano_1158012774(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1158012774L))
            info.setReturnValue(2604782289485539044L);
    }

    @Inject(at = @At("HEAD"), method = "getEndTimeNano()J", cancellable = true)
    private void getEndTimeNano__135923(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-135923L))
            info.setReturnValue(3722542824625043025L);
    }

    @Inject(at = @At("HEAD"), method = "getProfilerResults()Ljava/lang/String;", cancellable = true)
    private void getProfilerResults_383133036(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(383133036L))
            info.setReturnValue("*y)GY_y;\u1DAAQ#]dz*\u3984MjisZ\uAE3Ca\u15C2Q(mVmF%;u: in+");
    }

    @Inject(at = @At("HEAD"), method = "getTimes(Ljava/lang/String;)Ljava/util/List;", cancellable = true)
    private void getTimes__464433662(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-464433662L))
            info.setReturnValue(null);
    }


}
