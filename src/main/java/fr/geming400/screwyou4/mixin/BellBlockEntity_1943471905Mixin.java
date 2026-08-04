package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.BellBlockEntity.class)
public class BellBlockEntity_1943471905Mixin {
        @Inject(at = @At("HEAD"), method = "triggerEvent(II)Z", cancellable = true)
    private void triggerEvent_947596279(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(947596279L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clientTick(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/BellBlockEntity;)V", cancellable = true)
    private static void clientTick__297527825(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-297527825L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onHit(Lnet/minecraft/core/Direction;)V", cancellable = true)
    private void onHit_823545823(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(823545823L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serverTick(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/BellBlockEntity;)V", cancellable = true)
    private static void serverTick__297527825(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-297527825L))
            info.cancel();
    }


}
