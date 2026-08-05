package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.attribute.SpatialAttributeInterpolator.class)
public class SpatialAttributeInterpolator_1453347983Mixin {
        @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_667520276(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(667520276L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "accumulate(DLnet/minecraft/world/attribute/EnvironmentAttributeMap;)Lnet/minecraft/world/attribute/SpatialAttributeInterpolator;", cancellable = true)
    private void accumulate_379783815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(379783815L))
            info.setReturnValue(new net.minecraft.world.attribute.SpatialAttributeInterpolator());
    }

    @Inject(at = @At("HEAD"), method = "applyAttributeLayer(Lnet/minecraft/world/attribute/EnvironmentAttribute;Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void applyAttributeLayer__1382971442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1382971442L))
            info.setReturnValue(null);
    }


}
