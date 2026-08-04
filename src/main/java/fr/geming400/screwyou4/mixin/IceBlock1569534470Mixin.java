package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.IceBlock.class)
public class IceBlock1569534470Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__989579102(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-989579102L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerDestroy(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void playerDestroy_129791300(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(129791300L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "meltsInto()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private static void meltsInto__726224148(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-726224148L))
            info.setReturnValue(null);
    }


}
