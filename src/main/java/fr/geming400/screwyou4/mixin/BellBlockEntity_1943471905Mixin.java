package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.BellBlockEntity.class)
public class BellBlockEntity_1943471905Mixin {
        @Inject(at = @At("HEAD"), method = "triggerEvent(II)Z", cancellable = true)
    private void triggerEvent_551112181(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(551112181L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "onHit(Lnet/minecraft/core/Direction;)V", cancellable = true)
    private void onHit_1899189803(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1899189803L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serverTick(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/BellBlockEntity;)V", cancellable = true)
    private static void serverTick__1609029009(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1609029009L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "clientTick(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/BellBlockEntity;)V", cancellable = true)
    private static void clientTick__937908505(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-937908505L))
            info.cancel();
    }


}
