package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.LevelVersion.class)
public class LevelVersion_1645275876Mixin {
        @Inject(at = @At("HEAD"), method = "snapshot()Z", cancellable = true)
    private void snapshot_1683554458(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1683554458L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/serialization/Dynamic;)Lnet/minecraft/world/level/storage/LevelVersion;", cancellable = true)
    private static void parse_1078664519(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1078664519L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "minecraftVersion()Lnet/minecraft/world/level/storage/DataVersion;", cancellable = true)
    private void minecraftVersion__565602551(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-565602551L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "minecraftVersionName()Ljava/lang/String;", cancellable = true)
    private void minecraftVersionName_509815404(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(509815404L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lastPlayed()J", cancellable = true)
    private void lastPlayed_1683539082(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1683539082L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "levelDataVersion()I", cancellable = true)
    private void levelDataVersion_1683538121(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1683538121L))
            info.setReturnValue(null);
    }


}
