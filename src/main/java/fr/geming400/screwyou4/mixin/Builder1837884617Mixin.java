package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.attribute.EnvironmentAttributeSystem.Builder.class)
public class Builder1837884617Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/attribute/EnvironmentAttributeSystem;", cancellable = true)
    private void build_1538870505(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1538870505L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addTimelineLayer(Lnet/minecraft/core/Holder;Lnet/minecraft/world/clock/ClockManager;)Lnet/minecraft/world/attribute/EnvironmentAttributeSystem$Builder;", cancellable = true)
    private void addTimelineLayer__1156093144(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1156093144L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addTimeBasedLayer(Lnet/minecraft/world/attribute/EnvironmentAttribute;Lnet/minecraft/world/attribute/EnvironmentAttributeLayer$TimeBased;)Lnet/minecraft/world/attribute/EnvironmentAttributeSystem$Builder;", cancellable = true)
    private void addTimeBasedLayer__1318386551(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1318386551L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addDefaultLayers(Lnet/minecraft/world/level/Level;)Lnet/minecraft/world/attribute/EnvironmentAttributeSystem$Builder;", cancellable = true)
    private void addDefaultLayers__402419277(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-402419277L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addConstantLayer(Lnet/minecraft/world/attribute/EnvironmentAttribute;Lnet/minecraft/world/attribute/EnvironmentAttributeLayer$Constant;)Lnet/minecraft/world/attribute/EnvironmentAttributeSystem$Builder;", cancellable = true)
    private void addConstantLayer_1889152835(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1889152835L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addConstantLayer(Lnet/minecraft/world/attribute/EnvironmentAttributeMap;)Lnet/minecraft/world/attribute/EnvironmentAttributeSystem$Builder;", cancellable = true)
    private void addConstantLayer__497652240(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-497652240L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addPositionalLayer(Lnet/minecraft/world/attribute/EnvironmentAttribute;Lnet/minecraft/world/attribute/EnvironmentAttributeLayer$Positional;)Lnet/minecraft/world/attribute/EnvironmentAttributeSystem$Builder;", cancellable = true)
    private void addPositionalLayer__872305149(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-872305149L))
            info.setReturnValue(null);
    }


}
