package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.worldgen.Pools.class)
public class Pools_693695383Mixin {
        @Inject(at = @At("HEAD"), method = "register(Lnet/minecraft/data/worldgen/BootstrapContext;Ljava/lang/String;Lnet/minecraft/world/level/levelgen/structure/pools/StructureTemplatePool;)V", cancellable = true)
    private static void register_1502174199(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1502174199L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/data/worldgen/BootstrapContext;)V", cancellable = true)
    private static void bootstrap_139089665(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(139089665L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "parseKey(Ljava/lang/String;)Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private static void parseKey_1904191133(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1904191133L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createKey(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private static void createKey_1205763940(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1205763940L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createKey(Ljava/lang/String;)Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private static void createKey__1527553242(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1527553242L))
            info.setReturnValue(null);
    }


}
