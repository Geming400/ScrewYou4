package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.repository.FolderRepositorySource.class)
public class FolderRepositorySource1330043091Mixin {
        @Inject(at = @At("HEAD"), method = "discoverPacks(Ljava/nio/file/Path;Lnet/minecraft/world/level/validation/DirectoryValidator;Ljava/util/function/BiConsumer;)V", cancellable = true)
    private static void discoverPacks_422210664(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(422210664L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "loadPacks(Ljava/util/function/Consumer;)V", cancellable = true)
    private void loadPacks_2011059504(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2011059504L))
            info.cancel();
    }


}
