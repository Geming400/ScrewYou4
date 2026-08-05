package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.PackOutput.class)
public class PackOutput_463360208Mixin {
        @Inject(at = @At("HEAD"), method = "getOutputFolder(Lnet/minecraft/data/PackOutput$Target;)Ljava/nio/file/Path;", cancellable = true)
    private void getOutputFolder__835896568(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-835896568L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOutputFolder()Ljava/nio/file/Path;", cancellable = true)
    private void getOutputFolder__671003475(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-671003475L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRegistryComponentPathProvider(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/data/PackOutput$PathProvider;", cancellable = true)
    private void createRegistryComponentPathProvider_57208906(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(57208906L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRegistryElementsPathProvider(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/data/PackOutput$PathProvider;", cancellable = true)
    private void createRegistryElementsPathProvider_57208906(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(57208906L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRegistryTagsPathProvider(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/data/PackOutput$PathProvider;", cancellable = true)
    private void createRegistryTagsPathProvider_57208906(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(57208906L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createPathProvider(Lnet/minecraft/data/PackOutput$Target;Ljava/lang/String;)Lnet/minecraft/data/PackOutput$PathProvider;", cancellable = true)
    private void createPathProvider__1137803873(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1137803873L))
            info.setReturnValue(null);
    }


}
