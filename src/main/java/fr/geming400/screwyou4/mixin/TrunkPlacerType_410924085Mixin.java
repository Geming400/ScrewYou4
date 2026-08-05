package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType.class)
public class TrunkPlacerType_410924085Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1477369338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1477369338L))
            info.setReturnValue(null);
    }


}
