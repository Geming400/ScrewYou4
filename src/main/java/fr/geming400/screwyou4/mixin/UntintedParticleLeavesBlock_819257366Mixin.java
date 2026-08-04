package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.UntintedParticleLeavesBlock.class)
public class UntintedParticleLeavesBlock_819257366Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1739856207(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1739856207L))
            info.setReturnValue(null);
    }


}
