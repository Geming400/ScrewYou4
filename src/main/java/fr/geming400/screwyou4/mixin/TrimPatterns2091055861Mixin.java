package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.equipment.trim.TrimPatterns.class)
public class TrimPatterns2091055861Mixin {
        @Inject(at = @At("HEAD"), method = "register(Lnet/minecraft/data/worldgen/BootstrapContext;Lnet/minecraft/resources/ResourceKey;)V", cancellable = true)
    private static void register_1889385625(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1889385625L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/data/worldgen/BootstrapContext;)V", cancellable = true)
    private static void bootstrap_1536450144(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1536450144L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "defaultAssetId(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private static void defaultAssetId__2137763386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2137763386L))
            info.setReturnValue(null);
    }


}
