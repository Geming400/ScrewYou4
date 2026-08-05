package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.ChunkPalettedStorageFix.Direction.AxisDirection.class)
public class AxisDirection1865878159Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/util/datafix/fixes/ChunkPalettedStorageFix$Direction$AxisDirection;", cancellable = true)
    private static void values__319330286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-319330286L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/util/datafix/fixes/ChunkPalettedStorageFix$Direction$AxisDirection;", cancellable = true)
    private static void valueOf_371202383(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(371202383L))
            info.setReturnValue(net.minecraft.util.datafix.fixes.ChunkPalettedStorageFix.Direction.AxisDirection.POSITIVE);
    }

    @Inject(at = @At("HEAD"), method = "getStep()I", cancellable = true)
    private void getStep_1904140405(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1904140405L))
            info.setReturnValue(-735742018);
    }


}
