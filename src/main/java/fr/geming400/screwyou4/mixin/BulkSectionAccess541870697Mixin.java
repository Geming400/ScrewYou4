package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.BulkSectionAccess.class)
public class BulkSectionAccess541870697Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__1572704732(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1572704732L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSection(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/chunk/LevelChunkSection;", cancellable = true)
    private void getSection__1394134254(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1394134254L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockState(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getBlockState_2081753289(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2081753289L))
            info.setReturnValue(null);
    }


}
