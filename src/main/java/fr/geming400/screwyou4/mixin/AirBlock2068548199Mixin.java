package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.AirBlock.class)
public class AirBlock2068548199Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1159973843(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1159973843L))
            info.setReturnValue(null);
    }


}
