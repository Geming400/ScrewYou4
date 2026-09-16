package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.synth.NormalNoise.NoiseParameters.class)
public class NoiseParameters_1583843011Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_675216742(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(675216742L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1940700761(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1940700761L))
            info.setReturnValue("5\u49E5Nu7)TtQP]4 cuat:jo\"M\u9D9CasTq`rjUuiLxL{tj5\u235ETZ)\uB421WQ2,sEU;\u0FABnsoGuv:^jQF+e8l\u46FB\u553CF:WquOz=\u57C1Fw");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2141195101(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2141195101L))
            info.setReturnValue(1020612506);
    }

    @Inject(at = @At("HEAD"), method = "amplitudes()Lit/unimi/dsi/fastutil/doubles/DoubleList;", cancellable = true)
    private void amplitudes_2060167791(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2060167791L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "firstOctave()I", cancellable = true)
    private void firstOctave_1454503976(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1454503976L))
            info.setReturnValue(692695795);
    }


}
