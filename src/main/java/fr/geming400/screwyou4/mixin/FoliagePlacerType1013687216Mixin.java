package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType.class)
public class FoliagePlacerType1013687216Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1545426356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1545426356L))
            info.setReturnValue(null);
    }


}
