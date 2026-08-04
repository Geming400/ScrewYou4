package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.DetectorRailBlock.class)
public class DetectorRailBlock_1687505625Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__871607948(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-871607948L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getShapeProperty()Lnet/minecraft/world/level/block/state/properties/Property;", cancellable = true)
    private void getShapeProperty__67313817(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-67313817L))
            info.setReturnValue(null);
    }


}
