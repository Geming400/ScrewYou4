package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.resources.ResourceFilterSection.class)
public class ResourceFilterSection_648802703Mixin {
        @Inject(at = @At("HEAD"), method = "isNamespaceFiltered(Ljava/lang/String;)Z", cancellable = true)
    private void isNamespaceFiltered_1801167695(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1801167695L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isPathFiltered(Ljava/lang/String;)Z", cancellable = true)
    private void isPathFiltered_1801167695(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1801167695L))
            info.setReturnValue(null);
    }


}
