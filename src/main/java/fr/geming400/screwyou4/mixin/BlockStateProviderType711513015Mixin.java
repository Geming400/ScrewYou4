package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProviderType.class)
public class BlockStateProviderType711513015Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1847600557(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1847600557L))
            info.setReturnValue(null);
    }


}
