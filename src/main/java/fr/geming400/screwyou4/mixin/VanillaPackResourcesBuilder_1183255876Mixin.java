package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.VanillaPackResourcesBuilder.class)
public class VanillaPackResourcesBuilder_1183255876Mixin {
        @Inject(at = @At("HEAD"), method = "build(Lnet/minecraft/server/packs/PackLocationInfo;)Lnet/minecraft/server/packs/VanillaPackResources;", cancellable = true)
    private void build_1071857349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1071857349L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "applyDevelopmentConfig()Lnet/minecraft/server/packs/VanillaPackResourcesBuilder;", cancellable = true)
    private void applyDevelopmentConfig__2090363837(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2090363837L))
            info.setReturnValue(new net.minecraft.server.packs.VanillaPackResourcesBuilder());
    }

    @Inject(at = @At("HEAD"), method = "pushJarResources()Lnet/minecraft/server/packs/VanillaPackResourcesBuilder;", cancellable = true)
    private void pushJarResources__1080880456(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1080880456L))
            info.setReturnValue(new net.minecraft.server.packs.VanillaPackResourcesBuilder());
    }

    @Inject(at = @At("HEAD"), method = "exposeNamespace([Ljava/lang/String;)Lnet/minecraft/server/packs/VanillaPackResourcesBuilder;", cancellable = true)
    private void exposeNamespace_1948241000(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1948241000L))
            info.setReturnValue(new net.minecraft.server.packs.VanillaPackResourcesBuilder());
    }

    @Inject(at = @At("HEAD"), method = "setMetadata(Lnet/minecraft/server/packs/resources/ResourceMetadata;)Lnet/minecraft/server/packs/VanillaPackResourcesBuilder;", cancellable = true)
    private void setMetadata_968837920(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(968837920L))
            info.setReturnValue(new net.minecraft.server.packs.VanillaPackResourcesBuilder());
    }

    @Inject(at = @At("HEAD"), method = "pushAssetPath(Lnet/minecraft/server/packs/PackType;Ljava/nio/file/Path;)Lnet/minecraft/server/packs/VanillaPackResourcesBuilder;", cancellable = true)
    private void pushAssetPath__1224161661(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1224161661L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pushClasspathResources(Lnet/minecraft/server/packs/PackType;Ljava/lang/Class;)Lnet/minecraft/server/packs/VanillaPackResourcesBuilder;", cancellable = true)
    private void pushClasspathResources_1545133978(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1545133978L))
            info.setReturnValue(new net.minecraft.server.packs.VanillaPackResourcesBuilder());
    }

    @Inject(at = @At("HEAD"), method = "pushUniversalPath(Ljava/nio/file/Path;)Lnet/minecraft/server/packs/VanillaPackResourcesBuilder;", cancellable = true)
    private void pushUniversalPath__1719365109(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1719365109L))
            info.setReturnValue(new net.minecraft.server.packs.VanillaPackResourcesBuilder());
    }


}
