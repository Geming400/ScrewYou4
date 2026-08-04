package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.display.SlotDisplays.class)
public class SlotDisplays_175062601Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/core/Registry;)Lnet/minecraft/world/item/crafting/display/SlotDisplay$Type;", cancellable = true)
    private static void bootstrap_394091751(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(394091751L))
            info.setReturnValue(null);
    }


}
