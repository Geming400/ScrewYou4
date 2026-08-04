package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.display.SlotDisplayContext.class)
public class SlotDisplayContext1718132371Mixin {
        @Inject(at = @At("HEAD"), method = "fromLevel(Lnet/minecraft/world/level/Level;)Lnet/minecraft/util/context/ContextMap;", cancellable = true)
    private static void fromLevel_107860056(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(107860056L))
            info.setReturnValue(null);
    }


}
