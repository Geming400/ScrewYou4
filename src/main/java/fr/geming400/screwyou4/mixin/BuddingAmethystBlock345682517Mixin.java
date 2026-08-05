package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.BuddingAmethystBlock.class)
public class BuddingAmethystBlock345682517Mixin {
        @Inject(at = @At("HEAD"), method = "canClusterGrowAtState(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private static void canClusterGrowAtState__1934686990(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1934686990L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1412127771(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1412127771L))
            info.setReturnValue(null);
    }


}
