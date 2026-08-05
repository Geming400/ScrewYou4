package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.FurnaceFuelSlot.class)
public class FurnaceFuelSlot903382878Mixin {
        @Inject(at = @At("HEAD"), method = "getMaxStackSize(Lnet/minecraft/world/item/ItemStack;)I", cancellable = true)
    private void getMaxStackSize__1657065623(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1657065623L))
            info.setReturnValue(-1688167854);
    }

    @Inject(at = @At("HEAD"), method = "mayPlace(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void mayPlace__1657049286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1657049286L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isBucket(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private static void isBucket__1657049038(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1657049038L))
            info.setReturnValue(false);
    }


}
