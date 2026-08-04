package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.equipment.trim.TrimPatterns.class)
public class TrimPatterns2091055861Mixin {
        @Inject(at = @At("HEAD"), method = "register(Lnet/minecraft/data/worldgen/BootstrapContext;Lnet/minecraft/resources/ResourceKey;)V", cancellable = true)
    private static void register__2006376714(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2006376714L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/data/worldgen/BootstrapContext;)V", cancellable = true)
    private static void bootstrap_898537358(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(898537358L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "defaultAssetId(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private static void defaultAssetId_1038990384(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1038990384L))
            info.setReturnValue(null);
    }


}
