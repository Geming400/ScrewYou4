package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.MultifaceBlock.class)
public class MultifaceBlock_108777381Mixin {
        @Inject(at = @At("HEAD"), method = "pack(Ljava/util/Collection;)B", cancellable = true)
    private static void pack_1560079340(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1560079340L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFaceProperty(Lnet/minecraft/core/Direction;)Lnet/minecraft/world/level/block/state/properties/BooleanProperty;", cancellable = true)
    private static void getFaceProperty__1458807839(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1458807839L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack(B)Ljava/util/Set;", cancellable = true)
    private static void unpack__1374789840(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1374789840L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement_970719390(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(970719390L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__1149822387(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1149822387L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canAttachTo(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/Direction;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private static void canAttachTo__416744273(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-416744273L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canAttachTo(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;)Z", cancellable = true)
    private static void canAttachTo_369665112(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(369665112L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "availableFaces(Lnet/minecraft/world/level/block/state/BlockState;)Ljava/util/Set;", cancellable = true)
    private static void availableFaces_1048260525(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1048260525L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isValidStateForPlacement(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;)Z", cancellable = true)
    private void isValidStateForPlacement_121383825(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(121383825L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasFace(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/Direction;)Z", cancellable = true)
    private static void hasFace__10639538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-10639538L))
            info.setReturnValue(null);
    }


}
