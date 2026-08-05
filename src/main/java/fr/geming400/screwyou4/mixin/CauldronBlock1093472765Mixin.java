package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.CauldronBlock.class)
public class CauldronBlock1093472765Mixin {
        @Inject(at = @At("HEAD"), method = "isFull(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isFull__1108892694(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1108892694L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__2135049277(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2135049277L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handlePrecipitation(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/biome/Biome$Precipitation;)V", cancellable = true)
    private void handlePrecipitation_901872378(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(901872378L))
            info.cancel();
    }


}
