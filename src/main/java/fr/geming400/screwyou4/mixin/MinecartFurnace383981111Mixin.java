package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.vehicle.minecart.MinecartFurnace.class)
public class MinecartFurnace383981111Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_254297453(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(254297453L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "interact(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void interact__623269017(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-623269017L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPickResult()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getPickResult_438910447(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(438910447L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFurnace()Z", cancellable = true)
    private void isFurnace_82323424(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(82323424L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "addFuel(Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void addFuel__1267020522(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1267020522L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDisplayBlockState()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getDefaultDisplayBlockState_1972331392(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1972331392L))
            info.setReturnValue(null);
    }


}
