package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.TintedParticleLeavesBlock.class)
public class TintedParticleLeavesBlock_1403264029Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1155849544(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1155849544L))
            info.setReturnValue(null);
    }


}
