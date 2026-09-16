package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.repository.FolderRepositorySource.class)
public class FolderRepositorySource1330043091Mixin {
        @Inject(at = @At("HEAD"), method = "discoverPacks(Ljava/nio/file/Path;Lnet/minecraft/world/level/validation/DirectoryValidator;Ljava/util/function/BiConsumer;)V", cancellable = true)
    private static void discoverPacks_1314445687(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1314445687L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "loadPacks(Ljava/util/function/Consumer;)V", cancellable = true)
    private void loadPacks__922119068(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-922119068L))
            info.cancel();
    }


}
