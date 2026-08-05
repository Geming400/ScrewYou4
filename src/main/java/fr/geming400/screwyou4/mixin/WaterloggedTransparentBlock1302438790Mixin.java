package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.WaterloggedTransparentBlock.class)
public class WaterloggedTransparentBlock1302438790Mixin {
        @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__1166749690(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1166749690L))
            info.setReturnValue(null);
    }


}
