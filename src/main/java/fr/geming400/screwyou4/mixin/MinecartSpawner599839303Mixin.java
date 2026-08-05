package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.vehicle.minecart.MinecartSpawner.class)
public class MinecartSpawner599839303Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_470155645(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(470155645L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPickResult()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getPickResult_654768639(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(654768639L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handleEntityEvent(B)V", cancellable = true)
    private void handleEntityEvent_1353587419(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1353587419L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSpawner()Lnet/minecraft/world/level/BaseSpawner;", cancellable = true)
    private void getSpawner_114695870(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(114695870L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDisplayBlockState()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getDefaultDisplayBlockState__2106777712(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2106777712L))
            info.setReturnValue(null);
    }


}
