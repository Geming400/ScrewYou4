package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.SlimeBlock.class)
public class SlimeBlock_1351757591Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1207355982(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1207355982L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fallOn(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/Entity;D)V", cancellable = true)
    private void fallOn__1569404870(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1569404870L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stepOn(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void stepOn_666559214(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(666559214L))
            info.cancel();
    }


}
