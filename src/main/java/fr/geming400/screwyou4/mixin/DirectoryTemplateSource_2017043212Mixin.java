package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.templatesystem.loader.DirectoryTemplateSource.class)
public class DirectoryTemplateSource_2017043212Mixin {
        @Inject(at = @At("HEAD"), method = "load(Lnet/minecraft/resources/Identifier;)Ljava/util/Optional;", cancellable = true)
    private void load_1683151665(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1683151665L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "list()Ljava/util/stream/Stream;", cancellable = true)
    private void list_1806336896(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1806336896L))
            info.setReturnValue(null);
    }


}
