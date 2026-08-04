package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.PoweredRailBlock.class)
public class PoweredRailBlock_1849645285Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__709468288(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-709468288L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getShapeProperty()Lnet/minecraft/world/level/block/state/properties/Property;", cancellable = true)
    private void getShapeProperty_94825843(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(94825843L))
            info.setReturnValue(null);
    }


}
