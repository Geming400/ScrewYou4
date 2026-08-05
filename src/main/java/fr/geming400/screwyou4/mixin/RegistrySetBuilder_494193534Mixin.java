package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.RegistrySetBuilder.class)
public class RegistrySetBuilder_494193534Mixin {
        @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/core/RegistrySetBuilder$RegistryBootstrap;)Lnet/minecraft/core/RegistrySetBuilder;", cancellable = true)
    private void add__1328771486(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1328771486L))
            info.setReturnValue(new net.minecraft.core.RegistrySetBuilder());
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/resources/ResourceKey;Lcom/mojang/serialization/Lifecycle;Lnet/minecraft/core/RegistrySetBuilder$RegistryBootstrap;)Lnet/minecraft/core/RegistrySetBuilder;", cancellable = true)
    private void add__328140529(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-328140529L))
            info.setReturnValue(new net.minecraft.core.RegistrySetBuilder());
    }

    @Inject(at = @At("HEAD"), method = "build(Lnet/minecraft/core/RegistryAccess;)Lnet/minecraft/core/HolderLookup$Provider;", cancellable = true)
    private void build_1063384912(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1063384912L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "buildPatch(Lnet/minecraft/core/RegistryAccess;Lnet/minecraft/core/HolderLookup$Provider;Lnet/minecraft/core/Cloner$Factory;)Lnet/minecraft/core/RegistrySetBuilder$PatchedRegistries;", cancellable = true)
    private void buildPatch_1246121025(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1246121025L))
            info.setReturnValue(null);
    }


}
