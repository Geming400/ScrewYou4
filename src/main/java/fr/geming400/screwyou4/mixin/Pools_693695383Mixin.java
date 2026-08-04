package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.worldgen.Pools.class)
public class Pools_693695383Mixin {
        @Inject(at = @At("HEAD"), method = "register(Lnet/minecraft/data/worldgen/BootstrapContext;Ljava/lang/String;Lnet/minecraft/world/level/levelgen/structure/pools/StructureTemplatePool;)V", cancellable = true)
    private static void register_1439945978(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1439945978L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/data/worldgen/BootstrapContext;)V", cancellable = true)
    private static void bootstrap__498823121(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-498823121L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "parseKey(Ljava/lang/String;)Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private static void parseKey__1109300023(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1109300023L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createKey(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private static void createKey_842565191(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(842565191L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createKey(Ljava/lang/String;)Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private static void createKey__1109300023(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1109300023L))
            info.setReturnValue(null);
    }


}
