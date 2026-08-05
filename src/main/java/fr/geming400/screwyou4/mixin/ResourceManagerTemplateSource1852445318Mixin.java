package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.templatesystem.loader.ResourceManagerTemplateSource.class)
public class ResourceManagerTemplateSource1852445318Mixin {
        @Inject(at = @At("HEAD"), method = "load(Lnet/minecraft/resources/Identifier;)Ljava/util/Optional;", cancellable = true)
    private void load_1212564114(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1212564114L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "list()Ljava/util/stream/Stream;", cancellable = true)
    private void list_125316893(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(125316893L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setResourceManager(Lnet/minecraft/server/packs/resources/ResourceManager;)V", cancellable = true)
    private void setResourceManager__580550237(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-580550237L))
            info.cancel();
    }


}
