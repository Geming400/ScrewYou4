package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.FuelValues.class)
public class FuelValues296187438Mixin {
        @Inject(at = @At("HEAD"), method = "vanillaBurnTimes(Lnet/minecraft/core/HolderLookup$Provider;Lnet/minecraft/world/flag/FeatureFlagSet;)Lnet/minecraft/world/level/block/entity/FuelValues;", cancellable = true)
    private static void vanillaBurnTimes_1786247721(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1786247721L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "vanillaBurnTimes(Lnet/minecraft/core/HolderLookup$Provider;Lnet/minecraft/world/flag/FeatureFlagSet;I)Lnet/minecraft/world/level/block/entity/FuelValues;", cancellable = true)
    private static void vanillaBurnTimes__2099661320(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2099661320L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFuel(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isFuel__396550134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-396550134L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "burnDuration(Lnet/minecraft/world/item/ItemStack;)I", cancellable = true)
    private void burnDuration__505476842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-505476842L))
            info.setReturnValue(-39331527);
    }

    @Inject(at = @At("HEAD"), method = "fuelItems()Ljava/util/SequencedSet;", cancellable = true)
    private void fuelItems__1814138777(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1814138777L))
            info.setReturnValue(null);
    }


}
