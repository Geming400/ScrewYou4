package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.RegistrySetBuilder.class)
public class RegistrySetBuilder_494193534Mixin {
        @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/core/RegistrySetBuilder$RegistryBootstrap;)Lnet/minecraft/core/RegistrySetBuilder;", cancellable = true)
    private void add_998101475(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(998101475L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/resources/ResourceKey;Lcom/mojang/serialization/Lifecycle;Lnet/minecraft/core/RegistrySetBuilder$RegistryBootstrap;)Lnet/minecraft/core/RegistrySetBuilder;", cancellable = true)
    private void add__2037493744(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2037493744L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build(Lnet/minecraft/core/RegistryAccess;)Lnet/minecraft/core/HolderLookup$Provider;", cancellable = true)
    private void build_458056702(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(458056702L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "buildPatch(Lnet/minecraft/core/RegistryAccess;Lnet/minecraft/core/HolderLookup$Provider;Lnet/minecraft/core/Cloner$Factory;)Lnet/minecraft/core/RegistrySetBuilder$PatchedRegistries;", cancellable = true)
    private void buildPatch__316887941(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-316887941L))
            info.setReturnValue(null);
    }


}
