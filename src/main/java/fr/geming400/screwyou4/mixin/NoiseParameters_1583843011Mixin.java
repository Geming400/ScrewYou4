package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.synth.NormalNoise.NoiseParameters.class)
public class NoiseParameters_1583843011Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1325612027(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1325612027L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_448383035(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(448383035L))
            info.setReturnValue("V\u1ECDkf$,mXt{9\u32C1R?WB6bdh#T. qn3|\u0904P5(cv_TPNvbqRs`\uB161^kBecQbP\u9A90F^Z");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1622105752(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1622105752L))
            info.setReturnValue(428233941);
    }

    @Inject(at = @At("HEAD"), method = "firstOctave()I", cancellable = true)
    private void firstOctave_1622105256(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1622105256L))
            info.setReturnValue(606757431);
    }

    @Inject(at = @At("HEAD"), method = "amplitudes()Lit/unimi/dsi/fastutil/doubles/DoubleList;", cancellable = true)
    private void amplitudes_730382879(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(730382879L))
            info.setReturnValue(null);
    }


}
