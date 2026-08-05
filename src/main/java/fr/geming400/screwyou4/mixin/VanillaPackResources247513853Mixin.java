package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.VanillaPackResources.class)
public class VanillaPackResources247513853Mixin {
        @Inject(at = @At("HEAD"), method = "getResource(Lnet/minecraft/server/packs/PackType;Lnet/minecraft/resources/Identifier;)Lnet/minecraft/server/packs/resources/IoSupplier;", cancellable = true)
    private void getResource__916465417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-916465417L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "location()Lnet/minecraft/server/packs/PackLocationInfo;", cancellable = true)
    private void location_2108468408(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2108468408L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_285788592(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(285788592L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "listRawPaths(Lnet/minecraft/server/packs/PackType;Lnet/minecraft/resources/Identifier;Ljava/util/function/Consumer;)V", cancellable = true)
    private void listRawPaths_1655590395(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1655590395L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNamespaces(Lnet/minecraft/server/packs/PackType;)Ljava/util/Set;", cancellable = true)
    private void getNamespaces__1243403882(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1243403882L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMetadataSection(Lnet/minecraft/server/packs/metadata/MetadataSectionType;)Ljava/lang/Object;", cancellable = true)
    private void getMetadataSection__692994178(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-692994178L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asProvider()Lnet/minecraft/server/packs/resources/ResourceProvider;", cancellable = true)
    private void asProvider__1601682421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1601682421L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listResources(Lnet/minecraft/server/packs/PackType;Ljava/lang/String;Ljava/lang/String;Lnet/minecraft/server/packs/PackResources$ResourceOutput;)V", cancellable = true)
    private void listResources_1776974728(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1776974728L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRootResource([Ljava/lang/String;)Lnet/minecraft/server/packs/resources/IoSupplier;", cancellable = true)
    private void getRootResource__185238131(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-185238131L))
            info.setReturnValue(null);
    }


}
