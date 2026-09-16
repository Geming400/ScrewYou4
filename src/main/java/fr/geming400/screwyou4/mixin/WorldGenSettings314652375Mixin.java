package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.WorldGenSettings.class)
public class WorldGenSettings314652375Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1085075404(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1085075404L))
            info.setReturnValue("oZ|\u3C94\u3D8Arvu%\u7423 Nw8M");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_872003970(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(872003970L))
            info.setReturnValue(1435383030);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/world/level/levelgen/WorldOptions;Lnet/minecraft/core/RegistryAccess;)Lnet/minecraft/world/level/levelgen/WorldGenSettings;", cancellable = true)
    private static void of__223612278(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-223612278L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dimensions()Lnet/minecraft/world/level/levelgen/WorldDimensions;", cancellable = true)
    private void dimensions_700135898(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(700135898L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "options()Lnet/minecraft/world/level/levelgen/WorldOptions;", cancellable = true)
    private void options__917263702(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-917263702L))
            info.setReturnValue(null);
    }


}
