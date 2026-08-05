package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.ClipContext.Block.class)
public class Block_402730254Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/phys/shapes/CollisionContext;)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private void get__589868164(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-589868164L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/ClipContext$Block;", cancellable = true)
    private static void values_335487654(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(335487654L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/ClipContext$Block;", cancellable = true)
    private static void valueOf__95590785(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-95590785L))
            info.setReturnValue(net.minecraft.world.level.ClipContext.Block.COLLIDER);
    }


}
