package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.featuresize.FeatureSizeType.class)
public class FeatureSizeType1371806947Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1187306625(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1187306625L))
            info.setReturnValue(null);
    }


}
