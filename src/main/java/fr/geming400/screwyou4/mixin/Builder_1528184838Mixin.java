package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.attribute.EnvironmentAttribute.Builder.class)
public class Builder_1528184838Mixin {
        @Inject(at = @At("HEAD"), method = "defaultValue(Ljava/lang/Object;)Lnet/minecraft/world/attribute/EnvironmentAttribute$Builder;", cancellable = true)
    private void defaultValue__1466992829(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1466992829L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/attribute/EnvironmentAttribute;", cancellable = true)
    private void build_645150036(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(645150036L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueRange(Lnet/minecraft/world/attribute/AttributeRange;)Lnet/minecraft/world/attribute/EnvironmentAttribute$Builder;", cancellable = true)
    private void valueRange__1800852143(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1800852143L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "syncable()Lnet/minecraft/world/attribute/EnvironmentAttribute$Builder;", cancellable = true)
    private void syncable_321982756(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(321982756L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "notPositional()Lnet/minecraft/world/attribute/EnvironmentAttribute$Builder;", cancellable = true)
    private void notPositional_1175580918(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1175580918L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spatiallyInterpolated()Lnet/minecraft/world/attribute/EnvironmentAttribute$Builder;", cancellable = true)
    private void spatiallyInterpolated__207293853(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-207293853L))
            info.setReturnValue(null);
    }


}
