package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.repository.ServerPacksSource.class)
public class ServerPacksSource_1085938396Mixin {
        @Inject(at = @At("HEAD"), method = "createVanillaPackSource()Lnet/minecraft/server/packs/VanillaPackResources;", cancellable = true)
    private static void createVanillaPackSource_849446105(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(849446105L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createPackRepository(Ljava/nio/file/Path;Lnet/minecraft/world/level/validation/DirectoryValidator;)Lnet/minecraft/server/packs/repository/PackRepository;", cancellable = true)
    private static void createPackRepository_1978230253(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1978230253L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createPackRepository(Lnet/minecraft/world/level/storage/LevelStorageSource$LevelStorageAccess;)Lnet/minecraft/server/packs/repository/PackRepository;", cancellable = true)
    private static void createPackRepository__965776628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-965776628L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createVanillaTrustedRepository()Lnet/minecraft/server/packs/repository/PackRepository;", cancellable = true)
    private static void createVanillaTrustedRepository__425431386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-425431386L))
            info.setReturnValue(null);
    }


}
