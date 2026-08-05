package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.attribute.EnvironmentAttributeSystem.class)
public class EnvironmentAttributeSystem128999338Mixin {
        @Inject(at = @At("HEAD"), method = "getValue(Lnet/minecraft/world/attribute/EnvironmentAttribute;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/attribute/SpatialAttributeInterpolator;)Ljava/lang/Object;", cancellable = true)
    private void getValue__1792333388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1792333388L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "builder()Lnet/minecraft/world/attribute/EnvironmentAttributeSystem$Builder;", cancellable = true)
    private static void builder__979123464(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-979123464L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDimensionValue(Lnet/minecraft/world/attribute/EnvironmentAttribute;)Ljava/lang/Object;", cancellable = true)
    private void getDimensionValue__1067289788(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1067289788L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "invalidateTickCache()V", cancellable = true)
    private void invalidateTickCache__1097179213(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1097179213L))
            info.cancel();
    }


}
