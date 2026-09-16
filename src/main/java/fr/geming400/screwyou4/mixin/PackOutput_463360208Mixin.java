package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.PackOutput.class)
public class PackOutput_463360208Mixin {
        @Inject(at = @At("HEAD"), method = "createRegistryElementsPathProvider(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/data/PackOutput$PathProvider;", cancellable = true)
    private void createRegistryElementsPathProvider__729088700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-729088700L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRegistryTagsPathProvider(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/data/PackOutput$PathProvider;", cancellable = true)
    private void createRegistryTagsPathProvider__1663864350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1663864350L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRegistryComponentPathProvider(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/data/PackOutput$PathProvider;", cancellable = true)
    private void createRegistryComponentPathProvider_153923984(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(153923984L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createPathProvider(Lnet/minecraft/data/PackOutput$Target;Ljava/lang/String;)Lnet/minecraft/data/PackOutput$PathProvider;", cancellable = true)
    private void createPathProvider__1444222991(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1444222991L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOutputFolder()Ljava/nio/file/Path;", cancellable = true)
    private void getOutputFolder_182336754(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(182336754L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOutputFolder(Lnet/minecraft/data/PackOutput$Target;)Ljava/nio/file/Path;", cancellable = true)
    private void getOutputFolder_286838669(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(286838669L))
            info.setReturnValue(null);
    }


}
