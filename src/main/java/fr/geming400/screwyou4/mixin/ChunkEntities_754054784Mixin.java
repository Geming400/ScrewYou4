package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.entity.ChunkEntities.class)
public class ChunkEntities_754054784Mixin {
        @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_1813171155(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1813171155L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getEntities()Ljava/util/stream/Stream;", cancellable = true)
    private void getEntities__287878883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-287878883L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPos()Lnet/minecraft/world/level/ChunkPos;", cancellable = true)
    private void getPos__253636280(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-253636280L))
            info.setReturnValue(null);
    }


}
