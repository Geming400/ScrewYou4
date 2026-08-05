package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.dispenser.DefaultDispenseItemBehavior.class)
public class DefaultDispenseItemBehavior339055477Mixin {
        @Inject(at = @At("HEAD"), method = "dispense(Lnet/minecraft/core/dispenser/BlockSource;Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void dispense__677627900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-677627900L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawnItem(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/item/ItemStack;ILnet/minecraft/core/Direction;Lnet/minecraft/core/Position;)V", cancellable = true)
    private static void spawnItem_638279215(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(638279215L))
            info.cancel();
    }


}
