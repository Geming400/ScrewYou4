package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.CrafterSlot.class)
public class CrafterSlot_389672003Mixin {
        @Inject(at = @At("HEAD"), method = "mayPlace(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void mayPlace_2124207134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2124207134L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setChanged()V", cancellable = true)
    private void setChanged_427946741(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(427946741L))
            info.cancel();
    }


}
