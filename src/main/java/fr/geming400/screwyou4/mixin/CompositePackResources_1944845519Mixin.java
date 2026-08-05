package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.CompositePackResources.class)
public class CompositePackResources_1944845519Mixin {
        @Inject(at = @At("HEAD"), method = "getResource(Lnet/minecraft/server/packs/PackType;Lnet/minecraft/resources/Identifier;)Lnet/minecraft/server/packs/resources/IoSupplier;", cancellable = true)
    private void getResource__1086364340(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1086364340L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "location()Lnet/minecraft/server/packs/PackLocationInfo;", cancellable = true)
    private void location_277388148(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(277388148L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__169729911(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-169729911L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNamespaces(Lnet/minecraft/server/packs/PackType;)Ljava/util/Set;", cancellable = true)
    private void getNamespaces__1724887083(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1724887083L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMetadataSection(Lnet/minecraft/server/packs/metadata/MetadataSectionType;)Ljava/lang/Object;", cancellable = true)
    private void getMetadataSection_1618960079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1618960079L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "listResources(Lnet/minecraft/server/packs/PackType;Ljava/lang/String;Ljava/lang/String;Lnet/minecraft/server/packs/PackResources$ResourceOutput;)V", cancellable = true)
    private void listResources_627579986(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(627579986L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRootResource([Ljava/lang/String;)Lnet/minecraft/server/packs/resources/IoSupplier;", cancellable = true)
    private void getRootResource__1067263260(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1067263260L))
            info.setReturnValue(null);
    }


}
