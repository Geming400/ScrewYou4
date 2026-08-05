package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.attribute.EnvironmentAttributeSystem.class)
public class EnvironmentAttributeSystem128999338Mixin {
        @Inject(at = @At("HEAD"), method = "getValue(Lnet/minecraft/world/attribute/EnvironmentAttribute;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/attribute/SpatialAttributeInterpolator;)Ljava/lang/Object;", cancellable = true)
    private void getValue__55711601(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-55711601L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "builder()Lnet/minecraft/world/attribute/EnvironmentAttributeSystem$Builder;", cancellable = true)
    private static void builder__1773040739(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1773040739L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "invalidateTickCache()V", cancellable = true)
    private void invalidateTickCache_167274077(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(167274077L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDimensionValue(Lnet/minecraft/world/attribute/EnvironmentAttribute;)Ljava/lang/Object;", cancellable = true)
    private void getDimensionValue__650829853(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-650829853L))
            info.setReturnValue(new java.lang.Object());
    }


}
