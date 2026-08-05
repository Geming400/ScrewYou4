package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.PlayerWallHeadBlock.class)
public class PlayerWallHeadBlock1534081972Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1694440070(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1694440070L))
            info.setReturnValue(null);
    }


}
