package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.ArmorStandItem.class)
public class ArmorStandItem586861814Mixin {
        @Inject(at = @At("HEAD"), method = "useOn(Lnet/minecraft/world/item/context/UseOnContext;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void useOn__1321981441(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1321981441L))
            info.setReturnValue(null);
    }


}
