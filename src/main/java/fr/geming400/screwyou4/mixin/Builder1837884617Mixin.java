package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.attribute.EnvironmentAttributeSystem.Builder.class)
public class Builder1837884617Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/attribute/EnvironmentAttributeSystem;", cancellable = true)
    private void build_1533620987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1533620987L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addConstantLayer(Lnet/minecraft/world/attribute/EnvironmentAttribute;Lnet/minecraft/world/attribute/EnvironmentAttributeLayer$Constant;)Lnet/minecraft/world/attribute/EnvironmentAttributeSystem$Builder;", cancellable = true)
    private void addConstantLayer__1930638249(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1930638249L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addConstantLayer(Lnet/minecraft/world/attribute/EnvironmentAttributeMap;)Lnet/minecraft/world/attribute/EnvironmentAttributeSystem$Builder;", cancellable = true)
    private void addConstantLayer_154719068(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(154719068L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addPositionalLayer(Lnet/minecraft/world/attribute/EnvironmentAttribute;Lnet/minecraft/world/attribute/EnvironmentAttributeLayer$Positional;)Lnet/minecraft/world/attribute/EnvironmentAttributeSystem$Builder;", cancellable = true)
    private void addPositionalLayer__441019577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-441019577L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addDefaultLayers(Lnet/minecraft/world/level/Level;)Lnet/minecraft/world/attribute/EnvironmentAttributeSystem$Builder;", cancellable = true)
    private void addDefaultLayers_1854701493(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1854701493L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addTimeBasedLayer(Lnet/minecraft/world/attribute/EnvironmentAttribute;Lnet/minecraft/world/attribute/EnvironmentAttributeLayer$TimeBased;)Lnet/minecraft/world/attribute/EnvironmentAttributeSystem$Builder;", cancellable = true)
    private void addTimeBasedLayer_189955093(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(189955093L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addTimelineLayer(Lnet/minecraft/core/Holder;Lnet/minecraft/world/clock/ClockManager;)Lnet/minecraft/world/attribute/EnvironmentAttributeSystem$Builder;", cancellable = true)
    private void addTimelineLayer__447822665(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-447822665L))
            info.setReturnValue(null);
    }


}
