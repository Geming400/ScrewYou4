package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.FurnaceFuelSlot.class)
public class FurnaceFuelSlot903382878Mixin {
        @Inject(at = @At("HEAD"), method = "getMaxStackSize(Lnet/minecraft/world/item/ItemStack;)I", cancellable = true)
    private void getMaxStackSize__28616274(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-28616274L))
            info.setReturnValue(842844825);
    }

    @Inject(at = @At("HEAD"), method = "mayPlace(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void mayPlace_2001957592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2001957592L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isBucket(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private static void isBucket__2122584322(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2122584322L))
            info.setReturnValue(false);
    }


}
