package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.MultifaceBlock.class)
public class MultifaceBlock_108777381Mixin {
        @Inject(at = @At("HEAD"), method = "pack(Ljava/util/Collection;)B", cancellable = true)
    private static void pack_1703215667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1703215667L))
            info.setReturnValue(-7);
    }

    @Inject(at = @At("HEAD"), method = "unpack(B)Ljava/util/Set;", cancellable = true)
    private static void unpack__96350622(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-96350622L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasFace(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/Direction;)Z", cancellable = true)
    private static void hasFace_299279255(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(299279255L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getFaceProperty(Lnet/minecraft/core/Direction;)Lnet/minecraft/world/level/block/state/properties/BooleanProperty;", cancellable = true)
    private static void getFaceProperty_133027241(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(133027241L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__1253798283(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1253798283L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement_1934556196(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1934556196L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isValidStateForPlacement(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;)Z", cancellable = true)
    private void isValidStateForPlacement__214087818(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-214087818L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "availableFaces(Lnet/minecraft/world/level/block/state/BlockState;)Ljava/util/Set;", cancellable = true)
    private static void availableFaces__1701084320(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1701084320L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canAttachTo(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;)Z", cancellable = true)
    private static void canAttachTo__2051132728(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2051132728L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canAttachTo(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/Direction;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private static void canAttachTo_1459359519(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1459359519L))
            info.setReturnValue(true);
    }


}
