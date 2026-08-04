package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.TrappedChestBlock.class)
public class TrappedChestBlock2005674592Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__553438980(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-553438980L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void newBlockEntity_420196937(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(420196937L))
            info.setReturnValue(null);
    }


}
