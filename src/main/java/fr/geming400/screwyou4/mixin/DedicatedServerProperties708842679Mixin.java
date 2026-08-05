package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.dedicated.DedicatedServerProperties.class)
public class DedicatedServerProperties708842679Mixin {
        @Inject(at = @At("HEAD"), method = "createDimensions(Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/world/level/levelgen/WorldDimensions;", cancellable = true)
    private void createDimensions_1109650577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1109650577L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deserializePermission(Ljava/lang/String;)Lnet/minecraft/server/permissions/LevelBasedPermissionSet;", cancellable = true)
    private static void deserializePermission__1584798254(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1584798254L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "serializePermission(Lnet/minecraft/server/permissions/LevelBasedPermissionSet;)Ljava/lang/String;", cancellable = true)
    private static void serializePermission_139442570(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(139442570L))
            info.setReturnValue("LkEEXf\"jJ4");
    }

    @Inject(at = @At("HEAD"), method = "fromFile(Ljava/nio/file/Path;)Lnet/minecraft/server/dedicated/DedicatedServerProperties;", cancellable = true)
    private static void fromFile_1490819857(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1490819857L))
            info.setReturnValue(null);
    }


}
