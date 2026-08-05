package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.SculkCatalystBlockEntity.class)
public class SculkCatalystBlockEntity_233436919Mixin {
        @Inject(at = @At("HEAD"), method = "getListener()Lnet/minecraft/world/level/block/entity/SculkCatalystBlockEntity$CatalystListener;", cancellable = true)
    private void getListener_68493278(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(68493278L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getListener()Lnet/minecraft/world/level/gameevent/GameEventListener;", cancellable = true)
    private void getListener_732670871(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(732670871L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "serverTick(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/SculkCatalystBlockEntity;)V", cancellable = true)
    private static void serverTick__576477053(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-576477053L))
            info.cancel();
    }


}
