package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.LeafLitterBlock.class)
public class LeafLitterBlock_2125278665Mixin {
        @Inject(at = @At("HEAD"), method = "rotate(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/Rotation;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void rotate__1694210540(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1694210540L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getShape(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/phys/shapes/CollisionContext;)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private void getShape__444205343(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-444205343L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement_866678897(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(866678897L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canBeReplaced(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/item/context/BlockPlaceContext;)Z", cancellable = true)
    private void canBeReplaced_1379075347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1379075347L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "mirror(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/Mirror;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void mirror__644763563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-644763563L))
            info.setReturnValue(null);
    }


}
