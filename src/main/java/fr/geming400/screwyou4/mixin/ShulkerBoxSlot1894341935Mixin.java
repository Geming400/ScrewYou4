package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.ShulkerBoxSlot.class)
public class ShulkerBoxSlot1894341935Mixin {
        @Inject(at = @At("HEAD"), method = "mayPlace(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void mayPlace__1302050647(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1302050647L))
            info.setReturnValue(true);
    }


}
