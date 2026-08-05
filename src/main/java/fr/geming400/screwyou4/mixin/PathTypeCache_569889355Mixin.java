package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.pathfinder.PathTypeCache.class)
public class PathTypeCache_569889355Mixin {
        @Inject(at = @At("HEAD"), method = "invalidate(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void invalidate_738655953(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(738655953L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getOrCompute(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/pathfinder/PathType;", cancellable = true)
    private void getOrCompute__1765816896(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1765816896L))
            info.setReturnValue(net.minecraft.world.level.pathfinder.PathType.WATER_BORDER);
    }


}
