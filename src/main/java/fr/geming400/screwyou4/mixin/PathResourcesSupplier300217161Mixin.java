package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.PathPackResources.PathResourcesSupplier.class)
public class PathResourcesSupplier300217161Mixin {
        @Inject(at = @At("HEAD"), method = "openPrimary(Lnet/minecraft/server/packs/PackLocationInfo;)Lnet/minecraft/server/packs/PackResources;", cancellable = true)
    private void openPrimary_1418971306(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1418971306L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "openFull(Lnet/minecraft/server/packs/PackLocationInfo;Lnet/minecraft/server/packs/repository/Pack$Metadata;)Lnet/minecraft/server/packs/PackResources;", cancellable = true)
    private void openFull__351010447(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-351010447L))
            info.setReturnValue(null);
    }


}
