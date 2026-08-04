package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.ChunkPalettedStorageFix.Direction.Axis.class)
public class Axis_1956437388Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/util/datafix/fixes/ChunkPalettedStorageFix$Direction$Axis;", cancellable = true)
    private static void values_544784139(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(544784139L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/util/datafix/fixes/ChunkPalettedStorageFix$Direction$Axis;", cancellable = true)
    private static void valueOf__1986968274(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1986968274L))
            info.setReturnValue(null);
    }


}
