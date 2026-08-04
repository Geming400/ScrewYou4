package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.chunk.SectionCopy.class)
public class SectionCopy_1643601556Mixin {
        @Inject(at = @At("HEAD"), method = "getBlockEntity(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void getBlockEntity_1641262347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1641262347L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockState(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getBlockState_2042227501(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2042227501L))
            info.setReturnValue(null);
    }


}
