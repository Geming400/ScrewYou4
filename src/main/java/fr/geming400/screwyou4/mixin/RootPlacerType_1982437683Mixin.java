package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.rootplacers.RootPlacerType.class)
public class RootPlacerType_1982437683Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1246084360(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1246084360L))
            info.setReturnValue(null);
    }


}
