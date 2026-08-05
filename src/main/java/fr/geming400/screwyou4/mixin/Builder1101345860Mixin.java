package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.attribute.EnvironmentAttributeMap.Builder.class)
public class Builder1101345860Mixin {
        @Inject(at = @At("HEAD"), method = "putAll(Lnet/minecraft/world/attribute/EnvironmentAttributeMap;)Lnet/minecraft/world/attribute/EnvironmentAttributeMap$Builder;", cancellable = true)
    private void putAll__1629095332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1629095332L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(Lnet/minecraft/world/attribute/EnvironmentAttribute;Ljava/lang/Object;)Lnet/minecraft/world/attribute/EnvironmentAttributeMap$Builder;", cancellable = true)
    private void set__1330587266(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1330587266L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/attribute/EnvironmentAttributeMap;", cancellable = true)
    private void build_1006179435(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1006179435L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "modify(Lnet/minecraft/world/attribute/EnvironmentAttribute;Lnet/minecraft/world/attribute/modifier/AttributeModifier;Ljava/lang/Object;)Lnet/minecraft/world/attribute/EnvironmentAttributeMap$Builder;", cancellable = true)
    private void modify__655689034(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-655689034L))
            info.setReturnValue(null);
    }


}
