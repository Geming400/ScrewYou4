package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.PoweredRailBlock.class)
public class PoweredRailBlock_1849645285Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1378876758(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1378876758L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getShapeProperty()Lnet/minecraft/world/level/block/state/properties/Property;", cancellable = true)
    private void getShapeProperty_1730065555(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1730065555L))
            info.setReturnValue(null);
    }


}
