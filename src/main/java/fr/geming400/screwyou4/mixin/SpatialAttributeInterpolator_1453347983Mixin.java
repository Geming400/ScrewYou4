package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.attribute.SpatialAttributeInterpolator.class)
public class SpatialAttributeInterpolator_1453347983Mixin {
        @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_1491622721(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1491622721L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "applyAttributeLayer(Lnet/minecraft/world/attribute/EnvironmentAttribute;Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void applyAttributeLayer_1299853099(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1299853099L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "accumulate(DLnet/minecraft/world/attribute/EnvironmentAttributeMap;)Lnet/minecraft/world/attribute/SpatialAttributeInterpolator;", cancellable = true)
    private void accumulate_1874518821(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1874518821L))
            info.setReturnValue(new net.minecraft.world.attribute.SpatialAttributeInterpolator());
    }


}
