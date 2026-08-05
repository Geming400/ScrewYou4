package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.vehicle.minecart.MinecartFurnace.class)
public class MinecartFurnace383981111Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_422255850(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(422255850L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "interact(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void interact__1918920483(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1918920483L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPickResult()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getPickResult_907399771(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(907399771L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFurnace()Z", cancellable = true)
    private void isFurnace_422259694(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(422259694L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "addFuel(Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void addFuel__800582113(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-800582113L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDisplayBlockState()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getDefaultDisplayBlockState__1911777755(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1911777755L))
            info.setReturnValue(null);
    }


}
