package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.WeightedPressurePlateBlock.class)
public class WeightedPressurePlateBlock1998966135Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1229555907(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1229555907L))
            info.setReturnValue(null);
    }


}
