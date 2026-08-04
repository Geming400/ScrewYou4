package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.entity.ChunkEntities.class)
public class ChunkEntities_754054784Mixin {
        @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_792333366(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(792333366L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntities()Ljava/util/stream/Stream;", cancellable = true)
    private void getEntities_543348468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(543348468L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPos()Lnet/minecraft/world/level/ChunkPos;", cancellable = true)
    private void getPos__135044054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-135044054L))
            info.setReturnValue(null);
    }


}
