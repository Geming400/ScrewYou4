package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.EntityEquipment.class)
public class EntityEquipment620404701Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void get__294380775(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-294380775L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear__165423005(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-165423005L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_1679521073(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1679521073L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "set(Lnet/minecraft/world/entity/EquipmentSlot;Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void set_1586335456(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1586335456L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setAll(Lnet/minecraft/world/entity/EntityEquipment;)V", cancellable = true)
    private void setAll_1499673072(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1499673072L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void tick_135891718(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(135891718L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dropAll(Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void dropAll__1542979086(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1542979086L))
            info.cancel();
    }


}
