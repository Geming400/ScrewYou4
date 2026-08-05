package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.player.PlayerEquipment.class)
public class PlayerEquipment1141522047Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void get_226736571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(226736571L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty__2094328877(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2094328877L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "set(Lnet/minecraft/world/entity/EquipmentSlot;Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void set_2107452802(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2107452802L))
            info.setReturnValue(null);
    }


}
