package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.FilePackResources.FileResourcesSupplier.class)
public class FileResourcesSupplier321119643Mixin {
        @Inject(at = @At("HEAD"), method = "openFull(Lnet/minecraft/server/packs/PackLocationInfo;Lnet/minecraft/server/packs/repository/Pack$Metadata;)Lnet/minecraft/server/packs/PackResources;", cancellable = true)
    private void openFull_904583612(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(904583612L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "openPrimary(Lnet/minecraft/server/packs/PackLocationInfo;)Lnet/minecraft/server/packs/PackResources;", cancellable = true)
    private void openPrimary_2147437476(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2147437476L))
            info.setReturnValue(null);
    }


}
