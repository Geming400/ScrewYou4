package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.WorldStem.class)
public class WorldStem_753983171Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2139495429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2139495429L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__381476805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-381476805L))
            info.setReturnValue("\u6FD5XY-zQ9`cCx\uD069w/p7\uAD61+8/&YRN\"E\u8194E\uAFF2m?\uD7D6+,\u0384bl)d>\u8D7D{\u43F6[;Am\uA40C;sF>T%\"");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_792245912(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(792245912L))
            info.setReturnValue(871739434);
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_792257909(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(792257909L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registries()Lnet/minecraft/core/LayeredRegistryAccess;", cancellable = true)
    private void registries__1108037061(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1108037061L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "worldDataAndGenSettings()Lnet/minecraft/world/level/storage/LevelDataAndDimensions$WorldDataAndGenSettings;", cancellable = true)
    private void worldDataAndGenSettings_1004037526(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1004037526L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resourceManager()Lnet/minecraft/server/packs/resources/CloseableResourceManager;", cancellable = true)
    private void resourceManager__1454615774(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1454615774L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dataPackResources()Lnet/minecraft/server/ReloadableServerResources;", cancellable = true)
    private void dataPackResources_1250261561(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1250261561L))
            info.setReturnValue(null);
    }


}
