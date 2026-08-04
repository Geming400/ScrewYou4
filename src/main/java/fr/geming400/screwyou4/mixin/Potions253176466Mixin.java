package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.alchemy.Potions.class)
public class Potions253176466Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/core/Registry;)Lnet/minecraft/core/Holder;", cancellable = true)
    private static void bootstrap_1676546020(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1676546020L))
            info.setReturnValue(null);
    }


}
