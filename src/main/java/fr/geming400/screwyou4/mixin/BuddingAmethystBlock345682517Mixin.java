package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.BuddingAmethystBlock.class)
public class BuddingAmethystBlock345682517Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_2081536241(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2081536241L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canClusterGrowAtState(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private static void canClusterGrowAtState_200393779(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(200393779L))
            info.setReturnValue(true);
    }


}
