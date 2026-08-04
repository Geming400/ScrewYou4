package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.CompassItem.class)
public class CompassItem130469687Mixin {
        @Inject(at = @At("HEAD"), method = "getName(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getName__23666491(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-23666491L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "useOn(Lnet/minecraft/world/item/context/UseOnContext;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void useOn__1778373568(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1778373568L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFoil(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isFoil_1865004819(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1865004819L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "inventoryTick(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/entity/EquipmentSlot;)V", cancellable = true)
    private void inventoryTick__1856490165(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1856490165L))
            info.cancel();
    }


}
