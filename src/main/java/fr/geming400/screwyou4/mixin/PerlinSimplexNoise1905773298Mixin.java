package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.synth.PerlinSimplexNoise.class)
public class PerlinSimplexNoise1905773298Mixin {
        @Inject(at = @At("HEAD"), method = "getValue(DDZ)D", cancellable = true)
    private void getValue_855666589(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(855666589L))
            info.setReturnValue(8.866970004908158E8D);
    }


}
