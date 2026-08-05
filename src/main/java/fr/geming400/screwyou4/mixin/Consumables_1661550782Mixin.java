package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.Consumables.class)
public class Consumables_1661550782Mixin {
        @Inject(at = @At("HEAD"), method = "defaultFood()Lnet/minecraft/world/item/component/Consumable$Builder;", cancellable = true)
    private static void defaultFood__187020157(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-187020157L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "defaultDrink()Lnet/minecraft/world/item/component/Consumable$Builder;", cancellable = true)
    private static void defaultDrink__871479061(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-871479061L))
            info.setReturnValue(null);
    }


}
