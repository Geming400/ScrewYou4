package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.dispenser.DefaultDispenseItemBehavior.class)
public class DefaultDispenseItemBehavior339055477Mixin {
        @Inject(at = @At("HEAD"), method = "spawnItem(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/item/ItemStack;ILnet/minecraft/core/Direction;Lnet/minecraft/core/Position;)V", cancellable = true)
    private static void spawnItem_2138811265(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2138811265L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dispense(Lnet/minecraft/core/dispenser/BlockSource;Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void dispense__1597741465(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1597741465L))
            info.setReturnValue(null);
    }


}
