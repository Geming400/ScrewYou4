package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.resources.ResourceMetadata.MapBased.class)
public class MapBased_873926120Mixin {
        @Inject(at = @At("HEAD"), method = "getSection(Lnet/minecraft/server/packs/metadata/MetadataSectionType;)Ljava/util/Optional;", cancellable = true)
    private void getSection__743025413(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-743025413L))
            info.setReturnValue(null);
    }


}
