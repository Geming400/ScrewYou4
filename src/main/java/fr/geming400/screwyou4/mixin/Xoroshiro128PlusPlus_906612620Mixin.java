package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.Xoroshiro128PlusPlus.class)
public class Xoroshiro128PlusPlus_906612620Mixin {
        @Inject(at = @At("HEAD"), method = "nextLong()J", cancellable = true)
    private void nextLong__1277966717(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1277966717L))
            info.setReturnValue(1526151680803510363L);
    }


}
