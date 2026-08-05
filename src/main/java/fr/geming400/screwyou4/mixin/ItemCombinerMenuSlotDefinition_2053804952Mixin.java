package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.ItemCombinerMenuSlotDefinition.class)
public class ItemCombinerMenuSlotDefinition_2053804952Mixin {
        @Inject(at = @At("HEAD"), method = "getSlot(I)Lnet/minecraft/world/inventory/ItemCombinerMenuSlotDefinition$SlotDefinition;", cancellable = true)
    private void getSlot__1390799539(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1390799539L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create()Lnet/minecraft/world/inventory/ItemCombinerMenuSlotDefinition$Builder;", cancellable = true)
    private static void create__390160568(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-390160568L))
            info.setReturnValue(new net.minecraft.world.inventory.ItemCombinerMenuSlotDefinition.Builder());
    }

    @Inject(at = @At("HEAD"), method = "getResultSlot()Lnet/minecraft/world/inventory/ItemCombinerMenuSlotDefinition$SlotDefinition;", cancellable = true)
    private void getResultSlot_2052105551(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2052105551L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getResultSlotIndex()I", cancellable = true)
    private void getResultSlotIndex__961991044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-961991044L))
            info.setReturnValue(-1380952787);
    }

    @Inject(at = @At("HEAD"), method = "getNumOfInputSlots()I", cancellable = true)
    private void getNumOfInputSlots__1317954933(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1317954933L))
            info.setReturnValue(404929624);
    }

    @Inject(at = @At("HEAD"), method = "getSlots()Ljava/util/List;", cancellable = true)
    private void getSlots_671828166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(671828166L))
            info.setReturnValue(null);
    }


}
