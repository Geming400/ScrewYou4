package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.synth.SimplexNoise.class)
public class SimplexNoise_1722952066Mixin {
        @Inject(at = @At("HEAD"), method = "getValue(DD)D", cancellable = true)
    private void getValue_1209858823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1209858823L))
            info.setReturnValue(3.924801009762578E8D);
    }

    @Inject(at = @At("HEAD"), method = "getValue(DDD)D", cancellable = true)
    private void getValue__1274735151(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1274735151L))
            info.setReturnValue(3.9248010017729855E8D);
    }


}
