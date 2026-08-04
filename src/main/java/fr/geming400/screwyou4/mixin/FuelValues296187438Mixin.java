package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.FuelValues.class)
public class FuelValues296187438Mixin {
        @Inject(at = @At("HEAD"), method = "vanillaBurnTimes(Lnet/minecraft/core/HolderLookup$Provider;Lnet/minecraft/world/flag/FeatureFlagSet;)Lnet/minecraft/world/level/block/entity/FuelValues;", cancellable = true)
    private static void vanillaBurnTimes__1361324115(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1361324115L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "vanillaBurnTimes(Lnet/minecraft/core/HolderLookup$Provider;Lnet/minecraft/world/flag/FeatureFlagSet;I)Lnet/minecraft/world/level/block/entity/FuelValues;", cancellable = true)
    private static void vanillaBurnTimes__890140428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-890140428L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFuel(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isFuel_2030722570(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2030722570L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fuelItems()Ljava/util/SequencedSet;", cancellable = true)
    private void fuelItems__1869628483(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1869628483L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "burnDuration(Lnet/minecraft/world/item/ItemStack;)I", cancellable = true)
    private void burnDuration_2030706233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2030706233L))
            info.setReturnValue(null);
    }


}
