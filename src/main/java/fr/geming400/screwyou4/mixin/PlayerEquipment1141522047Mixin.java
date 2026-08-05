package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.player.PlayerEquipment.class)
public class PlayerEquipment1141522047Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void get__1048263707(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1048263707L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_1179800630(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1179800630L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "set(Lnet/minecraft/world/entity/EquipmentSlot;Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void set_509599392(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(509599392L))
            info.setReturnValue(null);
    }


}
