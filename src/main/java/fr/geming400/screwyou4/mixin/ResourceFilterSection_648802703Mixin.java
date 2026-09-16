package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.resources.ResourceFilterSection.class)
public class ResourceFilterSection_648802703Mixin {
        @Inject(at = @At("HEAD"), method = "isPathFiltered(Ljava/lang/String;)Z", cancellable = true)
    private void isPathFiltered__334903063(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-334903063L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isNamespaceFiltered(Ljava/lang/String;)Z", cancellable = true)
    private void isNamespaceFiltered__574745145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-574745145L))
            info.setReturnValue(false);
    }


}
