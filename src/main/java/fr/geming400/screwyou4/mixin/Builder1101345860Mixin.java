package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.attribute.EnvironmentAttributeMap.Builder.class)
public class Builder1101345860Mixin {
        @Inject(at = @At("HEAD"), method = "putAll(Lnet/minecraft/world/attribute/EnvironmentAttributeMap;)Lnet/minecraft/world/attribute/EnvironmentAttributeMap$Builder;", cancellable = true)
    private void putAll__1847728950(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1847728950L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(Lnet/minecraft/world/attribute/EnvironmentAttribute;Ljava/lang/Object;)Lnet/minecraft/world/attribute/EnvironmentAttributeMap$Builder;", cancellable = true)
    private void set__1898076256(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1898076256L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/attribute/EnvironmentAttributeMap;", cancellable = true)
    private void build__1182320743(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1182320743L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "modify(Lnet/minecraft/world/attribute/EnvironmentAttribute;Lnet/minecraft/world/attribute/modifier/AttributeModifier;Ljava/lang/Object;)Lnet/minecraft/world/attribute/EnvironmentAttributeMap$Builder;", cancellable = true)
    private void modify__273254992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-273254992L))
            info.setReturnValue(null);
    }


}
