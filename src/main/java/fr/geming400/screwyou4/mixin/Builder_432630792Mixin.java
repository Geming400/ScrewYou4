package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.ProjectileItem.DispenseConfig.Builder.class)
public class Builder_432630792Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/item/ProjectileItem$DispenseConfig;", cancellable = true)
    private void build_1815373671(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1815373671L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "power(F)Lnet/minecraft/world/item/ProjectileItem$DispenseConfig$Builder;", cancellable = true)
    private void power_1396555815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1396555815L))
            info.setReturnValue(new net.minecraft.world.item.ProjectileItem.DispenseConfig.Builder());
    }

    @Inject(at = @At("HEAD"), method = "overrideDispenseEvent(I)Lnet/minecraft/world/item/ProjectileItem$DispenseConfig$Builder;", cancellable = true)
    private void overrideDispenseEvent_1575512824(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1575512824L))
            info.setReturnValue(new net.minecraft.world.item.ProjectileItem.DispenseConfig.Builder());
    }

    @Inject(at = @At("HEAD"), method = "uncertainty(F)Lnet/minecraft/world/item/ProjectileItem$DispenseConfig$Builder;", cancellable = true)
    private void uncertainty__1083155810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1083155810L))
            info.setReturnValue(new net.minecraft.world.item.ProjectileItem.DispenseConfig.Builder());
    }

    @Inject(at = @At("HEAD"), method = "positionFunction(Lnet/minecraft/world/item/ProjectileItem$PositionFunction;)Lnet/minecraft/world/item/ProjectileItem$DispenseConfig$Builder;", cancellable = true)
    private void positionFunction__1237779022(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1237779022L))
            info.setReturnValue(null);
    }


}
