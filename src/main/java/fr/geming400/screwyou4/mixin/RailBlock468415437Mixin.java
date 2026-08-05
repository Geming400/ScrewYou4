package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.RailBlock.class)
public class RailBlock468415437Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1534860691(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1534860691L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getShapeProperty()Lnet/minecraft/world/level/block/state/properties/Property;", cancellable = true)
    private void getShapeProperty_348835708(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(348835708L))
            info.setReturnValue(null);
    }


}
