package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.ChunkPalettedStorageFix.Direction.AxisDirection.class)
public class AxisDirection1865878159Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/util/datafix/fixes/ChunkPalettedStorageFix$Direction$AxisDirection;", cancellable = true)
    private static void values__1047382864(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1047382864L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/util/datafix/fixes/ChunkPalettedStorageFix$Direction$AxisDirection;", cancellable = true)
    private static void valueOf_1913164919(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1913164919L))
            info.setReturnValue(net.minecraft.util.datafix.fixes.ChunkPalettedStorageFix.Direction.AxisDirection.NEGATIVE);
    }

    @Inject(at = @At("HEAD"), method = "getStep()I", cancellable = true)
    private void getStep__1146705293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1146705293L))
            info.setReturnValue(1080025057);
    }


}
