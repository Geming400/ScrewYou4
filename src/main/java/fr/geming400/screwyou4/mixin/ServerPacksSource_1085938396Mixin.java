package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.repository.ServerPacksSource.class)
public class ServerPacksSource_1085938396Mixin {
        @Inject(at = @At("HEAD"), method = "createVanillaPackSource()Lnet/minecraft/server/packs/VanillaPackResources;", cancellable = true)
    private static void createVanillaPackSource_376582886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(376582886L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createPackRepository(Ljava/nio/file/Path;Lnet/minecraft/world/level/validation/DirectoryValidator;)Lnet/minecraft/server/packs/repository/PackRepository;", cancellable = true)
    private static void createPackRepository_198355630(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(198355630L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createPackRepository(Lnet/minecraft/world/level/storage/LevelStorageSource$LevelStorageAccess;)Lnet/minecraft/server/packs/repository/PackRepository;", cancellable = true)
    private static void createPackRepository_1232287821(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1232287821L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createVanillaTrustedRepository()Lnet/minecraft/server/packs/repository/PackRepository;", cancellable = true)
    private static void createVanillaTrustedRepository_479143592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(479143592L))
            info.setReturnValue(null);
    }


}
