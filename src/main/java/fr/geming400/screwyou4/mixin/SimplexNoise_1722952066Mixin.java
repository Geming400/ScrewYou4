package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.synth.SimplexNoise.class)
public class SimplexNoise_1722952066Mixin {
        @Inject(at = @At("HEAD"), method = "getValue(DD)D", cancellable = true)
    private void getValue_579291938(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(579291938L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getValue(DDD)D", cancellable = true)
    private void getValue_652527894(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(652527894L))
            info.setReturnValue(null);
    }


}
