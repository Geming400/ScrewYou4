package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.Xoroshiro128PlusPlus.class)
public class Xoroshiro128PlusPlus_906612620Mixin {
        @Inject(at = @At("HEAD"), method = "nextLong()J", cancellable = true)
    private void nextLong_944875826(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(944875826L))
            info.setReturnValue(null);
    }


}
