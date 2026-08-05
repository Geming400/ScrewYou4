package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.attribute.EnvironmentAttribute.Builder.class)
public class Builder_1528184838Mixin {
        @Inject(at = @At("HEAD"), method = "defaultValue(Ljava/lang/Object;)Lnet/minecraft/world/attribute/EnvironmentAttribute$Builder;", cancellable = true)
    private void defaultValue__1661470829(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1661470829L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/attribute/EnvironmentAttribute;", cancellable = true)
    private void build_155619558(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(155619558L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spatiallyInterpolated()Lnet/minecraft/world/attribute/EnvironmentAttribute$Builder;", cancellable = true)
    private void spatiallyInterpolated__1968157009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1968157009L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "notPositional()Lnet/minecraft/world/attribute/EnvironmentAttribute$Builder;", cancellable = true)
    private void notPositional__1968157009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1968157009L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "syncable()Lnet/minecraft/world/attribute/EnvironmentAttribute$Builder;", cancellable = true)
    private void syncable__1968157009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1968157009L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueRange(Lnet/minecraft/world/attribute/AttributeRange;)Lnet/minecraft/world/attribute/EnvironmentAttribute$Builder;", cancellable = true)
    private void valueRange__1370899451(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1370899451L))
            info.setReturnValue(null);
    }


}
