package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.ItemCombinerMenuSlotDefinition.Builder.class)
public class Builder1758237575Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/inventory/ItemCombinerMenuSlotDefinition;", cancellable = true)
    private void build_1147923835(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1147923835L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withResultSlot(III)Lnet/minecraft/world/inventory/ItemCombinerMenuSlotDefinition$Builder;", cancellable = true)
    private void withResultSlot_1844112011(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1844112011L))
            info.setReturnValue(new net.minecraft.world.inventory.ItemCombinerMenuSlotDefinition$Builder());
    }

    @Inject(at = @At("HEAD"), method = "withSlot(IIILjava/util/function/Predicate;)Lnet/minecraft/world/inventory/ItemCombinerMenuSlotDefinition$Builder;", cancellable = true)
    private void withSlot__1970551268(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1970551268L))
            info.setReturnValue(new net.minecraft.world.inventory.ItemCombinerMenuSlotDefinition$Builder());
    }


}
