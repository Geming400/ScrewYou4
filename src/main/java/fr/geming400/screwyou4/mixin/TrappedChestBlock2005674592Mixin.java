package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.TrappedChestBlock.class)
public class TrappedChestBlock2005674592Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1222847450(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1222847450L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void newBlockEntity_2147249977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2147249977L))
            info.setReturnValue(null);
    }


}
