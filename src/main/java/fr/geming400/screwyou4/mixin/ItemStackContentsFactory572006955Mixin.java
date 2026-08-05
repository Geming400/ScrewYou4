package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.display.SlotDisplay.ItemStackContentsFactory.class)
public class ItemStackContentsFactory572006955Mixin {
        @Inject(at = @At("HEAD"), method = "forStack(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void forStack_525464074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(525464074L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forStack(Lnet/minecraft/world/item/ItemStack;)Ljava/lang/Object;", cancellable = true)
    private void forStack__677102591(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-677102591L))
            info.setReturnValue(new java.lang.Object());
    }


}
