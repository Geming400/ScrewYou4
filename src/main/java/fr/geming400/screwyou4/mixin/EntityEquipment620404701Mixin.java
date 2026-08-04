package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.EntityEquipment.class)
public class EntityEquipment620404701Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void get__1569381053(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1569381053L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_658679440(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(658679440L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_658683284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(658683284L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(Lnet/minecraft/world/entity/EquipmentSlot;Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void set__11517954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-11517954L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setAll(Lnet/minecraft/world/entity/EntityEquipment;)V", cancellable = true)
    private void setAll_1724755439(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1724755439L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void tick_168680041(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(168680041L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dropAll(Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void dropAll_942068032(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(942068032L))
            info.cancel();
    }


}
