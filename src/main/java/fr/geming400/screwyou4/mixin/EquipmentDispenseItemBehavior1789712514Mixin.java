package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.dispenser.EquipmentDispenseItemBehavior.class)
public class EquipmentDispenseItemBehavior1789712514Mixin {
        @Inject(at = @At("HEAD"), method = "dispenseEquipment(Lnet/minecraft/core/dispenser/BlockSource;Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private static void dispenseEquipment__419511614(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-419511614L))
            info.setReturnValue(true);
    }


}
