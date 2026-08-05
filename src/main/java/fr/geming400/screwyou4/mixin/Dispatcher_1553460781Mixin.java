package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.cauldron.CauldronInteraction.Dispatcher.class)
public class Dispatcher_1553460781Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/core/cauldron/CauldronInteraction;", cancellable = true)
    private void get__2127062560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2127062560L))
            info.setReturnValue(null);
    }


}
