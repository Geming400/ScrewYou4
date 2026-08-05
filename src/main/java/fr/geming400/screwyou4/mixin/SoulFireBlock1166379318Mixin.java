package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.SoulFireBlock.class)
public class SoulFireBlock1166379318Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1392734254(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1392734254L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canSurviveOnBlock(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private static void canSurviveOnBlock_1021090580(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1021090580L))
            info.setReturnValue(false);
    }


}
