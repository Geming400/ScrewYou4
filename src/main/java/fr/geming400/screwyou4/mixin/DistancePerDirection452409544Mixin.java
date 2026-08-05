package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.state.level.WorldBorderRenderState.DistancePerDirection.class)
public class DistancePerDirection452409544Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1837921803(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1837921803L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__683050431(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-683050431L))
            info.setReturnValue(")tza&T]EqN+1v>k렧茕j@$4Je&uU俺y`jRYkX01Eg]屹BT恴X*MW㜩]==QRz=S+0.B뾫灇㽏oI-gZB`CS");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_490672286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(490672286L))
            info.setReturnValue(-2074786458);
    }

    @Inject(at = @At("HEAD"), method = "distance()D", cancellable = true)
    private void distance_490666985(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(490666985L))
            info.setReturnValue(6.985529004971135E8D);
    }

    @Inject(at = @At("HEAD"), method = "direction()Lnet/minecraft/core/Direction;", cancellable = true)
    private void direction__310445741(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-310445741L))
            info.setReturnValue(net.minecraft.core.Direction.NORTH);
    }


}
