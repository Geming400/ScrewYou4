package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.DetectorRailBlock.class)
public class DetectorRailBlock_1687505625Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1541016418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1541016418L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getShapeProperty()Lnet/minecraft/world/level/block/state/properties/Property;", cancellable = true)
    private void getShapeProperty_1567925895(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1567925895L))
            info.setReturnValue(null);
    }


}
