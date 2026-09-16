package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.CrafterSlot.class)
public class CrafterSlot_389672003Mixin {
        @Inject(at = @At("HEAD"), method = "setChanged()V", cancellable = true)
    private void setChanged__1045975485(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1045975485L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "mayPlace(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void mayPlace_1488246716(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1488246716L))
            info.setReturnValue(false);
    }


}
