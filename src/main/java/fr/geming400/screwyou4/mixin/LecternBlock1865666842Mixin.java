package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.LecternBlock.class)
public class LecternBlock1865666842Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__693446730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-693446730L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void newBlockEntity_280189187(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(280189187L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement_607067075(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(607067075L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "signalPageChange(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private static void signalPageChange__204238087(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-204238087L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tryPlaceBook(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private static void tryPlaceBook__2119607086(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2119607086L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resetBookState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Z)V", cancellable = true)
    private static void resetBookState_944446050(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(944446050L))
            info.cancel();
    }


}
