package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.CoralWallFanBlock.class)
public class CoralWallFanBlock909425191Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1649688381(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1649688381L))
            info.setReturnValue(null);
    }


}
