package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.ProjectileItem.DispenseConfig.Builder.class)
public class Builder_432630792Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/item/ProjectileItem$DispenseConfig;", cancellable = true)
    private void build__1603622407(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1603622407L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "power(F)Lnet/minecraft/world/item/ProjectileItem$DispenseConfig$Builder;", cancellable = true)
    private void power__289094132(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-289094132L))
            info.setReturnValue(new net.minecraft.world.item.ProjectileItem.DispenseConfig.Builder());
    }

    @Inject(at = @At("HEAD"), method = "positionFunction(Lnet/minecraft/world/item/ProjectileItem$PositionFunction;)Lnet/minecraft/world/item/ProjectileItem$DispenseConfig$Builder;", cancellable = true)
    private void positionFunction_907362641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(907362641L))
            info.setReturnValue(new net.minecraft.world.item.ProjectileItem.DispenseConfig.Builder());
    }

    @Inject(at = @At("HEAD"), method = "uncertainty(F)Lnet/minecraft/world/item/ProjectileItem$DispenseConfig$Builder;", cancellable = true)
    private void uncertainty__289094132(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-289094132L))
            info.setReturnValue(new net.minecraft.world.item.ProjectileItem.DispenseConfig.Builder());
    }

    @Inject(at = @At("HEAD"), method = "overrideDispenseEvent(I)Lnet/minecraft/world/item/ProjectileItem$DispenseConfig$Builder;", cancellable = true)
    private void overrideDispenseEvent__1005667543(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1005667543L))
            info.setReturnValue(new net.minecraft.world.item.ProjectileItem.DispenseConfig.Builder());
    }


}
