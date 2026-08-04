package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.BrewingStandBlockEntity.class)
public class BrewingStandBlockEntity519740076Mixin {
        @Inject(at = @At("HEAD"), method = "getContainerSize()I", cancellable = true)
    private void getContainerSize_558002322(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(558002322L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canPlaceItem(ILnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void canPlaceItem__825009535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-825009535L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "serverTick(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/BrewingStandBlockEntity;)V", cancellable = true)
    private static void serverTick__406459250(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-406459250L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canPlaceItemThroughFace(ILnet/minecraft/world/item/ItemStack;Lnet/minecraft/core/Direction;)Z", cancellable = true)
    private void canPlaceItemThroughFace_1980535821(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1980535821L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canTakeItemThroughFace(ILnet/minecraft/world/item/ItemStack;Lnet/minecraft/core/Direction;)Z", cancellable = true)
    private void canTakeItemThroughFace_1980535821(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1980535821L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSlotsForFace(Lnet/minecraft/core/Direction;)[I", cancellable = true)
    private void getSlotsForFace_161094381(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(161094381L))
            info.setReturnValue(null);
    }


}
