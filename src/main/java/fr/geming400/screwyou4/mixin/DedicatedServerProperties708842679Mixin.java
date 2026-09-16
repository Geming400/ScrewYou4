package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.dedicated.DedicatedServerProperties.class)
public class DedicatedServerProperties708842679Mixin {
        @Inject(at = @At("HEAD"), method = "fromFile(Ljava/nio/file/Path;)Lnet/minecraft/server/dedicated/DedicatedServerProperties;", cancellable = true)
    private static void fromFile_183779799(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(183779799L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deserializePermission(Ljava/lang/String;)Lnet/minecraft/server/permissions/LevelBasedPermissionSet;", cancellable = true)
    private static void deserializePermission_102089856(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(102089856L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "serializePermission(Lnet/minecraft/server/permissions/LevelBasedPermissionSet;)Ljava/lang/String;", cancellable = true)
    private static void serializePermission__722848679(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-722848679L))
            info.setReturnValue(",\u672Do07*X(:zr<Bft#_1hT=Y+9CB6E)me7T&\u35B5\uFC83+SK9Z\u1397];,@k?\uC82AP>udmRov|3F:\uA96B@aq\uAD0FL\u89BCp`/g?1T,m;\u4EF0");
    }

    @Inject(at = @At("HEAD"), method = "createDimensions(Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/world/level/levelgen/WorldDimensions;", cancellable = true)
    private void createDimensions_1466833978(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1466833978L))
            info.setReturnValue(null);
    }


}
