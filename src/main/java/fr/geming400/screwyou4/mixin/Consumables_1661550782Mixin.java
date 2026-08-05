package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.Consumables.class)
public class Consumables_1661550782Mixin {
        @Inject(at = @At("HEAD"), method = "defaultDrink()Lnet/minecraft/world/item/component/Consumable$Builder;", cancellable = true)
    private static void defaultDrink_1151487522(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1151487522L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "defaultFood()Lnet/minecraft/world/item/component/Consumable$Builder;", cancellable = true)
    private static void defaultFood_1151487522(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1151487522L))
            info.setReturnValue(null);
    }


}
