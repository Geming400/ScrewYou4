package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.PathPackResources.class)
public class PathPackResources1785062681Mixin {
        @Inject(at = @At("HEAD"), method = "getResource(Lnet/minecraft/server/packs/PackType;Lnet/minecraft/resources/Identifier;)Lnet/minecraft/server/packs/resources/IoSupplier;", cancellable = true)
    private void getResource_621083411(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(621083411L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getResource(Ljava/nio/file/Path;Lnet/minecraft/resources/Identifier;)Lnet/minecraft/server/packs/resources/IoSupplier;", cancellable = true)
    private static void getResource_861126835(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(861126835L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_1823337420(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1823337420L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNamespaces(Ljava/nio/file/Path;)Ljava/util/Set;", cancellable = true)
    private static void getNamespaces_20639570(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(20639570L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNamespaces(Lnet/minecraft/server/packs/PackType;)Ljava/util/Set;", cancellable = true)
    private void getNamespaces_294144946(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(294144946L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validatePath(Ljava/nio/file/Path;)Z", cancellable = true)
    private static void validatePath__902613721(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-902613721L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "listResources(Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/String;Lnet/minecraft/server/packs/PackResources$ResourceOutput;)V", cancellable = true)
    private static void listResources_2043647732(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2043647732L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "listResources(Lnet/minecraft/server/packs/PackType;Ljava/lang/String;Ljava/lang/String;Lnet/minecraft/server/packs/PackResources$ResourceOutput;)V", cancellable = true)
    private void listResources__980443740(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-980443740L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRootResource([Ljava/lang/String;)Lnet/minecraft/server/packs/resources/IoSupplier;", cancellable = true)
    private void getRootResource_1352310697(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1352310697L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listPath(Ljava/lang/String;Ljava/nio/file/Path;Ljava/util/List;Lnet/minecraft/server/packs/PackResources$ResourceOutput;)V", cancellable = true)
    private static void listPath_75958061(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(75958061L))
            info.cancel();
    }


}
