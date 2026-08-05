package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.VanillaPackResourcesBuilder.class)
public class VanillaPackResourcesBuilder_1183255876Mixin {
        @Inject(at = @At("HEAD"), method = "build(Lnet/minecraft/server/packs/PackLocationInfo;)Lnet/minecraft/server/packs/VanillaPackResources;", cancellable = true)
    private void build_2112160727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2112160727L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pushUniversalPath(Ljava/nio/file/Path;)Lnet/minecraft/server/packs/VanillaPackResourcesBuilder;", cancellable = true)
    private void pushUniversalPath__18146827(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-18146827L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pushClasspathResources(Lnet/minecraft/server/packs/PackType;Ljava/lang/Class;)Lnet/minecraft/server/packs/VanillaPackResourcesBuilder;", cancellable = true)
    private void pushClasspathResources_60702296(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(60702296L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setMetadata(Lnet/minecraft/server/packs/resources/ResourceMetadata;)Lnet/minecraft/server/packs/VanillaPackResourcesBuilder;", cancellable = true)
    private void setMetadata__556384143(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-556384143L))
            info.setReturnValue(new net.minecraft.server.packs.VanillaPackResourcesBuilder());
    }

    @Inject(at = @At("HEAD"), method = "applyDevelopmentConfig()Lnet/minecraft/server/packs/VanillaPackResourcesBuilder;", cancellable = true)
    private void applyDevelopmentConfig_1651749428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1651749428L))
            info.setReturnValue(new net.minecraft.server.packs.VanillaPackResourcesBuilder());
    }

    @Inject(at = @At("HEAD"), method = "pushAssetPath(Lnet/minecraft/server/packs/PackType;Ljava/nio/file/Path;)Lnet/minecraft/server/packs/VanillaPackResourcesBuilder;", cancellable = true)
    private void pushAssetPath__355452706(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-355452706L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pushJarResources()Lnet/minecraft/server/packs/VanillaPackResourcesBuilder;", cancellable = true)
    private void pushJarResources_1651749428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1651749428L))
            info.setReturnValue(new net.minecraft.server.packs.VanillaPackResourcesBuilder());
    }

    @Inject(at = @At("HEAD"), method = "exposeNamespace([Ljava/lang/String;)Lnet/minecraft/server/packs/VanillaPackResourcesBuilder;", cancellable = true)
    private void exposeNamespace_2020769599(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2020769599L))
            info.setReturnValue(null);
    }


}
