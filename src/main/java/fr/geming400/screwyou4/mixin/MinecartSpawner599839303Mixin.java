package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.vehicle.minecart.MinecartSpawner.class)
public class MinecartSpawner599839303Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_638114042(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(638114042L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDisplayBlockState()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getDefaultDisplayBlockState__1695919563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1695919563L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSpawner()Lnet/minecraft/world/level/BaseSpawner;", cancellable = true)
    private void getSpawner_1524921136(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1524921136L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handleEntityEvent(B)V", cancellable = true)
    private void handleEntityEvent_1807291628(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1807291628L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPickResult()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getPickResult_1123257963(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1123257963L))
            info.setReturnValue(null);
    }


}
