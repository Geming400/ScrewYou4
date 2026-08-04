package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.dispenser.SpawnEggItemBehavior.class)
public class SpawnEggItemBehavior_658564307Mixin {
        @Inject(at = @At("HEAD"), method = "execute(Lnet/minecraft/core/dispenser/BlockSource;Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void execute__1278233132(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1278233132L))
            info.setReturnValue(null);
    }


}
