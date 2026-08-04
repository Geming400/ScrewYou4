package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.FlintAndSteelItem.class)
public class FlintAndSteelItem209183330Mixin {
        @Inject(at = @At("HEAD"), method = "useOn(Lnet/minecraft/world/item/context/UseOnContext;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void useOn__1699659925(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1699659925L))
            info.setReturnValue(null);
    }


}
