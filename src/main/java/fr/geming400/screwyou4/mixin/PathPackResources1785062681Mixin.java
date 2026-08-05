package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.PathPackResources.class)
public class PathPackResources1785062681Mixin {
        @Inject(at = @At("HEAD"), method = "getResource(Lnet/minecraft/server/packs/PackType;Lnet/minecraft/resources/Identifier;)Lnet/minecraft/server/packs/resources/IoSupplier;", cancellable = true)
    private void getResource__1246147177(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1246147177L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getResource(Ljava/nio/file/Path;Lnet/minecraft/resources/Identifier;)Lnet/minecraft/server/packs/resources/IoSupplier;", cancellable = true)
    private static void getResource_941262255(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(941262255L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__329512748(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-329512748L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNamespaces(Ljava/nio/file/Path;)Ljava/util/Set;", cancellable = true)
    private static void getNamespaces__1573084892(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1573084892L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNamespaces(Lnet/minecraft/server/packs/PackType;)Ljava/util/Set;", cancellable = true)
    private void getNamespaces__1884669920(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1884669920L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listResources(Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/String;Lnet/minecraft/server/packs/PackResources$ResourceOutput;)V", cancellable = true)
    private static void listResources_27695835(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(27695835L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "listResources(Lnet/minecraft/server/packs/PackType;Ljava/lang/String;Ljava/lang/String;Lnet/minecraft/server/packs/PackResources$ResourceOutput;)V", cancellable = true)
    private void listResources_467797149(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(467797149L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "listPath(Ljava/lang/String;Ljava/nio/file/Path;Ljava/util/List;Lnet/minecraft/server/packs/PackResources$ResourceOutput;)V", cancellable = true)
    private static void listPath__1222746736(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1222746736L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "validatePath(Ljava/nio/file/Path;)Z", cancellable = true)
    private static void validatePath__1135342804(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1135342804L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getRootResource([Ljava/lang/String;)Lnet/minecraft/server/packs/resources/IoSupplier;", cancellable = true)
    private void getRootResource__1227046097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1227046097L))
            info.setReturnValue(null);
    }


}
