package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.SoulSandBlock.class)
public class SoulSandBlock2044996392Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__514117180(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-514117180L))
            info.setReturnValue(null);
    }


}
