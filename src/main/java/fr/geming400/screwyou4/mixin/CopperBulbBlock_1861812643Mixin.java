package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.CopperBulbBlock.class)
public class CopperBulbBlock_1861812643Mixin {
        @Inject(at = @At("HEAD"), method = "checkAndFlip(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void checkAndFlip_1352634085(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1352634085L))
            info.cancel();
    }


}
