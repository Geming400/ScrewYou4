package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.phys.shapes.MinecartCollisionContext.class)
public class MinecartCollisionContext1688442142Mixin {
        @Inject(at = @At("HEAD"), method = "getCollisionShape(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/CollisionGetter;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private void getCollisionShape__303404461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-303404461L))
            info.setReturnValue(null);
    }


}
