package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.TargetBlock.class)
public class TargetBlock_1127120082Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__2101401961(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2101401961L))
            info.setReturnValue(null);
    }


}
