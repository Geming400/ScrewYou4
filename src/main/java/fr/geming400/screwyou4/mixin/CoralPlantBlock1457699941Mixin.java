package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.CoralPlantBlock.class)
public class CoralPlantBlock1457699941Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1101413631(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1101413631L))
            info.setReturnValue(null);
    }


}
