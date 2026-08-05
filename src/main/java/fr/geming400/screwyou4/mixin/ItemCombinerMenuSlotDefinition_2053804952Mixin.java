package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.ItemCombinerMenuSlotDefinition.class)
public class ItemCombinerMenuSlotDefinition_2053804952Mixin {
        @Inject(at = @At("HEAD"), method = "getSlot(I)Lnet/minecraft/world/inventory/ItemCombinerMenuSlotDefinition$SlotDefinition;", cancellable = true)
    private void getSlot__1057581095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1057581095L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create()Lnet/minecraft/world/inventory/ItemCombinerMenuSlotDefinition$Builder;", cancellable = true)
    private static void create_1634658636(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1634658636L))
            info.setReturnValue(new net.minecraft.world.inventory.ItemCombinerMenuSlotDefinition$Builder());
    }

    @Inject(at = @At("HEAD"), method = "getSlots()Ljava/util/List;", cancellable = true)
    private void getSlots__614825529(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-614825529L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getResultSlot()Lnet/minecraft/world/inventory/ItemCombinerMenuSlotDefinition$SlotDefinition;", cancellable = true)
    private void getResultSlot__2053509920(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2053509920L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNumOfInputSlots()I", cancellable = true)
    private void getNumOfInputSlots_2092067197(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2092067197L))
            info.setReturnValue(-1335319905);
    }

    @Inject(at = @At("HEAD"), method = "getResultSlotIndex()I", cancellable = true)
    private void getResultSlotIndex_2092067197(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2092067197L))
            info.setReturnValue(-1335319905);
    }


}
