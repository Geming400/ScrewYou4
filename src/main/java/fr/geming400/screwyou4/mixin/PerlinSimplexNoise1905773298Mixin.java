package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.synth.PerlinSimplexNoise.class)
public class PerlinSimplexNoise1905773298Mixin {
        @Inject(at = @At("HEAD"), method = "getValue(DDZ)D", cancellable = true)
    private void getValue__1071596456(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1071596456L))
            info.setReturnValue(5.47669000073499E8D);
    }


}
