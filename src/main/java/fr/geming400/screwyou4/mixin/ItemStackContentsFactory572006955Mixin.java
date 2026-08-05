package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.display.SlotDisplay.ItemStackContentsFactory.class)
public class ItemStackContentsFactory572006955Mixin {
        @Inject(at = @At("HEAD"), method = "forStack(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void forStack_1253469897(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1253469897L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forStack(Lnet/minecraft/world/item/ItemStack;)Ljava/lang/Object;", cancellable = true)
    private void forStack_1034271360(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1034271360L))
            info.setReturnValue(null);
    }


}
