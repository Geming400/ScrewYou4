package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType.class)
public class FoliagePlacerType1013687216Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_2080132470(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2080132470L))
            info.setReturnValue(null);
    }


}
