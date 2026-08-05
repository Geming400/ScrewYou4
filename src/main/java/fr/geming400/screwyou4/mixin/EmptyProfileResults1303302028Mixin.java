package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.EmptyProfileResults.class)
public class EmptyProfileResults1303302028Mixin {
        @Inject(at = @At("HEAD"), method = "getStartTimeNano()J", cancellable = true)
    private void getStartTimeNano_1341565235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1341565235L))
            info.setReturnValue(2641108473392833126L);
    }

    @Inject(at = @At("HEAD"), method = "getEndTimeNano()J", cancellable = true)
    private void getEndTimeNano_1341565235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1341565235L))
            info.setReturnValue(2641108473392833126L);
    }

    @Inject(at = @At("HEAD"), method = "getEndTimeTicks()I", cancellable = true)
    private void getEndTimeTicks_1341564274(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1341564274L))
            info.setReturnValue(-184759516);
    }

    @Inject(at = @At("HEAD"), method = "getStartTimeTicks()I", cancellable = true)
    private void getStartTimeTicks_1341564274(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1341564274L))
            info.setReturnValue(-184759516);
    }

    @Inject(at = @At("HEAD"), method = "getProfilerResults()Ljava/lang/String;", cancellable = true)
    private void getProfilerResults_167841557(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(167841557L))
            info.setReturnValue("tSG`3iKXEA>d\u416F`@N/Bh/wgOCwdYSD+ c(,Q\u2C3FGJL\u1574=%_oT[m&{@J3C");
    }

    @Inject(at = @At("HEAD"), method = "saveResults(Ljava/nio/file/Path;)Z", cancellable = true)
    private void saveResults__1384374622(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1384374622L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getTimes(Ljava/lang/String;)Ljava/util/List;", cancellable = true)
    private void getTimes_608062578(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(608062578L))
            info.setReturnValue(null);
    }


}
