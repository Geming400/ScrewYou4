package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.vehicle.minecart.Minecart.class)
public class Minecart1447360893Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1485635632(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1485635632L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isRideable()Z", cancellable = true)
    private void isRideable_1485639476(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1485639476L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "activateMinecart(Lnet/minecraft/server/level/ServerLevel;IIIZ)V", cancellable = true)
    private void activateMinecart_1075623762(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1075623762L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "interact(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void interact__855540701(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-855540701L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPickResult()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getPickResult_1970779553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1970779553L))
            info.setReturnValue(null);
    }


}
