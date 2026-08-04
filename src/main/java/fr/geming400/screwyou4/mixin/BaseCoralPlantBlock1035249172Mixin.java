package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.BaseCoralPlantBlock.class)
public class BaseCoralPlantBlock1035249172Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1523864400(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1523864400L))
            info.setReturnValue(null);
    }


}
